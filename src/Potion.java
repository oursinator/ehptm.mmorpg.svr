import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("88df0d14-b60e-4bcd-8003-6908770a259f")
public abstract class Potion extends Item {
    @objid ("91347a9e-fd91-422a-bbf5-c24c90894820")
    private int PointAction;

    @objid ("14028ea5-11d3-4538-ba61-142790f5dc9b")
    public abstract void utiliser();

    @objid ("03bf965b-a77a-460c-a895-959bad3c1c09")
    int getPointAction() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PointAction;
    }

    @objid ("ec7ce16c-76c9-4242-8920-afc3b3404268")
    void setPointAction(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PointAction = value;
    }

}
