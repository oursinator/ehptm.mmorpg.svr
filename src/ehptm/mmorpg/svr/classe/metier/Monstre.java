package ehptm.mmorpg.svr.classe.metier;
public class Monstre extends PersonnageNonJoueur {

	public Monstre(int pointVie, int pointAction, Inventaire inventaire, String nom, int niveau, int initiative, int attaque,int esquive, int degats, int defense) {
		super(pointVie, pointAction, inventaire,nom, niveau, initiative, attaque, esquive, degats, defense);
		// TODO Auto-generated constructor stub
	}
	
	public Monstre(Monstre m){
		super(m);
	}
	/*
	public void dropItem()
	{
		for(int i=0;i<this.getInventaire().getTailleSacADos();i++)
		{
				this.getInventaire().getSacADos()[i]= null;
		}
	}*/

}