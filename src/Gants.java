import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("24d62d04-975c-4efa-afde-66914db0fd0d")
public class Gants extends Equipement {
    @objid ("84310ddc-9a26-4511-aefd-23e2ed58a5b3")
    public static final String GANT_CUIR = "cuir";

    @objid ("04c465a5-51f1-43fe-9c51-1405a44d64eb")
    public static final String GANT_BRONZE = "bronze";

    @objid ("bca20c58-6d60-4cb5-a2e8-f56cbf5580a2")
    public static final String GANT_OR = "or";

    public Gants(String type){
    	super("Gants en "+type);
    	int[] solidite=new int[2];
		int[] encombrement=new int[2];
    	switch(type){
	    	case Gants.GANT_CUIR:
	    		solidite[0]=1;solidite[1]=1;
	    		encombrement[0]=0;encombrement[1]=2;
	    		break;
	    	case Gants.GANT_BRONZE:
	    		solidite[0]=1;solidite[1]=3;
	    		encombrement[0]=1;encombrement[1]=1;
	    		break;
	    	case Gants.GANT_OR:
	    		solidite[0]=2;solidite[1]=1;
	    		encombrement[0]=1;encombrement[1]=3;
	    		break;
    	}
    	super.setSolidite(solidite);
		super.setEncombrement(encombrement);
    }
    @objid ("1bf26215-6704-4edf-8bb1-349cb9409808")
    public static String getGANT_CUIR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return GANT_CUIR;
    }

    @objid ("3fc8ceed-0375-4d83-b13f-ba28499c1583")
    public static String getGANT_BRONZE() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return GANT_BRONZE;
    }

    @objid ("bff137f4-d755-4e1f-9b92-561a2b61e9b7")
    public static String getGANT_OR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return GANT_OR;
    }

}
