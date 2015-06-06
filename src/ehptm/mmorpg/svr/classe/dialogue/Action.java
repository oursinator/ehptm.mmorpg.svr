package ehptm.mmorpg.svr.classe.dialogue;

import java.util.Scanner;

import ehptm.mmorpg.svr.classe.metier.Carte;
import ehptm.mmorpg.svr.classe.metier.Item;
import ehptm.mmorpg.svr.classe.metier.Personnage;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;
import ehptm.mmorpg.svr.classe.metier.Potion;

public class Action {

	private static int[] positionPerso(PersonnageJoueur perso){
		int posPerso[]=new int[2];
		for(int i=0;i<Carte.getGrille().length;i++){
			for(int j=0;j<Carte.getGrille()[0].length;j++){
				if(Carte.getGrille()[i][j]==perso){
					posPerso[0]=i;posPerso[1]=j;
					return posPerso;
				}
			}
		}
		return null;
	}
	public static void ramasserObjet(PersonnageJoueur perso){
		int paUtiliser=2;
		Scanner input= new Scanner(System.in);
		String miniCarte="";
		String message="\tRamasser un objet\n"
				     + "\t   ***********\n";
		if(perso.getPointAction()-2>=0){
			message+= "Tapez :\n";
			int nbItem=0;
			int posPerso[]=positionPerso(perso);
			if(posPerso!=null){
				int i=posPerso[0]-1;
				int j=posPerso[1]-1;
				if(i<0)
					i=0;
				if(j<0)
					j=0;
				if(Carte.getGrille()[i][j+1] !=null && Carte.getGrille()[i][j+1] instanceof Item){
					nbItem++;
					message+=" - 1 Pour ramasser :\n"
							+ ((Item)Carte.getGrille()[i][j+1])+"\n";
					
				}
				if(Carte.getGrille()[i+1][j] !=null && Carte.getGrille()[i+1][j] instanceof Item){
					nbItem++;
					message+=" - 2 Pour ramasser :\n"
							+ ((Item)Carte.getGrille()[i+1][j])+"\n";
				}
				if(j+2<Carte.getGrille()[0].length && Carte.getGrille()[i+1][j+2] !=null && Carte.getGrille()[i+1][j+2] instanceof Item){
					nbItem++;
					message+=" - 3 Pour ramasser :\n"
							+ ((Item)Carte.getGrille()[i+1][j+2])+"\n";
				}
				if(i+2<Carte.getGrille()[0].length && Carte.getGrille()[i+2][j+1] !=null && Carte.getGrille()[i+2][j+1] instanceof Item){
					nbItem++;
					message+=" - 4 Pour ramasser :\n"
							+ ((Item)Carte.getGrille()[i+2][j+1])+"\n";
				}
				message+=" - 0 Pour revenir au menu\n";
				if(nbItem>0){
					int choix;
					do{
						System.out.println(message);
						choix=input.nextInt();
					}while(choix<0 || choix>4);
					switch(choix){
						case 1:
							if(GestionInventaire.ajouterUnObjet(perso.getInventaire(),(Item) Carte.getGrille()[i][j+1])){
								Carte.getGrille()[i][j+1]=null;
								perso.setPointAction(perso.getPointAction()-paUtiliser);
							}
							break;
						case 2:
							if(GestionInventaire.ajouterUnObjet(perso.getInventaire(),(Item) Carte.getGrille()[i+1][j])){
								Carte.getGrille()[i+1][j]=null;
								perso.setPointAction(perso.getPointAction()-paUtiliser);
							}
							break;
						case 3:
							if(GestionInventaire.ajouterUnObjet(perso.getInventaire(),(Item) Carte.getGrille()[i+1][j+2])){
								Carte.getGrille()[i+1][j+2]=null;
								perso.setPointAction(perso.getPointAction()-paUtiliser);
							}
							break;
						case 4:
							if(GestionInventaire.ajouterUnObjet(perso.getInventaire(),(Item) Carte.getGrille()[i+2][j+1])){
								Carte.getGrille()[i+2][j+1]=null;
								perso.setPointAction(perso.getPointAction()-paUtiliser);
							}
							break;
					}
				}
				else
					System.out.println("Aucun Item. Retour au menu ..");
			}
		}
		else
			System.out.println(message+"Pas assez de point d'action ..");
		
	}
	
