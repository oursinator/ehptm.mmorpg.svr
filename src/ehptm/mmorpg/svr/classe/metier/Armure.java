package ehptm.mmorpg.svr.classe.metier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a2815e15-375c-4494-9551-3c8535ee22b7")
public class Armure extends Equipement {
    @objid ("52c186d3-e9e3-4eed-b6a0-7a1e4ea89851")
    public static final String ARMURE_CUIR="cuir";

    @objid ("25653cf1-b82b-4df1-a901-06667175fa6f")
    public static final String ARMURE_BRONZE="bronze";

    @objid ("9829e3a1-a91f-4846-a458-05e9892e8da9")
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
