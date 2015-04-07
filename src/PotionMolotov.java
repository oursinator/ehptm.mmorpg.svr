import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eaf03e9b-2a90-4c69-9f2d-edbb0f4fc002")
public class PotionMolotov extends Potion {
    @objid ("b94e3b8a-3b56-46d1-96c9-cc670af47dbf")
    private static final String NOM = Potion molotov;

    @objid ("33cf8695-5e2c-42d1-bf67-230895f8880e")
    private int degat;

    @objid ("950757dc-a913-4edf-a538-8a2c4b5212ec")
    static String getNOM() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return NOM;
    }

    @objid ("c4a86f19-1e59-464c-bb21-f5cebdd8a180")
    int getDegat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.degat;
    }

    @objid ("96c4c36b-eb81-4ca1-b0cc-81df5ad52d02")
    void setDegat(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.degat = value;
    }

}
