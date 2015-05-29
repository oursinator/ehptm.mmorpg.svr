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

	public static int getNbMaxJoueur() {
		return NB_MAX_JOUEUR;
	}

	public static int getNbMaxItem() {
		return NB_MAX_ITEM;
	}

	public static long getPartieCourte() {
		return PARTIE_COURTE;
	}

	public static long getPartieLongue() {
		return PARTIE_LONGUE;
	}
	
    
    void setCarte(Carte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

    Carte getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    static int getNB_MAX_JOUEUR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return NB_MAX_JOUEUR;
    }

    
    public void ajouterElementCarte(Object a) throws Exception{
    	if(this.carte.getNbItem()+1>Partie.NB_MAX_ITEM || this.carte.getNbJoueur()+1>Partie.NB_MAX_JOUEUR) throw new Exception("Nombre d'element atteint !");
    	if(!this.carte.ajouter(a)) throw new Exception("Element existe deja");
    }

    

}