package Classes_métiers;

public class Carte {
	private String nom;
	private ItemPosition tab[];
	private PointPlan murs[];
	private Personnage collection[];
	
	
	
	

	public Carte(String nom, ItemPosition[] tab, PointPlan[] murs,
			Personnage[] collection) {
		super();
		this.nom = nom;
		this.tab = tab;
		this.murs = murs;
		this.collection = collection;
	}

	public ItemPosition[] getTab() {
		return tab;
	}

	public void setTab(ItemPosition[] tab) {
		this.tab = tab;
	}

	public PointPlan[] getMurs() {
		return murs;
	}

	public void setMurs(PointPlan[] murs) {
		this.murs = murs;
	}

	public Personnage[] getCollection() {
		return collection;
	}

	public void setCollection(Personnage[] collection) {
		this.collection = collection;
	}

	public Carte(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
