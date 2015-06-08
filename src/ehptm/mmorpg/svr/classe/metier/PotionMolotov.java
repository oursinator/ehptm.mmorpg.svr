package ehptm.mmorpg.svr.classe.metier;
public class PotionMolotov extends Potion {
   
    public static final String MOLOTOV_1 = "molotov niveau 1";
    public static final String MOLOTOV_2 = "molotov niveau 2";
    public static final String MOLOTOV_3 = "Super Molotov";
    
    private int degat;
    private int radius;

    public PotionMolotov(String type){
    	super(type,0);
    	if(type.equals(PotionMolotov.MOLOTOV_1)){
    		super.setPointAction(2);
    		this.degat=1;
        	this.radius=2;
    	}
    	else if(type.equals(PotionMolotov.MOLOTOV_2)){
    		super.setPointAction(3);
    		this.degat=2;
        	this.radius=3;
    	}
    	else if(type.equals(PotionMolotov.MOLOTOV_3)){
    		super.setPointAction(9);
    		this.degat=4;
        	this.radius=5;
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
	public String toString(){
    	return super.toString() + " | degat: "+this.degat+" | rayon: "+this.radius+"]";
    }
	public void utiliser(Personnage perso) throws Exception{
		if(perso.getPointAction()-this.getPointAction()<0)throw new Exception("Pas assez de point d'action..");
		perso.setPointAction(perso.getPointAction()-this.getPointAction());
		int x=-1;
		int y=-1;
		for(int i=0;i<Carte.getGrille().length;i++){
			for(int j=0;j<Carte.getGrille()[0].length;j++){
				if(Carte.getGrille()[i][j]!= null && Carte.getGrille()[i][j] == perso){
					x=i;
					y=j;
				}
			}
		}
		for(int r=1; r<this.radius;r++){
			if(x+r<Carte.getGrille().length && Carte.getGrille()[x+r][y] != null && Carte.getGrille()[x+r][y] instanceof Personnage){
				((Personnage)Carte.getGrille()[x+r][y]).setPointVie(((Personnage)Carte.getGrille()[x+r][y]).getPointVie()-this.degat);
			}
			if(x-r>=0 && Carte.getGrille()[x-r][y] != null && Carte.getGrille()[x-r][y] instanceof Personnage){
				((Personnage)Carte.getGrille()[x-r][y]).setPointVie(((Personnage)Carte.getGrille()[x-r][y]).getPointVie()-this.degat);
			}
			if(y+r<Carte.getGrille()[0].length &&Carte.getGrille()[x][y+r] != null && Carte.getGrille()[x][y+r] instanceof Personnage){
				((Personnage)Carte.getGrille()[x][y+r]).setPointVie(((Personnage)Carte.getGrille()[x][y+r]).getPointVie()-this.degat);
			}
			if(y-r>=0 &&Carte.getGrille()[x][y-r] != null && Carte.getGrille()[x][y-r] instanceof Personnage){
				((Personnage)Carte.getGrille()[x][y-r]).setPointVie(((Personnage)Carte.getGrille()[x][y-r]).getPointVie()-this.degat);
			}
		}
		
		
	}
}
