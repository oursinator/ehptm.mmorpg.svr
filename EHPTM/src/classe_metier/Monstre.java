package classe_metier;

public class Monstre extends PersonnagenonJoueur {

	public Monstre(int pointVie, int pointAction, Inventaire inventaire,
			PointPlan position, int niveau, int initiative, int attaque,
			int esquive, int degats, int defense) {
		super(pointVie, pointAction, inventaire, position, niveau, initiative, attaque,
				esquive, degats, defense);
		// TODO Auto-generated constructor stub
	}
	
	public void dropItem()
	{
		for(int i=0;i<this.getInventaire().getTailleSacADos();i++)
		{
				this.getInventaire().getSacADos()[i]= null;
		}
	}

}