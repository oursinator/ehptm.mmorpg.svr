package ehptm.mmorpg.svr.classe.metier;
public class Armure extends Equipement {
    
    public static final String ARMURE_CUIR="cuir";

  
    public static final String ARMURE_BRONZE="bronze";

   
    public static final String ARMURE_OR="or";

    public Armure(String nom,int[] solidite,int[] encombrement){
    	super(nom,solidite,encombrement);
    }
    
    public Armure(String type){
    	super("Armure en "+type);
    	int[] solidite=new int[2];
    	int[] encombrement= new int[2];
    	switch(type){
	    	case Armure.ARMURE_CUIR:
	    		solidite[0]=0;
	    		solidite[1]=3;
	    		encombrement[0]=1;
	    		encombrement[1]=1;
	    		break;
	    	case Armure.ARMURE_BRONZE:
	    		solidite[0]=1;
	    		solidite[1]=4;
	    		encombrement[0]=2;
	    		encombrement[1]=2;
	    		break;
	    	case Armure.ARMURE_OR:
	    		solidite[0]=2;
	    		solidite[1]=2;
	    		encombrement[0]=3;
	    		encombrement[1]=1;
	    		break;
    	}
    	super.setSolidite(solidite);
		super.setEncombrement(encombrement);
    }
    
    public Armure(Armure armure){
    	super(armure);
    }
    
    public String toString(){
    	return super.toString()+"]";
    }
}
