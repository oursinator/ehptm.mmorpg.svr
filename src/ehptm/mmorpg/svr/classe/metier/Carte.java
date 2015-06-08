package ehptm.mmorpg.svr.classe.metier;

import java.util.ArrayList;

public class Carte {
	
	private static Object grille[][]; 
	private String nom;
	private int nbItem;
	private int nbJoueur;
	public static final int NB_MURS= 45;
	public static final int TAILLE_GRILLE=(int)Math.sqrt(Partie.NB_MAX_JOUEUR + Partie.NB_MAX_ITEM + Carte.NB_MURS+10)+15;
	
	

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
	public void joueursMort(){
		for(int i=0;i<getGrille().length;i++){
			for(int j=0;j<getGrille()[0].length;j++){
				if(getGrille()[i][j]!=null){
					if(getGrille()[i][j] instanceof Personnage && ((Personnage)this.getGrille()[i][j]).getPointVie()<=0){
						this.grille[i][j]=null;
					}
				}
			}
		}
	}
	public ArrayList<Personnage> listePersonnage(){
		ArrayList<Personnage> listePersonnage=new ArrayList<Personnage>();
		for(int i=0;i<getGrille().length;i++){
			for(int j=0;j<getGrille()[0].length;j++){
				if(getGrille()[i][j]!=null){
					if(getGrille()[i][j] instanceof Personnage)
					listePersonnage.add((Personnage)getGrille()[i][j]);
				}
			}
		}
		return listePersonnage;
	}

	public static Object[][] getGrille() {
		return grille;
	}



	public void setGrille(Object[][] grille) {
		this.grille = grille;
	}

	public boolean ajouter(Object a)
	{
		int x=-1;
		int y=-1;
		try{
			boolean existeDeja=false;
			for(int i=0; i<this.grille.length;i++)
			{
				for(int j=0;j< this.grille[0].length; j++)
				{
					if( this.grille[i][j]!=null){
						if(this.grille[i][j].equals(a))
								existeDeja=true;
					}
				}
			}
			if(!existeDeja){
				do{
					x= (int)(Math.random() *(this.grille.length-1));
					y= (int)(Math.random() *(this.grille[0].length-1));
				}
				while(this.collision(x, y));
				this.grille[x][y]= a;
				if(a instanceof PersonnageJoueur)
					this.setNbJoueur(this.getNbJoueur() + 1);
				if(a instanceof Item)
					this.setNbItem(this.getNbItem() + 1);
				return true;
			}
			else 
				return false;
		}catch(Exception e){
			return false;
		}	
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbItem() {
		return nbItem;
	}



	public void setNbItem(int nbItem) {
		this.nbItem = nbItem;
	}



	public int getNbJoueur() {
		return nbJoueur;
	}



	public void setNbJoueur(int nbJoueur) {
		this.nbJoueur = nbJoueur;
	}



	public boolean collision(int a, int b)throws IndexOutOfBoundsException, Exception
	{
		return this.getGrille()[a][b] != null; //true s'il y a collision
	}
	
	public String deplacer(Personnage a, int direction, int sens)
	{
		boolean test= false;
		int x=0;
		int y=0;
		for(int i=0;i<this.grille.length;i++){
			for(int j=0;j<this.grille[0].length;j++){
				if(this.grille[i][j] == a){
					x=i;
					y=j;
				}
			}
		}
		if(a.getPointAction()-2>=0){
			String mess="";
			switch(direction){
				case 1:
					if(sens ==1){
						try{
							if(!collision(x, y+1)){
								this.getGrille()[x][y+1]=a;
								mess= "� droite toute!";
								this.getGrille()[x][y]= null;
								test= true;
								a.setPointAction(a.getPointAction()-2);
							
							}
							else
								mess="Vous ne pouvez pas allez plus � droite.";
						}catch(IndexOutOfBoundsException e){
							mess="Vous ne pouvez pas allez plus � droite.";
						}
						catch(Exception e){
							mess="Vous ne pouvez pas allez plus � droite.";
						}
					}
					else if(sens == -1){
						try{
							if(!collision(x, y-1)){
								this.getGrille()[x][y-1]=a;
								mess= "� gauche toute!";
								this.getGrille()[x][y]= null;
								test= true;
								a.setPointAction(a.getPointAction()-2);
							
							}
							else
								mess="Vous ne pouvez pas allez plus � gauche.";
						}catch(IndexOutOfBoundsException e){
							mess="Vous ne pouvez pas allez plus � gauche.";
						}
						catch(Exception e){
							mess="Vous ne pouvez pas allez plus � droite.";
						}
					}
					break;
				case -1:
					if(sens ==1){
						try{
							if(!collision(x-1, y)){
								this.getGrille()[x-1][y]=a;
								mess= "Mont�!";
								this.getGrille()[x][y]= null;
								test= true;
								a.setPointAction(a.getPointAction()-2);
							
							}
							else
								mess="Vous ne pouvez pas allez plus haut.";
						}catch(IndexOutOfBoundsException e){
							mess="Vous ne pouvez pas allez plus haut.";
						}
						catch(Exception e){
							mess="Vous ne pouvez pas allez plus � droite.";
						}
					}
					else if(sens == -1){
						try{
							if(!collision(x+1, y)){
								this.getGrille()[x+1][y]=a;
								mess= "Descendu!";
								this.getGrille()[x][y]= null;
								test= true;
								a.setPointAction(a.getPointAction()-2);
							
							}
							else
								mess="Vous ne pouvez pas allez plus bas.";
						}catch(IndexOutOfBoundsException e){
							mess="Vous ne pouvez pas allez plus bas.";
						}
						catch(Exception e){
							mess="Vous ne pouvez pas allez plus � droite.";
						}
					}
					break;
				default:
					mess="Vos indices de d�placements ne sont pas valides";
					break;	
			}
			return mess;
		}
		return "Il manque des points d'actions ..";
		
	}
	public String toString()
	{
		String a= this.nom+"\n";
		for(int i=0;i<this.grille.length;i++)
		{
			for(int j=0;j<this.grille[0].length;j++)
			{
				if(this.grille[i][j] ==null)
					a+=" ";
				else if(this.grille[i][j] instanceof Personnage)
					a +="P";
				else if(this.grille[i][j] instanceof Item)
					a+="I";
				else if(this.grille[i][j] instanceof Object)
					a+="#";
			}
			a+="\n";
		}
		return a;
	}
}
