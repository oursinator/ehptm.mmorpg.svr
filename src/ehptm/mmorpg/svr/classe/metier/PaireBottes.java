package ehptm.mmorpg.svr.classe.metier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cc180a09-76b4-46eb-abe5-19ea8dd720b6")
public class PaireBottes extends Equipement {
    @objid ("732d5af8-4bcc-4c4b-9e32-b84631fd238b")
    public static final String PAIREBOTTES_CUIR = "cuir";

    @objid ("1f346337-f841-484f-9cb7-cca1ab049875")
    public static final String PAIREBOTTES_BRONZE = "bronze";

    @objid ("74368eb0-0dad-4f23-af95-7924b2c43885")
    public static final String PAIREBOTTES_OR = "or";

    public PaireBottes(String nom,int[] solidite,int[] encombrement){
    	super(nom,solidite,encombrement);
    }
    public PaireBottes(String type){
    	super("Chaussure en "+type);
    	int[] solidite=new int[2];
		int[] encombrement=new int[2];
    	switch(type){
    		case PaireBottes.PAIREBOTTES_CUIR:
    			solidite[0]=2;solidite[1]=1;
	    		encombrement[0]=1;encombrement[1]=3;
    			break;
    		case PaireBottes.PAIREBOTTES_BRONZE:
    			solidite[0]=2;solidite[1]=1;
	    		encombrement[0]=1;encombrement[1]=3;
    			break;
    		case PaireBottes.PAIREBOTTES_OR:
    			solidite[0]=2;solidite[1]=1;
	    		encombrement[0]=1;encombrement[1]=3;
    			break;
    	}
    	super.setSolidite(solidite);
    	super.setEncombrement(encombrement);
    }
    public PaireBottes(PaireBottes paireBottes){
    	super(paireBottes);
    }
    
    public String toString(){
    	return super.toString()+"]";
    }
}
