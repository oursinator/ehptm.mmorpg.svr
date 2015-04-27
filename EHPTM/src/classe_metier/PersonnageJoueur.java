package classe_metier;

public class PersonnageJoueur extends Personnage {

	private int px;
	private int force;
	private int adresse;
	private int resistance;
	
	public PersonnageJoueur(int pointVie, int pointAction, Inventaire inventaire,
			PointPlan position, int px, int force, int adresse, int resistance) {
		super(pointVie, pointAction, inventaire, position);
		this.px = px;
		this.force = force;
		this.adresse = adresse;
		this.resistance = resistance;
	}
	
	public int getPx() {
		return px;
	}
	public void setPx(int px) {
		this.px = px;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getAdresse() {
		return adresse;
	}
	public void setAdresse(int adresse) {
		this.adresse = adresse;
	}
	public int getResistance() {
		return resistance;
	}
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	
	public int initiative()
	{
		int encombrement=0;
		for(int i=0;i<this.getInventaire().getTailleSacADos();i++)
		{
			if(this.getInventaire().getSacADos()[i] instanceof Equipement)
			{
				encombrement= this.getInventaire().getSacADos()[i].getEncombrement();// il faut mettre une methode getEncombrement abstraite a item sinon erreur de compilation
			
			}
		}
		return this.getAdresse()- encombrement;
	}
	public int attaque()
	{
		int maniabilite=0;
		for(int i=0; i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				maniabilite= maniabilite + this.getInventaire().getArme()[i].getManiabilite()[j];//on additionne toutes les maniabilite de toutes les armes
			}
			
		}
		return this.getAdresse()+ maniabilite;
	}
	public int esquive()
	{
		return this.initiative(); // car meme formule que initiative donc gain de temps
	}
	public int degats()
	{
		return this.getForce()+
	}
	public int defense()
	{
		return
	}
	public void dropItem(Item nom)
	{
		for(int i;i<this.getInventaire().getTailleSacADos();i++)
		{
			if(this.getInventaire().getSacADos()[i].getNom().equalsIgnoreCase(nom))
			{
				this.getInventaire().getSacADos()[i]= null;
			}
		}
	}
}