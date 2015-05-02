//import com.modeliosoft.modelio.javadesigner.annotations.objid;
package classe_metier;

//@objid ("af298146-5e30-42ae-ac5c-d03c43eb75f2")
public class Item extends Position{
   // @objid ("04b94f99-9165-4c28-a156-f5e18cc023ed")
    

    public Item (String nom){
    	
    	super(nom);
    }
    public Item(Item item){
        super.setNom(item.getNom());
    }
   // @objid ("b594cf42-4241-4902-b72f-d83a2d8e2e5d")
    
    public String toString(){
    	return "Nom: "+this.nom;
    }

}
