package classe_metier;

public class Personnage {
	

	private int pointVie;
	private int pointAction;
	private Inventaire inventaire;
	private PointPlan position;
	
	public Personnage(int pvMax, int pointVie, int pointAction, Inventaire inventaire,
			PointPlan position) {
		
		this.pointVie = pointVie;
		this.pointAction = pointAction;
		this.inventaire = inventaire;
		this.position = position;
		
	}
	
	public Personnage()
	{
		
		this.pointVie = 6;
		this.pointAction = 5;
		this.inventaire = null;
		this.position = null;
		
	}
	
	public Personnage(Personnage copie){
		
		this.pointVie= copie.pointVie;
		this.pointAction= copie.pointAction;
		this.inventaire= new Inventaire(copie.inventaire);
		this.position= new PointPlan(copie.position);
		
	}
	
	

	public PointPlan getPosition() {
		return position;
	}

	public void setPosition(PointPlan position) {
		this.position = position;
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
	
	public void attaquer(Personnage cible)//methode abstraite
	{
		
	}
	
	public String etat()
	{
		String a= "mort";
		
		if(this.pointVie== 6)
		{
			a="Parfaite sant�";
		}
		
		else if(this.pointVie== 5)
		{
			a= "Blessures superficielles";
		}
		else if(this.pointVie==4)
		{
			a= "L�g�rement bless�";
		}
		else if(this.pointVie== 3)
		{
			a= "Bless�";
		}
		else if(this.pointVie== 2)
		{
			a= "Gravement bless�";
		}
		else if(this.pointVie== 1)
		{
			a= "Inconscient";
		}
		
		return a; // si pointVie egale � 0
	}
	
	public void recuperationPointAction()
	{
		
	}
	public void utiliserItem(Item item)
	{
		
	}
	public void deplacer(int x, int y)
	{
		if(this.position.getX()-1 == x || this.position.getX()+1 == x )
		{
			this.position.setX(x);
		}
		if(this.position.getY()-1 == y || this.position.getY()+1 == y)
		{
			this.position.setY(y);
		}
	}
}