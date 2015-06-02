package ehptm.mmorpg.svr.classe.metier;
public class PersonnageNonJoueur extends Personnage {

	private int niveau;
	private int initiative;
	private int attaque;
	private int esquive;
	private int degats;
	private int defense;
	public PersonnageNonJoueur(int pointVie, int pointAction,Inventaire inventaire, String nom,int niveau) {
		super(pointVie, pointAction, inventaire, nom);
		this.niveau = niveau;
		this.initiative = (int) (53+(53*niveau*0.5));
		this.attaque = (int) (53+(53*niveau*0.5));
		this.esquive = (int)(53+(53*niveau*0.5));
		this.degats = (int)(53*+(53*niveau*0.5));
		this.defense = (int)(53*+(53*niveau*0.5));
	}

	public PersonnageNonJoueur()
	{
		super();
		this.niveau = 1;
		this.initiative = 53;
		this.attaque = 53;
		this.esquive = 53;
		this.degats = 53;
		this.defense = 53;
	}

	public PersonnageNonJoueur(PersonnageNonJoueur a)
	{
		super((Personnage) a);
		this.niveau = a.getNiveau();
		this.initiative = a.getInitiative();
		this.attaque = a.getAttaque();
		this.esquive = a.getEsquive();
		this.degats = a.getDegats();
		this.defense = a.getDefense();
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

	public boolean attaquer(PersonnageJoueur cible)
	{
		boolean mess= false;
		if(this.getPointAction()>=3)
		{
			this.setPointAction(this.getPointAction()-3);	

			int somme2=0;
			for(int i=0;i<cible.esquive()[0];i++)
			{
				int a= (int)((Math.random()*(7-1))+1);
				somme2 += a;
			}
			somme2 += cible.esquive()[1];
			if(this.getAttaque()> somme2)
			{
				int def=0;
				for(int i=0;i<cible.defense()[0];i++)
				{
					int a= (int)((Math.random()*(7-1))+1);
					def += a;
				}
				def += cible.defense()[1];
				int difference= this.getDegats()- def;
				int pvPerdu= (int) difference/3;
				cible.setPointVie(cible.getPointVie()- pvPerdu);
				mess=false;
			}


		}
		return mess;
	}



	/*public void dropItem()
	{
		for(int i=0;i<this.getInventaire().getTailleSacADos();i++)
		{

				this.getInventaire().getSacADos()[i]= null;

		}
	}*/


	public void recuperationPointAction(Partie partie)
	{
		int degre =((int)this.getInitiative()/3)+(this.getInitiative()%3);
		long endTime = System.currentTimeMillis();
		long dla= this.getStartTime();
		if(endTime-dla>= partie.getDuree())
		{

			this.setPointAction((int)(degre*0.5));
			if(this.getPointAction()>6)
			{
				this.setPointAction(6);
			}
		}

	}

	public String toString()
	{
		String a= super.toString();
		a= a+" est de niveau "+this.niveau+" avec une initiative de "+this.initiative +" possede une force d'attaque de "+ this.attaque + " et une esquive de "+ this.esquive+ " et peut faire "+this.degats+ " points de dégats";
		return a;
	}

	public void ia(Carte carte)
	{
		boolean fait= false;
		int x=0;
		int y=0;
		for(int i=0; i< Carte.TAILLE_GRILLE;i++)
		{
			for(int j=0;j<Carte.TAILLE_GRILLE;j++)
			{
				if(carte.getGrille()[i][j]== this)
				{
					x=i;
					y=j;

				}
			}
		}
		for(int i=0; i< Carte.TAILLE_GRILLE;i++)
		{
			for(int j=0;j<Carte.TAILLE_GRILLE;j++)
			{
				if(carte.getGrille()[x-1][y] != null )
				{
					if(carte.getGrille()[x-1][y] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x-1][y];
						this.attaquer(a);
						fait= true;
					}

				}
				else if(carte.getGrille()[x+1][y]!= null)
				{
					if(carte.getGrille()[x+1][y] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x+1][y];
						this.attaquer(a);
						fait= true;
					}
				}
				else if(carte.getGrille()[x][y-j]!= null )
				{
					if(carte.getGrille()[x][y-j] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x][y-1];
						this.attaquer(a);
						fait= true;
					}
				}
				else if(carte.getGrille()[x][y+1]!= null)
				{
					if(carte.getGrille()[x][y+1] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x][y+1];
						this.attaquer(a);
						fait= true;
					}
				}
			}
		}

		if(fait == false)
		{
			int compteur=0;
			int j=0;
			int i=0;
			while(j<x && i<y && fait == false)
			{
				if(carte.getGrille()[x-j][y] != null )
				{
					if(carte.getGrille()[x-j][y] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x-j][y];
						while(compteur<j)
						{
							carte.deplacer(this, 1, -1);
							fait= true;
						}
						
					}

				}
				else if(carte.getGrille()[x+j][y]!= null)
				{
					if(carte.getGrille()[x+j][y] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x+j][y];
						while(compteur <j)
						{
							carte.deplacer(this, 1, 1);
							fait= true;
						}
						
					}
				}
				else if(carte.getGrille()[x][y-i]!= null )
				{
					if(carte.getGrille()[x][y-i] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x][y-i];
						while(compteur <i)
						{
							carte.deplacer(this, -1, -1);
							fait= true;
						}
						
					}
				}
				else if(carte.getGrille()[x][y+i]!= null)
				{
					if(carte.getGrille()[x][y+i] instanceof PersonnageJoueur)
					{
						PersonnageJoueur a= (PersonnageJoueur) carte.getGrille()[x][y+i];
						while(compteur <i)
						{
							carte.deplacer(this, -1, 1);
							fait= true;
						}
						
					}
				}
				i++;
				j++;
			}
		}
		



	}
}