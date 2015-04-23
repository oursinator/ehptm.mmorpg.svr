package Classes_métiers;

public class Personnage {

	private int pointVie;
	private int pointAction;
	private Inventaire inventaire;
	private PointPlan position;
	
	public Personnage(int pointVie, int pointAction, Inventaire inventaire,
			PointPlan position) {
		
		this.pointVie = pointVie;
		this.pointAction = pointAction;
		this.inventaire = inventaire;
		this.position = position;
	}
	
	public Personnage()
	{
		
		this.pointVie = 10;
		this.pointAction = 5;
		this.inventaire = null;
		this.position = null;
		
	}
	
	public Personnage(Personnage copie){
		Personnage a= new Personnage();
		a.pointVie= copie.pointVie;
		a.pointAction= copie.pointAction;
		a.inventaire= new Inventaire(copie.inventaire);
		a.position= new PointPlan(copie.position);
		
	}
	
	public int getPointVie() {
		return pointVie;
	}
	public void setPointVie(int pointVie) {
		this.pointVie = pointVie;
	}
	public int getPointAction() {
		return pointAction;
	}
	public void setPointAction(int pointAction) {
		this.pointAction = pointAction;
	}
	public Inventaire getInventaire() {
		return inventaire;
	}
	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}
	public PointPlan getPointPlan() {
		return position;
	}
	public void setPointPlan(PointPlan position) {
		this.position = position;
	}
	
	/*public void attaquer(Personnage cible)
	{
		cible.setPointVie(cible.getPointVie()-);
	}
	*/
}
