package ehptm.mmorpg.svr.classe.metier;
public class Carte {
	
	private Object grille[][]; 
	private String nom;
	public static final int NB_MURS= 100;
	public static final int TAILLE_GRILLE=(int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS)+20;
	
	

	public Carte(Object grille[][], String nom) {
		this.grille= grille;
		this.nom= nom;
	}
	
	

	public Carte() {
		this.nom = "Default_map";
		this.grille= new Object[Carte.TAILLE_GRILLE][Carte.TAILLE_GRILLE];
		
		for(int i=0; i<this.grille.length;i++){
			this.grille[i][0]=new Object();
			this.grille[i][this.grille[0].length-1]=new Object();
			
		}
		for(int j=0;j<this.grille[0].length;j++){
			this.grille[0][j]=new Object();
			this.grille[this.grille.length-1][j]=new Object();
		}
		for(int i=0;i< Carte.NB_MURS;i++)
		{
			int a=-1;
			int b=-1;
			try{
				do{
					a= (int)(Math.random() *(this.grille.length-1));
					b= (int)(Math.random() *(this.grille[0].length-1));
				}
				while(this.collision(a, b));
			
				this.getGrille()[a][b]= new Object();
			}catch(Exception e){
				
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
		return this.grille;
	}



	public void setGrille(Object[][] grille) {
		this.grille = grille;
	}



	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public boolean collision(int a, int b)throws Exception
	{
		return this.getGrille()[a][b] != null; //true s'il y a collision
	}
	
	public String deplacer(Personnage a, int direction, int sens)
	{
		String mess="vos indices de déplacements ne sont pas valides";
		if(direction ==1 || direction == -1) // 1 pour horizontale et -1 pour verticale
		{
			if(sens==1 || sens ==-1) // 1 pour droite et -1 pour gauche
			{
				for(int i=0;i<TAILLE_GRILLE;i++)
				{
					for(int j=0;j<TAILLE_GRILLE;j++)
					{
						if(this.getGrille()[i][j].equals(a))
						{
							
							if(direction ==1)
							{
								if(sens ==1)
								{
									try{
										if(this.getGrille()[i][j+1] !=null)
										{
											this.getGrille()[i][j+1]=a;
											mess= "à droite toute!";
										}
									}
									catch(IndexOutOfBoundsException e)
									{
										mess="Vous ne pouvez pas allez plus à droite.";
									}
								}
										
								else
								{
									try{
										if(this.getGrille()[i][j-1] !=null)
										{
											this.getGrille()[i][j-1]=a;
											mess= "à droite toute!";
										}
									}
									catch(IndexOutOfBoundsException e)
									{
										mess="Vous ne pouvez pas allez plus à gauche.";
									}
								}
							}
							else
							{
								if(sens ==1)
								{
									try{
										if(this.getGrille()[i-1][j] !=null)
										{
											this.getGrille()[i-1][j]=a;
											mess= "Monté!";
										}
									}
									catch(IndexOutOfBoundsException e)
									{
										mess="Vous ne pouvez pas allez plus haut.";
									}
								}
										
								else
								{
									try{
										if(this.getGrille()[i+1][j] !=null)
										{
											this.getGrille()[i+1][j]=a;
											mess= "Descendu!";
										}
									}
									catch(IndexOutOfBoundsException e)
									{
										mess="Vous ne pouvez pas allez plus bas.";
									}
								}
							}
						}
					}
				}
			}
		
		
		}
		return mess;
	}
	
}
