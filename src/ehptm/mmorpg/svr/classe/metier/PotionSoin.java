package ehptm.mmorpg.svr.classe.metier;
public class PotionSoin  extends Potion {
	
    public static final String SOIN_1="de soin niveau 1";
    public static final String SOIN_2="de soin niveau 2";

    private int soin;
    
    public PotionSoin(String type){
    	super(type,0);
    	if(type.equals(PotionSoin.SOIN_1)){
    		super.setPointAction(1);
    		this.soin=1;
    	}
    	else if(type.equals(PotionSoin.SOIN_2)){
    		super.setPointAction(2);
    		this.soin=2;
    	}
    }
    public PotionSoin(PotionSoin potion){
    	super(potion);
    	this.soin=potion.getSoin();
    }
    public PotionSoin(String nom,int pa,int soin){
    	super(nom,pa);
    	this.soin=soin;
    }
    
    public int getSoin(){
    	return this.soin;
    }
    public void setSoin(int soin){
    	this.soin=soin;
    }
   
    public void utiliser() {
    }
    
    public String toString(){
    	return super.toString() + " | Soin: "+this.soin+"]";
    }
	@Override
	public void utiliser(Personnage perso) throws Exception{
		if(perso.getPointAction()-this.getPointAction()<0)throw new Exception("Pas assez de point d'action..");
		perso.setPointAction(perso.getPointAction()-this.getPointAction());
		perso.setPointVie(perso.getPointVie()+this.soin);
		
	}

}
