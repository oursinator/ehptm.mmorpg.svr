package ehptm.mmorpg.svr.classe.metier;
public class PotionMolotov extends Potion {
   
    public static final String MOLOTOV_1 = "molotov 1";
    public static final String MOLOTOV_2 = "molotov 2";
    
    private int degat;
    private int radius;

    public PotionMolotov(String type){
    	super(type,0);
    	if(type.equals(PotionMolotov.MOLOTOV_1)){
    		super.setPointAction(2);
    		this.degat=10;
        	this.radius=1;
    	}
    	else if(type.equals(PotionMolotov.MOLOTOV_2)){
    		super.setPointAction(2);
    		this.degat=10;
        	this.radius=2;
    	}
    }
    public PotionMolotov(PotionMolotov potion){
    	super(potion);
    	this.degat=potion.getDegat();
    	this.radius=potion.getRadius();
    }
    
    public PotionMolotov(String nom,int pa,int degat,int rayon){
    	super(nom,pa);
    	this.degat=degat;
    	this.radius=rayon;
    }
    

    public int getDegat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.degat;
    }

    public void setDegat(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.degat = value;
    }

    public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
    public void utiliser() {
    }

	public String toString(){
    	return super.toString() + " | degat: "+this.degat+" | rayon: "+this.radius+"]";
    }
	public void utiliser(Personnage perso) {
		perso.setPointAction(perso.getPointAction()-this.getPointAction());
		// A completer
		
		
	}
}
