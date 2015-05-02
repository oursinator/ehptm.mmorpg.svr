package classe_metier;

public class Personnage extends Position{
	

	private int pointVie;
	private int pointAction;
	private Inventaire inventaire;
	private PointPlan position;
	private long startTime;
	public Personnage(int pointVie, int pointAction, Inventaire inventaire,
			PointPlan position, String nom) {
		
		super(nom);
		this.pointVie = pointVie;
		this.pointAction = pointAction;
		this.inventaire = inventaire;
		this.position = position;
		this.startTime= System.currentTimeMillis();
	}
	
	public Personnage()
	{
		super();
		this.pointVie = 6;
		this.pointAction = 5;
		this.inventaire = null;
		this.position = null;
		this.startTime = System.currentTimeMillis();
	}
	
	public Personnage(Personnage copie){
		
		this.pointVie= copie.pointVie;
		this.pointAction= copie.pointAction;
		this.inventaire= new Inventaire(copie.getInventaire());//il faut cr�er un constructeur par copie dans inventaire
		this.position= new PointPlan(copie.position);
		this.startTime = System.currentTimeMillis();
	}
	
	

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
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
	
	public void recuperationPointAction()//methode abstraite
	{
		
	}
	public void utiliserItem(Item item)
	{
		//il faut utiliser la m�thode utiliser des items en questions
	}
	
	
	
}
