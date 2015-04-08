import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("88df0d14-b60e-4bcd-8003-6908770a259f")
public class Potion extends Item {
    @objid ("91347a9e-fd91-422a-bbf5-c24c90894820")
    private int pointAction;
    
    public Potion(String nom, int pointAction){
    	super("Potion "+nom);
    	this.pointAction=pointAction;
    }
    
    @objid ("03bf965b-a77a-460c-a895-959bad3c1c09")
    public int getPointAction() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointAction;
    }

    @objid ("ec7ce16c-76c9-4242-8920-afc3b3404268")
    public void setPointAction(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointAction = value;
    }
    public String toString(){
    	return super.toString() + ", point d'action: "+this.pointAction;
    }

}
