package ehptm.mmorpg.svr.classe.metier;
public class Partie {
    
    public static final int NB_MAX_JOUEUR=5;
    public static final int NB_MAX_ITEM=25;
    public static final long PARTIE_COURTE=(120*60)*1000;//7200 *1000
    public static final long PARTIE_LONGUE=(5*60)*1000;//7200 *1000
    private long duree;
    private Carte carte;
    
    public Partie(long duree){//quelque soit le constructeur il faut mettre le type de partie en parametre
    	this.carte= new Carte();
    	for(int i=0;i<5;i++){
    		this.carte.ajouter(new PersonnageNonJoueur(10,5,new Inventaire(),"PNG",i));
    		this.carte.ajouter(new Monstre(10,5,new Inventaire(),"Morphus",(i+3)/2));
    	}
    	for(int i=0;i<2;i++){
    		this.carte.ajouter(new PotionSoin(PotionSoin.SOIN_1));
    		this.carte.ajouter(new PotionSoin(PotionSoin.SOIN_2));
    		this.carte.ajouter(new PotionMolotov(PotionMolotov.MOLOTOV_1));
    		this.carte.ajouter(new Arme(Arme.EPEE,"de Morphus"));
    		this.carte.ajouter(new Arme(Arme.BOUCLIER,"legendaire"));
    		this.carte.ajouter(new Armure(Armure.ARMURE_CUIR));
    		this.carte.ajouter(new Gants(Gants.GANT_BRONZE));
    	}
    	int solidite[]={3,5};
		int encombrement[]={5,2};
		int maniabilite[]={4,3};
		int impact[]={6,4};
    	this.carte.ajouter(new Arme("Epee de roi Morphus",solidite,encombrement,maniabilite,impact));
    	this.duree= duree;
    }
    
    public long getDuree() {
		return duree;
	}

	public void setDuree(long duree) {
		this.duree = duree;
	}
	
    public boolean restePersonnageJoueur(){
    	if(this.carte.listePersonnage().isEmpty()){
    		return false;
    	}
    	for(int i=0;i<this.carte.listePersonnage().size();i++){
    		if(this.carte.listePersonnage().get(i) instanceof PersonnageJoueur)
    			return true;
    	}
    	return false;
    }
    public void setCarte(Carte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

    public Carte getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }


    
    public void ajouterElementCarte(Object a) throws Exception{
    	if(this.carte.getNbItem()+1>Partie.NB_MAX_ITEM || this.carte.getNbJoueur()+1>Partie.NB_MAX_JOUEUR) throw new Exception("Nombre d'element atteint !");
    	if(!this.carte.ajouter(a)) throw new Exception("Element existe deja");
    }

    

}