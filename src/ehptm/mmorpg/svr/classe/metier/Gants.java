package ehptm.mmorpg.svr.classe.metier;
public class Gants extends Equipement {
	
    public static final String GANT_CUIR = "cuir";

    public static final String GANT_BRONZE = "bronze";

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