	public static void choisirAction(Carte carte, PersonnageJoueur personnage) throws IndexOutOfBoundsException
	{
		Scanner input= new Scanner(System.in);
		int choix;
		InformationPersonnage.afficherEtat(personnage);
		InformationPersonnage.afficherCaracteristique(personnage);
		InformationPersonnage.afficherPointAction(personnage);
		InformationPersonnage.afficherCarte(personnage);
		do
		{
			System.out.println("Que voulez-vous faire? Tapez\n"
					+ " 1 - pour vous deplacer ( -2PA )\n"
					+ " 2 - pour utiliser un équipement ( Cout PA variable )\n"
					+ " 3 - pour attaquer ( -3PA )\n"
					+ " 4 - pour gerer son inventaire\n"
					+ " 5 - pour ramasser un objet ( -2PA )\n"
					+ " 0 - pour passer votre tour");
			choix= input.nextInt();
			switch(choix){
				case 1:System.out.println("Se deplacer vers :\n"
						+ " 1 - le haut\n"
						+ " 2 - la droite\n"
						+ " 3 - le bas\n"
						+ " 4 - la gauche");
					int direction;
					do{
						System.out.println("Tapez le chiffre qui correspond");
						direction=input.nextInt();
					}while(direction<1 || direction>4);
					switch(direction){
						case 1:System.out.println(carte.deplacer(personnage, -1, 1));
							break;
						case 2:System.out.println(carte.deplacer(personnage, 1,1));
							break;
						case 3:System.out.println(carte.deplacer(personnage,-1,-1));
							break;
						case 4:System.out.println(carte.deplacer(personnage,1,-1));
							break;
					}
					break;
				case 2:
					String invent="";
					for(int i=0;i<personnage.getInventaire().getSacADos().length;i++)
					{
						if(personnage.getInventaire().getSacADos()[i]!=null && personnage.getInventaire().getSacADos()[i] instanceof Potion)
							invent+="\tEmplacement "+(i+1)+": "+personnage.getInventaire().getSacADos()[i]+"\n";
					}
					
					System.out.println(invent);
					
					int item;
					do{
						System.out.println("Taper le numero de l'item que vous voulez utiliser");
						item=input.nextInt();
					}while(item<0 || item>personnage.getInventaire().getSacADos().length);
					if(personnage.getInventaire().getSacADos()[item] instanceof Potion)
						((Potion)personnage.getInventaire().getSacADos()[item]).utiliser(personnage);
					break;
				case 3:
					int cible;
					do{
						System.out.println("Tapez:\n"
								+ " 1 - pour attaquer en haut\n"
								+ " 2 - pour attaquer en haut a droite\n"
								+ " 3 - pour attaquer a droite\n"
								+ " 4 - pour attaquer en bas a droite\n"
								+ " 5 - pour attaquer en bas\n"
								+ " 6 - pour attaquer en bas a gauche\n"
								+ " 7 - pour attaquer a gauche\n"
								+ " 8 - pour attaquer en haut a gauche");
						cible=input.nextInt();
					}while(cible<1||cible>8);
					int persoX=-1;
					int persoY=-1;
					for(int x=0;x<Carte.getGrille().length;x++){
						for(int y=0;y<Carte.getGrille()[0].length;y++){
							if(Carte.getGrille()[x][y]==personnage){
								persoX=x;
								persoY=y;
							}
						}
					}
					try{
						boolean touche=false;
						switch(cible){
							case 1:
								if(Carte.getGrille()[persoX-1][persoY] !=null && Carte.getGrille()[persoX-1][persoY] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX-1][persoY]);
								break;
							case 2:
								if(Carte.getGrille()[persoX-1][persoY+1] !=null && Carte.getGrille()[persoX-1][persoY+1] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX-1][persoY+1]);
								break;
							case 3:
								if(Carte.getGrille()[persoX][persoY+1] !=null && Carte.getGrille()[persoX][persoY+1] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX][persoY+1]);
								break;
							case 4:
								if(Carte.getGrille()[persoX+1][persoY+1] !=null && Carte.getGrille()[persoX+1][persoY+1] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX+1][persoY+1]);
								break;
							case 5:
								if(Carte.getGrille()[persoX+1][persoY] !=null && Carte.getGrille()[persoX+1][persoY] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX+1][persoY]);
								break;
							case 6:
								if(Carte.getGrille()[persoX+1][persoY-1] !=null && Carte.getGrille()[persoX+1][persoY-1] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX+1][persoY-1]);
								break;
							case 7:
								if(Carte.getGrille()[persoX][persoY-1] !=null && Carte.getGrille()[persoX][persoY-1] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX][persoY-1]);
								break;
							case 8:
								if(Carte.getGrille()[persoX-1][persoY-1] !=null && Carte.getGrille()[persoX-1][persoY-1] instanceof Personnage)
									touche=personnage.attaquer((Personnage)Carte.getGrille()[persoX-1][persoY-1]);
								break;
						}
						if(touche)
							System.out.println("Personnage touche !");
						else
							System.out.println("Aucun personnage touche ..");
					}catch(Exception e){System.out.println("hhhhh"+e.getMessage());}
					break;
				case 4:
					GestionInventaire.menuInventaire(personnage);
					break;
				case 5:
					ramasserObjet(personnage);
					break;
			}
		}while((choix<0 || choix>5)&&choix!=0);
	}
		
}
