package ehptm.mmorpg.svr.classe.metier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("685f1a51-0059-483c-ac81-1e87c854b8bd")
public class Equipement extends Item {
    
	@objid ("84b2e4b8-c5ed-4a47-b891-dd6ef99897cc")
    private int[] solidite = new int[2];

    @objid ("8c5780c4-918e-4a3a-b0ad-102f187f29bd")
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
    @objid ("bf68f031-9b42-41d0-a6d0-ed689ba8be78")
    public int[] getSolidite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solidite;
    }

    @objid ("4c8084ea-d407-4646-89fd-c785ce4b3982")
    public void setSolidite(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solidite = value;
    }

    @objid ("73668b2b-9f6d-498a-af1a-8ed72a505c39")
    public void setEncombrement(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.encombrement = value;
    }

    @objid ("d9246665-9cac-4dc1-bfa5-1f6f53194029")
    public int[] getEncombrement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.encombrement;
    }
    public String toString(){
    	return super.toString()+" [solidite: ("+this.solidite[0]+"D+"+this.solidite[1]+") | encombrement: ("+this.encombrement[0]+"D+"+this.encombrement[1]+")";
    }

}
