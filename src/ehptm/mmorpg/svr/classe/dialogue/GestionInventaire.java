package ehptm.mmorpg.svr.classe.dialogue;


import java.util.Scanner;

import ehptm.mmorpg.svr.classe.metier.*;

public class GestionInventaire {
	
	private static String demandeDuChoix(String question){
		String choix;
		Scanner input=new Scanner(System.in);
		System.out.print(question);
		choix=input.next();
		return choix;
	}
	
	
	public static void menuInventaire(Inventaire inventairePerso){
		int choix=0;
		do{
			System.out.println(
					  "\n\tGestion de l'inventaire\n"
					+ "\t         ******");
			System.out.println(
					  "\t1 - Voir l'inventaire\n"
					+ "\t2 - Equiper un item\n"
					+ "\t3 - Desequiper un item\n"
					+ "\t4 - Jeter un objet\n"
					+ "\t5 - Quitter le gestionnaire");
			
			do{
				choix=Integer.parseInt(demandeDuChoix("Taper le chiffre correspondant : "));
			}while(choix<1 || choix>5);
			switch(choix){
				case 1:afficheInventaire(inventairePerso);
					break;
				case 2:equiperObjet(inventairePerso);
					break;
				case 3:desequiperObjet(inventairePerso);
					break;
				case 4:jeterObjet(inventairePerso);
					break;
			}
		}while(choix!=5);
	}
	
	public static void afficheInventaire(Inventaire inventairePerso){
		System.out.println(inventairePerso.toString());
	}
	
	public static void equiperObjet(Inventaire inventairePerso){
		afficheInventaire(inventairePerso);
		inventairePerso.equiper(Integer.parseInt(demandeDuChoix("Numero de l'emplacement de l'item dans le sac a dos : "))-1);	
	}
	public static void desequiperObjet(Inventaire inventairePerso){
		afficheInventaire(inventairePerso);
		String question="Genre de l'item ?\n"
				+ "\t- arme\n"
				+ "\t- gants\n"
				+ "\t- armure\n"
				+ "\t- bottes\n";
		String reponse=demandeDuChoix(question).toLowerCase();
		if(reponse.equals("arme")|| reponse.equals("gants"))
			inventairePerso.desequiper(reponse, Integer.parseInt(demandeDuChoix("Numero de l'emplacement du "+reponse))-1);
		else
			inventairePerso.desequiper(reponse, 0);
	}

	public static void jeterObjet(Inventaire inventairePerso){
		afficheInventaire(inventairePerso);
		String question="Genre de l'item ?\n"
				+ "\t- sac a dos\n"
				+ "\t- arme\n"
				+ "\t- gants\n"
				+ "\t- armure\n"
				+ "\t- bottes\n";
		String reponse=demandeDuChoix(question).toLowerCase();
		if(reponse.equals("arme")|| reponse.equals("gants")|| reponse.equals("sac a dos"))
			inventairePerso.jeter(reponse, Integer.parseInt(demandeDuChoix("Numero de l'emplacement du "+reponse))-1);
		else
			inventairePerso.jeter(reponse, 0);
	}
}
