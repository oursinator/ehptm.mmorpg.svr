import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3a78f0d5-2229-49bb-bd89-edbc8f847abb")
public class Arme extends Equipement {
    @objid ("7fe58b4b-7451-4b7a-bb9b-7bf513fcfe7b")
    private int[] maniabilite = new int[2];

    @objid ("3617eaa9-12ff-4030-a2b5-ebb053ffdd9e")
    private int[] impact = new int[2];

    @objid ("37d4bb17-3d6c-427d-af35-b56bdd6041bb")
    public static final String EPEE = "epee";

    @objid ("4b0d7c39-d42d-4736-9d1e-cedaed085238")
    public static final String BOUCLIER = "bouclier";
    
    
    public Arme(String type,String nom){
    	super(type+" "+nom,new int[2],new int[2]);    	
    	int[] solidite=new int[2];
		int[] encombrement=new int[2];
    	if(type.equals(Arme.EPEE)){
    		solidite[0]=1;
    		solidite[1]=1;
    		encombrement[0]=1;
    		encombrement[1]=1;
    		this.maniabilite[0]=2;
    		this.maniabilite[1]=2;
    		this.impact[0]=2;
    		this.impact[1]=2;
    	}
    	else if(type.equals(Arme.BOUCLIER)){
    		solidite[0]=1;
    		solidite[1]=1;
    		encombrement[0]=1;
    		encombrement[1]=1;
    		this.maniabilite[0]=2;
    		this.maniabilite[1]=2;
    		this.impact[0]=2;
    		this.impact[1]=2;
    	}
    	super.setEncombrement(encombrement);
    	super.setSolidite(solidite);
    }
    
    public Arme(Arme arme){
    	super(arme);
    	this.maniabilite=new int[2];
    	for(i=0;i<this.maniabiltie.lenght && i<arme.getManiabilite().lenght;i++){
    		this.maniabilite[i]=arme.getManiabilite()[î];
    	}
    	this.impact=new int[2];
    	for(i=0;i<this.impact.lenght && i<arme.getImpact().lenght;i++){
    		this.impact[i]=arme.getImpact()[î];
    	}
    }

    @objid ("00ae7932-27be-45f0-9d1f-07f0dd3a22bf")
    public int[] getManiabilite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.maniabilite;
    }

    @objid ("3f58821a-b3de-47ff-939d-00809a03c444")
    public void setManiabilite(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.maniabilite = value;
    }

    @objid ("96c441cc-b741-48e0-95f0-31e13a084276")
    public int[] getImpact() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.impact;
    }

    @objid ("ff8592dc-38ac-43a7-b30e-a370b14f08ab")
    public void setImpact(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.impact = value;
    }

    @objid ("95e3e5d0-23f9-4b70-9784-d700b4af486f")
    public void utiliser() {
    }

    @objid ("e2ad7777-79fc-44e8-923d-02d956bb9fba")
    static String getEPEE() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return EPEE;
    }

    @objid ("0b999271-3981-4f9f-9375-01e57a05df58")
    static String getBOUCLIER() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return BOUCLIER;
    }

}
