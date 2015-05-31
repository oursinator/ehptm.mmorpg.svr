package ehptm.mmorpg.svr.classe.metier;
public class Item {
	
    private String nom;

    public Item (String nom){
    	this.nom=nom;
    }
    public Item(Item item){
        this.nom=new String(item.getNom());
    }
    
    public void setNom(String value) {
        this.nom = value;
    }

    public String getNom() {
        return this.nom;
    }
    public String toString(){
    	return this.nom;
    }

}
