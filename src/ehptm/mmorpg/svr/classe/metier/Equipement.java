package ehptm.mmorpg.svr.classe.metier;
public class Equipement extends Item {
    
    private int[] solidite = new int[2];

    private int[] encombrement = new int[2];
    
    public Equipement (String nom){
    	super(nom);
    }
    public Equipement(Equipement equipement){
    	super(equipement);
    	this.solidite=new int[equipement.getSolidite().length];
    	for (int i=0;i<equipement.getSolidite().length ;i++){
    		this.solidite[i]=equipement.getSolidite()[i];
    	}
    	this.encombrement=new int[equipement.getSolidite().length];
    	for (int i=0;i<equipement.getSolidite().length;i++){
    		this.encombrement[i]=equipement.getEncombrement()[i];
    	}
    }
    
    public Equipement(String nom,int[] solidite,int[] encombrement) {
		super(nom);
		this.solidite=solidite;
		this.encombrement=encombrement;
	}
    public Equipement(String nom,int degreSolidite,int bonusSolidite,int degreEncombrement, int bonusEncombrement){
    	super(nom);
    	this.solidite[0]=degreSolidite;
    	this.solidite[1]=bonusSolidite;
    	this.encombrement[0]=degreEncombrement;
    	this.encombrement[1]=bonusEncombrement;
    }
    
    public int[] getSolidite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solidite;
    }

    public void setSolidite(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solidite = value;
    }

    public void setEncombrement(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.encombrement = value;
    }

    public int[] getEncombrement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.encombrement;
    }
    public String toString(){
    	return super.toString()+" [solidite: ("+this.solidite[0]+"D+"+this.solidite[1]+") | encombrement: ("+this.encombrement[0]+"D+"+this.encombrement[1]+")";
    }

}
