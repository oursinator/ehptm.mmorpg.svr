package ehptm.mmorpg.svr.classe.dialogue;

import java.util.Scanner;

import ehptm.mmorpg.svr.classe.metier.Carte;
import ehptm.mmorpg.svr.classe.metier.Personnage;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;
import ehptm.mmorpg.svr.classe.metier.Potion;

public class Action {

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
					+ " 1 - pour vous deplacer\n"
					+ " 2 - pour utiliser un équipement\n"
					+ " 3 - pour attaquer\n"
					+ " 4 - pour gerer son inventaire\n"
					+ " 0 - pour passer votre tour");
			choix= input.nextInt();
		}while(choix<0 || choix>4);
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
						if(Carte.getGrille()[x][y].equals(personnage)){
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
			case 0:
				break;
		}
	}
}
