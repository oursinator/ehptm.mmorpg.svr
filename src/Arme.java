import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3a78f0d5-2229-49bb-bd89-edbc8f847abb")
public class Arme extends Equipement {
    @objid ("7fe58b4b-7451-4b7a-bb9b-7bf513fcfe7b")
    private int[] maniabilite = new int[2];

    @objid ("3617eaa9-12ff-4030-a2b5-ebb053ffdd9e")
    private int[] impact = new int[2];

    @objid ("37d4bb17-3d6c-427d-af35-b56bdd6041bb")
    private static final String EPEE;

    @objid ("4b0d7c39-d42d-4736-9d1e-cedaed085238")
    private static final String BOUCLIER;

    @objid ("00ae7932-27be-45f0-9d1f-07f0dd3a22bf")
    int[] getManiabilite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.maniabilite;
    }

    @objid ("3f58821a-b3de-47ff-939d-00809a03c444")
    void setManiabilite(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.maniabilite = value;
    }

    @objid ("96c441cc-b741-48e0-95f0-31e13a084276")
    int[] getImpact() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.impact;
    }

    @objid ("ff8592dc-38ac-43a7-b30e-a370b14f08ab")
    void setImpact(int[] value) {
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
