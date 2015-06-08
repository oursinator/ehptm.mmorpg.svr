package ehptm.mmorpg.svr.game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import ehptm.mmorpg.svr.classe.dialogue.Action;
import ehptm.mmorpg.svr.classe.dialogue.ChoisirPersonnage;
import ehptm.mmorpg.svr.classe.dialogue.InformationPersonnage;
import ehptm.mmorpg.svr.classe.metier.Partie;
import ehptm.mmorpg.svr.classe.metier.Personnage;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;
import ehptm.mmorpg.svr.classe.metier.PersonnageNonJoueur;

public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				  "                                   Projet tutore\n"
				+ "                                       *****\n"
				+ "                         Groupe GIRARDEAU / COUPPOUSSAMY\n"
				+ "                         ###############################\n\n"
				+ "Eventuellement Hors-ligne et Pas Tres Massif MMORPG Sans Veritable Roleplay");
		PersonnageJoueur perso;
		int choix=-1;
		do{
			Partie partie=new Partie(Partie.PARTIE_COURTE);
			try {
				perso=ChoisirPersonnage.choisirPersonnage();
				try {
					//Test avec des ennemie
					partie.ajouterElementCarte(perso);
					ArrayList<PersonnageJoueur> listPersoMort=new ArrayList<PersonnageJoueur>();
					while(partie.restePersonnageJoueur()){
						if(perso.getPointVie()<=0){
							break;
						}
						for(Personnage personnage : partie.getCarte().listePersonnage()){
							if(personnage instanceof PersonnageJoueur && personnage==perso){
								try{
									Action.choisirAction(partie.getCarte(), (PersonnageJoueur)personnage);
									((PersonnageJoueur)personnage).setToucher(false);
								}catch(Exception e){}
							}
							else{
								( (PersonnageNonJoueur) personnage).ia(partie.getCarte());
								System.out.println("Tours d'un autre personnage ..");
							}
							personnage.recuperationPointAction(partie);
							partie.retireJoueurMort();
						}
					}
					if(perso.getPointVie()<=0)
						InformationPersonnage.afficherEtat(perso);
					System.out.println("\n\n\t***** Vous avez perdu *****"
							+ "\nFermeture de la partie ..");
					
				} catch (Exception e) {
					System.out.println(e.getMessage()+"  Le personnage n'a pas eu etre placer sur la carte :(");
				}
			} catch (IOException e) {
				System.out.println("Oups ! Il y a un probleme avec le personnage :(");
			}
			Scanner input=new Scanner(System.in);
			do{
				System.out.println("\nTapez:"
						+ "1 - Pour recommencer une partie"
						+ "0 - Pour quitter le jeu");
				try{
					choix=input.nextInt();
				}catch(Exception e){
					choix=-1;
					input=new Scanner(System.in);
				}
			}while(choix<0 || choix>1);
		}while(choix!=0);
		
	}

}
