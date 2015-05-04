public class Carte {
	
	private Object grille[][]; 
	private String nom;
	public static final int NB_MURS= 5;
	public static final int TAILLE_GRILLE=(int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS);
	
	

	public Carte(Object grille[][], String nom) {
		this.grille= grille;
		this.nom= nom;
	}
	
	

	public Carte() {
		this.nom = "Default_map";
		this.grille= new Object[Carte.TAILLE_GRILLE][Carte.TAILLE_GRILLE];
		for(int i=0; i<grille.length;i++){
			grille[i][0]=new Object();
			grille[i][grille[0].length-1]=new Object();
			
		}
		for(int j=0;j<grille[0].length;j++){
			grille[0][j]=new Object();
			grille[grille.length-1][j]=new Object();
		}
		for(int i=0;i< Carte.NB_MURS;i++)
		{
			for(int j=0; j<Carte.TAILLE_GRILLE;j++)
			{
				for(int x=0;x<Carte.TAILLE_GRILLE;x++)
				{
					if(this.grille[j][x] != null)
					{
						int a= (int)(Math.random() *(Carte.TAILLE_GRILLE-1));
						int b= (int)(Math.random() *(Carte.TAILLE_GRILLE-1));
						while(this.collision(a, b))
						{
							a= (int)(Math.random() *(Carte.TAILLE_GRILLE-1));
							b= (int)(Math.random() *(Carte.TAILLE_GRILLE-1));
						}
						this.getGrille()[a][b]= new Object();
					}
				}
			}
			
			
		}
	}

	public Carte(Carte a)
	{
		this.nom= new String(a.getNom());
		this.grille= new Object[a.getGrille().length][a.getGrille()[0].length];
		for(int i=0; i<this.grille.length;i++)
		{
			for(int j=0;j< this.grille[0].length; i++)
			{
				if( this.getGrille()[i][j] instanceof Item)
					this.getGrille()[i][j]=new Item((Item)this.getGrille()[i][j]);
				else if (this.getGrille()[i][j] instanceof PersonnageJoueur)
					this.getGrille()[i][j]=new PersonnageJoueur((PersonnageJoueur)this.getGrille()[i][j]);
				else if (this.getGrille()[i][j] instanceof Monstre)
					this.getGrille()[i][j]=new Monstre((Monstre)this.getGrille()[i][j]);
				else if(this.getGrille()[i][j] instanceof PersonnageNonJoueur)
					this.getGrille()[i][j]=new PersonnageNonJoueur((PersonnageNonJoueur)this.getGrille()[i][j]);
				else
					this.getGrille()[i][j]= new Object();
			}
			
		}
		
	}

	public static int getNbMurs() {
		return NB_MURS;
	}



	public Object[][] getGrille() {
		return grille;
	}



	public void setGrille(Object[][] grille) {
		this.grille = grille;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public boolean collision(int a, int b)
	{
		if(this.getGrille()[a][b] != null)
			return true; //il y a collision
		
		return false;
	}
	
	
	//##############################
	//A modifier !
	
//	public void deplacer(Personnage a)
//	{
//		int taille= (int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS);
//		for(int i=0;i<taille;i++)
//		{
//			for(int j=0;j<taille;j++)
//			{
//				if(this.getGrille()[i][j].equals(a))
//				{
//					Scanner input= new Scanner(System.in);
//					System.out.println("voulez-vous vous déplacer verticalement ou horizontalement? Tapez 1 pour la verticale et 2 pour l'horizontale.");
//					int b= input.nextInt();
//					while(b!=1 || b!=2)
//					{
//						System.out.println("voulez-vous vous déplacer verticalement ou horizontalement? Tapez 1 pour la verticale et 2 pour l'horizontale.");
//						b= input.nextInt();
//					}
//					if(b==1)
//					{
//						System.out.println("Tapez 1 pour monter ou 2 pour descendre.");
//						int c= input.nextInt();
//						while(c!=1 || c!=2)
//						{
//							System.out.println("Tapez 1 pour monter ou 2 pour descendre.");
//							c= input.nextInt();
//						}
//						try
//						{
//							if(c==1)
//							{
//								if(this.getGrille()[i-1][j] !=null)
//									this.getGrille()[i-1][j]=a;
//									
//							}
//						}
//						catch(IndexOutOfBoundsException e)
//						{
//							System.out.println("Vous ne pouvez pas monter plus haut.");
//						}
//						try
//						{
//							if(c==2)
//							{
//								if(this.getGrille()[i-1][j] !=null)
//									this.getGrille()[i-1][j]=a;
//							}
//						}
//						catch(IndexOutOfBoundsException e)
//						{
//							System.out.println("Vous ne pouvez pas descendre plus bas.");
//						}
//					}
//					else
//					{
//						System.out.println("Tapez 1 pour aller à droite ou 2 pour aller à gauche.");
//						int c= input.nextInt();
//						while(c!=1 || c!=2)
//						{
//							System.out.println("Tapez 1 pour aller à droite ou 2 pour aller à gauche.");
//							c= input.nextInt();
//						}
//						try
//						{
//							if(c==1)
//							{
//								if(this.getGrille()[i][j+1] !=null)
//									this.getGrille()[i][j+1]=a;
//									
//							}
//						}
//						catch(IndexOutOfBoundsException e)
//						{
//							System.out.println("Vous ne pouvez pas aller plus à droite.");
//						}
//						try
//						{
//							if(c==2)
//							{
//								if(this.getGrille()[i][j-1] !=null)
//									this.getGrille()[i][j-1]=a;
//							}
//						}
//						catch(IndexOutOfBoundsException e)
//						{
//							System.out.println("Vous ne pouvez pas aller plus à gauche.");
//						}
//					}
//				}
//			}
//		}
//	}
	//##############################

}