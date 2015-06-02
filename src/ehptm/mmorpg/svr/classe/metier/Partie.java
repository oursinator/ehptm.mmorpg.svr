package ehptm.mmorpg.svr.classe.metier;
public class Partie {
    
    public static final int NB_MAX_JOUEUR=5;
    public static final int NB_MAX_ITEM=5;
    public static final long PARTIE_COURTE=(120*60)*1000;//7200 *1000
    public static final long PARTIE_LONGUE=(5*60)*1000;//7200 *1000
    private long duree;
    private Carte carte;
    
    public Partie(long duree){//quelque soit le constructeur il faut mettre le type de partie en parametre
    	this.carte= new Carte();
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