import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("af298146-5e30-42ae-ac5c-d03c43eb75f2")
public class Item {
    @objid ("04b94f99-9165-4c28-a156-f5e18cc023ed")
    private String nom;

    public Item (String nom){
    	this.nom=nom;
    }
    @objid ("b594cf42-4241-4902-b72f-d83a2d8e2e5d")
    public void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("555b12a8-3efd-48bd-a57f-f60e25c49d11")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }
    public String toString(){
    	return "Nom: "+this.nom;
    }

}
