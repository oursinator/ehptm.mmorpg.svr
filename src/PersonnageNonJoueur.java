package Classes_m�tiers;

public class PersonnagenonJoueur extends Personnage{
	
	private int niveau;
	private int initiative;
	private int attaque;
	private int esquive;
	private int degats;
	private int defense;
	public PersonnagenonJoueur(int pointVie, int pointAction,Inventaire inventaire, PointPlan position, int niveau,
			int initiative, int attaque, int esquive, int degats, int defense) {
		super(pointVie, pointAction, inventaire, position);
		this.niveau = niveau;
		this.initiative = initiative;
		this.attaque = attaque;
		this.esquive = esquive;
		this.degats = degats;
		this.defense = defense;
	}
	
	public PersonnagenonJoueur()
	{
		super();
		this.niveau = niveau;
		this.initiative = 0;
		this.attaque = 0;
		this.esquive = 0;
		this.degats = 0;
		this.defense = 0;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	public int getAttaque() {
		return attaque;
	}
	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}
	public int getEsquive() {
		return esquive;
	}
	public void setEsquive(int esquive) {
		this.esquive = esquive;
	}
	public int getDegats() {
		return degats;
	}
	public void setDegats(int degats) {
		this.degats = degats;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void attaquer(Personnage cible)
	{
		
	}
	
	public PointPlan getPointPlan()
	{
		return super.getPointPlan();
	}
	
	public void setPointPlan(PointPlan x)
	{
		super.setPointPlan(x);
	}
	public void deplacer(int x, int y)
	{
		
		this.setPointPlan(new PointPlan(x,y));
		
	}
	public int etat()
	{
		if()
	}
	

}
