package ehptm.mmorpg.svr.game;

import java.io.IOException;

import ehptm.mmorpg.svr.classe.dialogue.Action;
import ehptm.mmorpg.svr.classe.dialogue.ChoisirPersonnage;
import ehptm.mmorpg.svr.classe.metier.*;

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
		Partie partie=new Partie(Partie.PARTIE_COURTE);
		try {
			partie.ajouterElementCarte(new PotionSoin(PotionSoin.SOIN_1));
			partie.ajouterElementCarte(new Arme(Arme.EPEE,"de Maximus"));
			partie.ajouterElementCarte(new Armure(Armure.ARMURE_BRONZE));
			partie.ajouterElementCarte(new Gants(Gants.GANT_OR));
		} catch (Exception e) {
			
		}
		try {
			perso=ChoisirPersonnage.choisirPersonnage();
			try {
				//Test avec des ennemie
				partie.ajouterElementCarte(new PersonnageNonJoueur());
				partie.ajouterElementCarte(new PersonnageNonJoueur());
				partie.ajouterElementCarte(new PersonnageNonJoueur());
				partie.ajouterElementCarte(perso);
				while(partie.restePersonnageJoueur()){
					for(Personnage personnage : partie.getCarte().listePersonnage()){
						if(personnage.equals(perso)){
							try{
								Action.choisirAction(partie.getCarte(), (PersonnageJoueur)personnage);
							}catch(Exception e){}
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Le personnage n'a pas eu etre placer sur la carte :(");
			}
		} catch (IOException e) {
			System.out.println("Oups ! Il y a un probleme avec le personnage :(");
		}
		
	}

}
