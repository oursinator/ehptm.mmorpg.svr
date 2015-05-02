import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f368d8e5-bb8f-427e-b3d0-161badaae52d")
public class ItemPosition extends Position {
    @objid ("f0d5ef8d-8524-4c48-bf9a-93f573031ea7")
    

    @objid ("98ffc6ac-4829-4120-b930-b6662b003dba")
    private Item item;

    

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
