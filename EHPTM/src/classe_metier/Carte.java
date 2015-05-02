package classe_metier;
import java.lang.Math;
import java.util.*;

public class Carte {
	
	private Position grille[][]; 
	private String nom;
	private Position[] murs;
	public static final int NB_MURS= 5;
	
	

	public Carte(Position grille[][], String nom, Position murs[]) {
		this.grille= grille;
		this.nom= nom;
		int taille= (int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS);
		this.murs= murs;
		for(int i=0;i< murs.length;i++)
		{
			for(int j=0; j<taille;j++)
			{
				for(int x=0;x<taille;x++)
				{
					if(this.grille[j][x] != null)
					{
						int a= (int)(Math.random() *(taille-1));
						int b= (int)(Math.random() *(taille-1));
						while(this.collision(a, b))
						{
							a= (int)(Math.random() *(taille-1));
							b= (int)(Math.random() *(taille-1));
						}
						this.getGrille()[a][b]= this.murs[i];
					}
				}
			}
			
			
		}
	}
	
	

	public Carte() {
		this.nom = "Default_map";
		this.murs= new Position[Carte.NB_MURS];
		int taille= (int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS);
		this.grille= new Position[taille][taille];
		for(int i=0;i< murs.length;i++)
		{
			for(int j=0; j<taille;j++)
			{
				for(int x=0;x<taille;x++)
				{
					if(this.grille[j][x] != null)
					{
						int a= (int)(Math.random() *(taille-1));
						int b= (int)(Math.random() *(taille-1));
						while(this.collision(a, b))
						{
							a= (int)(Math.random() *(taille-1));
							b= (int)(Math.random() *(taille-1));
						}
						this.getGrille()[a][b]= this.murs[i];
					}
				}
			}
			
			
		}
	}

	public Carte(Carte a)
	{
		this.nom= new String(a.getNom());
		this.murs= new Position[Carte.NB_MURS];
		for(int i=0; i<Carte.NB_MURS;i++)
		{
			this.getMurs()[i]= new Position(a.getMurs()[i]);
		}
		int taille= (int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS);
		this.grille= new Position[taille][taille];
		for(int i=0; i<(taille);i++)
		{
			for(int j=0;j< taille; i++)
			{
				this.getGrille()[i][j]= a.getGrille()[i][j];
			}
			
		}
		
	}

	
	public Position[] getMurs() {
		return murs;
	}



	public void setMurs(Position[] murs) {
		this.murs = murs;
	}



	public static int getNbMurs() {
		return NB_MURS;
	}



	public Position[][] getGrille() {
		return grille;
	}



	public void setGrille(Position[][] grille) {
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
	
	public void deplacer(Personnage a)
	{
		int taille= (int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS);
		for(int i=0;i<taille;i++)
		{
			for(int j=0;j<taille;j++)
			{
				if(this.getGrille()[i][j].equals(a))
				{
					Scanner input= new Scanner(System.in);
					System.out.println("voulez-vous vous déplacer verticalement ou horizontalement? Tapez 1 pour la verticale et 2 pour l'horizontale.");
					int b= input.nextInt();
					while(b!=1 || b!=2)
					{
						System.out.println("voulez-vous vous déplacer verticalement ou horizontalement? Tapez 1 pour la verticale et 2 pour l'horizontale.");
						b= input.nextInt();
					}
					if(b==1)
					{
						System.out.println("Tapez 1 pour monter ou 2 pour descendre.");
						int c= input.nextInt();
						while(c!=1 || c!=2)
						{
							System.out.println("Tapez 1 pour monter ou 2 pour descendre.");
							c= input.nextInt();
						}
						try
						{
							if(c==1)
							{
								if(this.getGrille()[i-1][j] !=null)
									this.getGrille()[i-1][j]=a;
									
							}
						}
						catch(IndexOutOfBoundsException e)
						{
							System.out.println("Vous ne pouvez pas monter plus haut.");
						}
						try
						{
							if(c==2)
							{
								if(this.getGrille()[i-1][j] !=null)
									this.getGrille()[i-1][j]=a;
							}
						}
						catch(IndexOutOfBoundsException e)
						{
							System.out.println("Vous ne pouvez pas descendre plus bas.");
						}
					}
					else
					{
						System.out.println("Tapez 1 pour aller à droite ou 2 pour aller à gauche.");
						int c= input.nextInt();
						while(c!=1 || c!=2)
						{
							System.out.println("Tapez 1 pour aller à droite ou 2 pour aller à gauche.");
							c= input.nextInt();
						}
						try
						{
							if(c==1)
							{
								if(this.getGrille()[i][j+1] !=null)
									this.getGrille()[i][j+1]=a;
									
							}
						}
						catch(IndexOutOfBoundsException e)
						{
							System.out.println("Vous ne pouvez pas aller plus à droite.");
						}
						try
						{
							if(c==2)
							{
								if(this.getGrille()[i][j-1] !=null)
									this.getGrille()[i][j-1]=a;
							}
						}
						catch(IndexOutOfBoundsException e)
						{
							System.out.println("Vous ne pouvez pas aller plus à gauche.");
						}
					}
				}
			}
		}
	}

}
