import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f368d8e5-bb8f-427e-b3d0-161badaae52d")
public class ItemPosition {
    @objid ("f0d5ef8d-8524-4c48-bf9a-93f573031ea7")
    private PointPlan pointPlan;

    @objid ("98ffc6ac-4829-4120-b930-b6662b003dba")
    private Item item;

    @objid ("867bfc03-3ed1-4df5-ba88-d17c8f4fca76")
    PointPlan getPointPlan() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointPlan;
    }

    @objid ("e866afc2-36c8-4e6e-89e5-c9fd8a993707")
    void setPointPlan(PointPlan value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointPlan = value;
    }

    @objid ("f7364349-6be1-4968-a484-a827b579bc0e")
    Item getItem() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.item;
    }

    @objid ("a4c65cff-12ce-4fa2-b61f-e99906e417b3")
    void setItem(Item value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.item = value;
    }

}
