package ehptm.mmorpg.svr.classe.dialogue;

import ehptm.mmorpg.svr.classe.metier.*;

public class TestInformationPersonnage {

	public static void main(String[] args) {
		PersonnageJoueur perso=new PersonnageJoueur(5, 2, new Inventaire(), "Kikoo_Du_93", new int[2], new int[2], new int[2], new int[2]);
		InformationPersonnage.afficherEtat(perso);
		InformationPersonnage.afficherCaracteristique(perso);
		InformationPersonnage.afficherPointAction(perso);
		
	}

}
