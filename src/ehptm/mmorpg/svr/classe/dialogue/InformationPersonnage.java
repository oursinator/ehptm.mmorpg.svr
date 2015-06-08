package ehptm.mmorpg.svr.classe.dialogue;

import ehptm.mmorpg.svr.classe.metier.*;

public class InformationPersonnage {
	public static void afficherEtat(PersonnageJoueur perso){
		System.out.println(
				  "\n\tPersonnage "+perso.getNom()+"\n"
				+ "\t       ******");
		if(perso.isToucher())
			System.out.println("On vous a attaqué :(");
		System.out.println("Votre etat: \n\t"+perso.etat());
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
	public static void afficherCarte(PersonnageJoueur perso){
		String a="";
		for(int i=0;i<Carte.getGrille().length;i++)
		{
			for(int j=0;j<Carte.getGrille()[0].length;j++)
			{
				if(Carte.getGrille()[i][j] ==null)
					a+=" ";
				else if(Carte.getGrille()[i][j] instanceof Personnage){
					if(Carte.getGrille()[i][j].equals(perso))
						a+="P";
					else
						a +="E";
				}
				else if(Carte.getGrille()[i][j] instanceof Item)
					a+="I";
				else if(Carte.getGrille()[i][j] instanceof Object)
					a+="#";
			}
			switch(i){
				case 0:a+="\tE=Personnage joueur ou non joueur";
					break;
				case 1:a+="\tP=Votre personnage";
					break;
				case 2:a+="\tI=Item au sol";
					break;
			}
			a+="\n";
		}
		System.out.println(a);
	}
}
