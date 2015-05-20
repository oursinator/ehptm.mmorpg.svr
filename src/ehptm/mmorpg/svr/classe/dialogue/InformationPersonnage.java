package ehptm.mmorpg.svr.classe.dialogue;

import ehptm.mmorpg.svr.classe.metier.*;

public class InformationPersonnage {
	public static void afficherEtat(PersonnageJoueur perso){
		System.out.println(
				  "\n\tPersonnage "+perso.getNom()+"\n"
				+ "\t       ******");
		System.out.println("Votre etat: \n\t"+perso.etat()+"\n");
	}
	public static void afficherCaracteristique(PersonnageJoueur perso){
		System.out.println("Caracteristiques :\n"
				+ "\t- Force: "+perso.getForce()[0]+"+"+perso.getForce()[1]+"D\n"
				+ "\t- Adresse: "+perso.getAdresse()[0]+"+"+perso.getAdresse()[1]+"D\n"
				+ "\t- Resistance: "+perso.getResistance()[0]+"+"+perso.getResistance()[1]+"D\n"
				+ "\t- Initiative: "+perso.initiative()[0]+"+"+perso.initiative()[1]+"D\n"
				+ "\t- Attaque: "+perso.attaque()[0]+"+"+perso.attaque()[1]+"D\n"
				+ "\t- Defense: "+perso.defense()[0]+"+"+perso.defense()[1]+"D\n"
				+ "\t- Degats: "+perso.degats()[0]+"+"+perso.degats()[1]+"D\n");
	}
	
	public static void afficherPointAction(PersonnageJoueur perso){
		System.out.println("Vos points d'action: "+perso.getPointAction());
	}
}
