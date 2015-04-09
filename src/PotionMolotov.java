import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eaf03e9b-2a90-4c69-9f2d-edbb0f4fc002")
public class PotionMolotov extends Potion {
    @objid ("b94e3b8a-3b56-46d1-96c9-cc670af47dbf")
    public static final String MOLOTOV_1 = "molotov 1";
    public static final String MOLOTOV_2 = "molotov 2";
    @objid ("d3efbd6e-ae19-4767-ade4-fbc41120b75f")
    private int degat;
    private int radius;

    public PotionMolotov(String type){
    	super(type,0);
    	if(type.equals(PotionMolotov.MOLOTOV_1)){
    		super.setPointAction(2);
    		this.degat=10;
        	this.radius=1;
    	}
    	else if(type.equals(PotionMolotov.MOLOTOV_2)){
    		super.setPointAction(2);
    		this.degat=10;
        	this.radius=2;
    	}
    }
    public PotionMolotov(PotionMolotov potion){
    	super(potion);
    	this.degat=potion.getDegat();
    	this.radius=potion.getRadius();
    }
    
    @objid ("950757dc-a913-4edf-a538-8a2c4b5212ec")
    public static String getMOLOTOV_1() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return MOLOTOV_1;
    }
    public static String getMOLOTOV_2() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return MOLOTOV_2;
    }

    @objid ("359b6437-47d4-4408-909b-800a960226a3")
    public int getDegat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.degat;
    }

    @objid ("b299bea1-909a-4acf-917d-0c1c54411610")
    public void setDegat(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.degat = value;
    }

    public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@objid ("5457125c-ef34-4ca8-b44d-11a88a5872a5")
    public void utiliser() {
    }

	public String toString(){
    	return super.toString() + ", degat: "+this.degat+", rayon: "+this.radius;
    }
}
