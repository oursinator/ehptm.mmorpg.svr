import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("685f1a51-0059-483c-ac81-1e87c854b8bd")
public class Equipement extends Item {
    @objid ("84b2e4b8-c5ed-4a47-b891-dd6ef99897cc")
    private int[] solidite = 0;

    @objid ("8c5780c4-918e-4a3a-b0ad-102f187f29bd")
    private int[] encombrement = new int[2];

    @objid ("bf68f031-9b42-41d0-a6d0-ed689ba8be78")
    int[] getSolidite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solidite;
    }

    @objid ("4c8084ea-d407-4646-89fd-c785ce4b3982")
    void setSolidite(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solidite = value;
    }

    @objid ("73668b2b-9f6d-498a-af1a-8ed72a505c39")
    void setEncombrement(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.encombrement = value;
    }

    @objid ("d9246665-9cac-4dc1-bfa5-1f6f53194029")
    int[] getEncombrement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.encombrement;
    }

}
