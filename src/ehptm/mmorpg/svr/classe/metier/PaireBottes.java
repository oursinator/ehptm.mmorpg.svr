package ehptm.mmorpg.svr.classe.metier;
public class PaireBottes extends Equipement {
	
    public static final String PAIREBOTTES_CUIR = "cuir";

    public static final String PAIREBOTTES_BRONZE = "bronze";

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
