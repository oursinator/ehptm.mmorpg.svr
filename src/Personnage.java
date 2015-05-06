public class Personnage{
	

	private int pointVie;
	private int pointAction;
	private Inventaire inventaire;
	private long startTime;
	private String nom;
	public Personnage(int pointVie, int pointAction, Inventaire inventaire,
			String nom) {
		this.setNom(nom);
		this.pointVie = pointVie;
		this.pointAction = pointAction;
		this.inventaire = inventaire;
		this.startTime= System.currentTimeMillis();
	}
	
	public Personnage()
	{
		super();
		this.pointVie = 6;
		this.pointAction = 5;
		this.inventaire = null;
		this.startTime = System.currentTimeMillis();
	}
	
	public Personnage(Personnage copie){
		
		this.pointVie= copie.pointVie;
		this.pointAction= copie.pointAction;
		this.inventaire= new Inventaire(copie.getInventaire());//il faut créer un constructeur par copie dans inventaire
		this.startTime = System.currentTimeMillis();
	}
	
	

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
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
	
	
	
	
	public String etat()
	{
		String a= "mort";
		
		if(this.pointVie== 6)
		{
			a="Parfaite santé";
		}
		
		else if(this.pointVie== 5)
		{
			a= "Blessures superficielles";
		}
		else if(this.pointVie==4)
		{
			a= "Légèrement blessé";
		}
		else if(this.pointVie== 3)
		{
			a= "Blessé";
		}
		else if(this.pointVie== 2)
		{
			a= "Gravement blessé";
		}
		else if(this.pointVie== 1)
		{
			a= "Inconscient";
		}
		
		return a; // si pointVie egale à 0
	}
	
	public void recuperationPointAction()//methode abstraite
	{
		
	}
	public void utiliserItem(Item item)
	{
		//il faut utiliser la méthode utiliser des items en questions
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	
	
}