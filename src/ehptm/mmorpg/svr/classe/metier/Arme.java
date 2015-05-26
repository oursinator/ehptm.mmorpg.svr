package ehptm.mmorpg.svr.classe.metier;

public class Arme extends Equipement {
    private int[] maniabilite = new int[2];

    private int[] impact = new int[2];

    public static final String EPEE = "epee";

    public static final String BOUCLIER = "bouclier";
    
    
    public Arme(String type,String nom){
    	super(type+" "+nom);    	
    	int[] solidite=new int[2];
		int[] encombrement=new int[2];
		switch(type){
			case Arme.EPEE:
				solidite[0]=1;
	    		solidite[1]=1;
	    		encombrement[0]=1;
	    		encombrement[1]=1;
	    		this.maniabilite[0]=2;
	    		this.maniabilite[1]=2;
	    		this.impact[0]=2;
	    		this.impact[1]=2;
				break;
			case Arme.BOUCLIER:
				solidite[0]=1;
	    		solidite[1]=1;
	    		encombrement[0]=1;
	    		encombrement[1]=1;
	    		this.maniabilite[0]=2;
	    		this.maniabilite[1]=2;
	    		this.impact[0]=2;
	    		this.impact[1]=2;
				break;
		}
		super.setEncombrement(encombrement);
    	super.setSolidite(solidite);
    }
    
    public Arme(Arme arme){
    	super(arme);
    	this.maniabilite=new int[arme.getManiabilite().length];
    	for(int i=0;i<arme.getManiabilite().length;i++){
    		this.maniabilite[i]=arme.getManiabilite()[i];
    	}
    	this.impact=new int[arme.getImpact().length];
    	for(int i=0;i<arme.getImpact().length;i++){
    		this.impact[i]=arme.getImpact()[i];
    	}
    }
    
    public Arme(String nom,int [] solidite,int[] encombrement,int[] maniabilite,int[] impact){
    	super(nom,solidite,encombrement);
    	this.maniabilite=maniabilite;
    	this.impact=impact;
    }

    public int[] getManiabilite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.maniabilite;
    }

    public void setManiabilite(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.maniabilite = value;
    }

    public int[] getImpact() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.impact;
    }

    public void setImpact(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.impact = value;
    }

    public void utiliser() {
    }
    
    public String toString(){
    	return super.toString()+" | maniabilite: ("+this.maniabilite[0]+"D+"+this.maniabilite[1]+")"+" | impact: ("+this.impact[0]+"D+"+this.impact[1]+")"+"]";
    }

}
