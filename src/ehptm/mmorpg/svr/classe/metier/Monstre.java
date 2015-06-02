package ehptm.mmorpg.svr.classe.metier;
public class Monstre extends PersonnageNonJoueur {

	public Monstre(int pointVie, int pointAction, Inventaire inventaire, String nom, int niveau) {
		super(pointVie, pointAction, inventaire,nom, niveau);
		// TODO Auto-generated constructor stub
	}
	
	public Monstre(Monstre m){
		super(m);
	}
	
	public Inventaire dropItem()
	{
		Inventaire a=null;
		if(this.getPointVie()==0)
		{
			a= this.getInventaire();
			this.setInventaire(new Inventaire());
			
			/*for(int i=0;i<this.getInventaire().getTailleSacADos();i++)
			{
					this.getInventaire().getSacADos()[i]= null;
			}
			
			 this.getInventaire().setArmure(null);
			

			for(int i=0;i<this.getInventaire().getTailleSacADos();i++)
			{
				 this.getInventaire().setArme(new Arme[2]);
			}
			
				this.getInventaire().setPaireBottes(null);
			
				this.getInventaire().setGants(null);*/
			
		}
		return a;
	}

}