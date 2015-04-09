import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cc180a09-76b4-46eb-abe5-19ea8dd720b6")
public class PaireBottes extends Equipement {
    @objid ("732d5af8-4bcc-4c4b-9e32-b84631fd238b")
    public static final String PAIREBOTTES_CUIR = "cuir";

    @objid ("1f346337-f841-484f-9cb7-cca1ab049875")
    public static final String PAIREBOTTES_BRONZE = "bronze";

    @objid ("74368eb0-0dad-4f23-af95-7924b2c43885")
    public static final String PAIREBOTTES_OR = "or";

    public PaireBottes(String type){
    	super("chaussure en "+type);
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
    }
    
    public PaireBottes(PaireBottes paireBottes){
    	super(paireBottes);
    }
    @objid ("fdc95be2-110d-4c28-85ca-7adf96cdf742")
    public String getPAIREBOTTES_CUIR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return PAIREBOTTES_CUIR;
    }

    @objid ("eb9422aa-e9aa-40a2-bbef-c6a6590ff88f")
    public static String getPAIREBOTTES_BRONZE() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return PAIREBOTTES_BRONZE;
    }

    @objid ("a14460e4-5e1e-494d-8b96-577bebbaec3f")
    public static String getPAIREBOTTES_OR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return PAIREBOTTES_OR;
    }

}
