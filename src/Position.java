package classe_metier;

public class Position {

	private String nom;

	public Position()
	{
		this.nom= "default";
	}
	
	public Position(String nom) {
		super();
		this.nom = nom;
	}

	public Position(Position a)
	{
		this.nom= a.getNom();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
