package Classes_métiers;

public class PersonnageJoueur extends Personnage {

	private int px;
	private int force;
	private int adresse;
	private int resistance;
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
	public PersonnageJoueur(int pointVie, int pointAction, Inventaire inventaire,
			PointPlan position, int px, int force, int adresse, int resistance) {
		super(pointVie, pointAction, inventaire, position);
		this.px = px;
		this.force = force;
		this.adresse = adresse;
		this.resistance = resistance;
	}
	
}
