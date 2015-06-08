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
		this.initiative = (int) (10+(10*niveau*0.5));
		this.attaque = (int) (10+(10*niveau*0.5));
		this.esquive = (int)(10+(10*niveau*0.5));
		this.degats = (int)(10*+(10*niveau*0.5));
		this.defense = (int)(10*+(10*niveau*0.5));
	}

	public PersonnageNonJoueur()
	{
		super();
		this.niveau = 1;
		this.initiative = 15;
		this.attaque = 20;
		this.esquive = 10;
		this.degats = 15;
		this.defense = 10;
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
				mess=true;
				cible.setToucher(true);
			}


		}
		return mess;
	}
	
	

	public void recuperationPointAction(Partie partie)
	{
		int degre =((int)this.getInitiative()/3)+(this.getInitiative()%3);
		long endTime = System.currentTimeMillis();
		long dla= this.getStartTime();
		if(endTime-dla>= partie.getDuree())
		{
			this.setPointAction((this.getPointAction()+(degre)/2));
			
			this.setStartTime(System.currentTimeMillis());
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
		for(int i=0; i< Carte.getGrille().length;i++)
		{
			for(int j=0;j<Carte.getGrille()[0].length;j++)
			{
				if(carte.getGrille()[i][j]== this)
				{
					x=i;
					y=j;
				}
			}
		}
		if(x-1>=0 && carte.getGrille()[x-1][y] != null )
		{
			if(carte.getGrille()[x-1][y] instanceof PersonnageJoueur)
			{
				this.attaquer((PersonnageJoueur)carte.getGrille()[x-1][y]);
				fait= true;
			}
		}
		else if(x+1<carte.getGrille().length && carte.getGrille()[x+1][y]!= null)
		{
			if(carte.getGrille()[x+1][y] instanceof PersonnageJoueur)
			{
				this.attaquer((PersonnageJoueur)carte.getGrille()[x+1][y]);
				fait= true;
			}
		}
		else if(y-1>=0 && carte.getGrille()[x][y-1]!= null )
		{
			if(carte.getGrille()[x][y-1] instanceof PersonnageJoueur)
			{
				this.attaquer((PersonnageJoueur)carte.getGrille()[x][y-1]);
				fait= true;
			}
		}
		else if(y+1<carte.getGrille()[0].length && carte.getGrille()[x][y+1]!= null)
		{
			if(carte.getGrille()[x][y+1] instanceof PersonnageJoueur)
			{
				this.attaquer((PersonnageJoueur) carte.getGrille()[x][y+1]);
				fait= true;
			}
		}

		if(fait == false)
		{
			int iH=y;
			int jG=x;
			int iB=y;
			int jD=x;
			while((iH>=0 || jG>=0 || iB<carte.getGrille()[0].length || jD<carte.getGrille().length) && !fait){
				if(jG>=0 && carte.getGrille()[x][jG] != null )
				{
					if(carte.getGrille()[x][jG] instanceof PersonnageJoueur)
					{
						System.out.println("Vu Gauche");
						carte.deplacer(this, 1, -1);
						fait= true;
					}
				}
				else if(jD<carte.getGrille()[0].length && carte.getGrille()[x][jD]!= null)
				{
					if(carte.getGrille()[x][jD] instanceof PersonnageJoueur)
					{
						System.out.println("Vu Droite");
						carte.deplacer(this, 1, 1);
						fait= true;
					}
				}
				else if(iH>=0 && carte.getGrille()[iH][y]!= null )
				{
					if(carte.getGrille()[iH][y] instanceof PersonnageJoueur)
					{
						System.out.println("Vu Haut");
						carte.deplacer(this, -1, 1);
						fait= true;
					}
				}
				else if(iB<carte.getGrille().length && carte.getGrille()[iB][y]!= null)
				{
					if(carte.getGrille()[iB][y] instanceof PersonnageJoueur)
					{
						System.out.println("Vu Bas");
						carte.deplacer(this, -1, -1);
						fait= true;
					}
				}
				iB++;
				iH--;
				jD++;
				jG--;
			}
		}
		if(!fait){
			int queFaire = (int)(Math.random() *10);
			switch(queFaire){
				case 0:carte.deplacer(this, -1, 1);break;
				case 1:carte.deplacer(this, 1, 1);break;
				case 2:carte.deplacer(this, -1, -1);break;
				case 3:carte.deplacer(this, 1, -1);break;
			}
		}
	}
}