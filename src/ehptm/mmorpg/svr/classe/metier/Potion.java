package ehptm.mmorpg.svr.classe.metier;


public abstract class Potion extends Item {
  
    private int pointAction;
    
    public Potion(String nom, int pointAction){
    	super("Potion "+nom);
    	this.pointAction=pointAction;
    }
    
    public Potion(Potion potion){
        super(potion);
        this.pointAction=potion.getPointAction();
    }
    
    public int getPointAction() {
        return this.pointAction;
    }
    
    public abstract void utiliser(Personnage perso) throws Exception;

    
    public void setPointAction(int value) {
        this.pointAction = value;
    }
    public String toString(){
    	return super.toString() + " [Point d'action: "+this.pointAction;
    }

}
