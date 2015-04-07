import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7f0f513f-b7d3-482a-8363-26f22f66bb86")
public class PotionSoin extends Potion {
    @objid ("c1c189ba-7316-497d-932e-98edb4325a78")
    private static final String NOM;

    @objid ("2e3092d0-87f0-4843-bbe5-17284a74f50d")
    private int soin;

    @objid ("0b2dc258-117e-429d-b778-80f5eabd4536")
    static String getNOM() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return NOM;
    }

    @objid ("3401cc03-8419-4679-aa9c-55cf52100fb4")
    int getSoin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.soin;
    }

    @objid ("e3d55c7a-3a8e-43df-83dc-11c9042751b3")
    void setSoin(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.soin = value;
    }

}
