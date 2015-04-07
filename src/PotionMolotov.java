import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eaf03e9b-2a90-4c69-9f2d-edbb0f4fc002")
public class PotionMolotov extends Potion {
    @objid ("b94e3b8a-3b56-46d1-96c9-cc670af47dbf")
    private static final String NOM = "molotov";

    @objid ("d3efbd6e-ae19-4767-ade4-fbc41120b75f")
    private int degat;

    @objid ("950757dc-a913-4edf-a538-8a2c4b5212ec")
    private static String getNOM() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return NOM;
    }

    @objid ("359b6437-47d4-4408-909b-800a960226a3")
    int getDegat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.degat;
    }

    @objid ("b299bea1-909a-4acf-917d-0c1c54411610")
    void setDegat(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.degat = value;
    }

    @objid ("5457125c-ef34-4ca8-b44d-11a88a5872a5")
    public void utiliser() {
    }

}
