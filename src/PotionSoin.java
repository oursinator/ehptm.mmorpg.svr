import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7f0f513f-b7d3-482a-8363-26f22f66bb86")
public class PotionSoin  extends Potion {
    @objid ("c1c189ba-7316-497d-932e-98edb4325a78")
    public static final String SOIN_1="soin 1";
    public static final String SOIN_2="soin 2";

    @objid ("73a3882c-21e3-4563-8930-f3b8986b321d")
    private int soin;
    
    public PotionSoin(String type){
    	super(type,0);
    	if(type.equals(PotionSoin.SOIN_1)){
    		super.setPointAction(2);
    		this.soin=10;
    	}
    	else if(type.equals(PotionSoin.SOIN_2)){
    		super.setPointAction(2);
    		this.soin=20;
    	}
    	
    }
    @objid ("0b2dc258-117e-429d-b778-80f5eabd4536")
    public static String getSOIN_1() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return SOIN_1;
    }
    public static String getSOIN_2() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return SOIN_2;
    }

    @objid ("5da7a707-c077-4863-9ff9-881ba4c45f4f")
    public void utiliser() {
    }
    
    public String toString(){
    	return super.toString() + ", soin: "+this.soin;
    }

}
