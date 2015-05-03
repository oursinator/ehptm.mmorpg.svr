import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("24d62d04-975c-4efa-afde-66914db0fd0d")
public class Gants extends Equipement {
    @objid ("84310ddc-9a26-4511-aefd-23e2ed58a5b3")
    public static final String GANT_CUIR = "cuir";

    @objid ("04c465a5-51f1-43fe-9c51-1405a44d64eb")
    public static final String GANT_BRONZE = "bronze";

    @objid ("bca20c58-6d60-4cb5-a2e8-f56cbf5580a2")
    public static final String GANT_OR = "or";

    public Gants(String nom,int[] solidite,int[] encombrement){
    	super(nom,solidite,encombrement);
    }
    
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
    public Gants(Gants gants){
    	super(gants);
    }
    
    public String toString(){
    	return super.toString()+"]";
    }
}
