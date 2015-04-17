import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a2815e15-375c-4494-9551-3c8535ee22b7")
public class Armure extends Equipement {
    @objid ("52c186d3-e9e3-4eed-b6a0-7a1e4ea89851")
    public static final String ARMURE_CUIR="cuir";

    @objid ("25653cf1-b82b-4df1-a901-06667175fa6f")
    public static final String ARMURE_BRONZE="bronze";

    @objid ("9829e3a1-a91f-4846-a458-05e9892e8da9")
    public static final String ARMURE_OR="or";

    public Armure(String type){
    	super("Armure en "+type);
    	int[] solidite=new int[2];
    	int[] encombrement= new int[2];
    	switch(type){
    	case Armure.ARMURE_CUIR:
    		solidite[0]=1;
    		solidite[1]=0;
    		encombrement[0]=1;
    		encombrement[1]=1;
    		break;
    	case Armure.ARMURE_BRONZE:
    		solidite[0]=1;
    		solidite[1]=0;
    		encombrement[0]=1;
    		encombrement[1]=1;
    		break;
    	case Armure.ARMURE_OR:
    		solidite[0]=1;
    		solidite[1]=0;
    		encombrement[0]=1;
    		encombrement[1]=1;
    		break;
    	}
    	super.setSolidite(solidite);
		super.setEncombrement(encombrement);
    }
    
    public Armure(Armure armure){
    	super(armure);
    }
    
    
    @objid ("4d967e13-5f01-4ed2-9cbb-9c6179704eb7")
    public static String getARMURE_CUIR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return ARMURE_CUIR;
    }

    @objid ("14f1cd40-445a-4e8f-861a-5e0e59c4caf4")
    public static String getARMURE_BRONZE() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return ARMURE_BRONZE;
    }

    @objid ("24bfb090-941f-40da-acd7-05ae0d05310a")
    public static String getARMURE_OR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return ARMURE_OR;
    }
    public String toString(){
    	return super.toString();
    }

}
