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
	
	
	public static void menuInventaire(PersonnageJoueur perso){
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
				case 1:
					afficheInventaire(perso.getInventaire());
					break;
				case 2:
					equiperObjet(perso.getInventaire());
					break;
				case 3:
					desequiperObjet(perso.getInventaire());
					break;
				case 4:
					int positionObjetX=-1;
					int positionObjetY=-1;
					for(int i=0;i<Carte.getGrille().length;i++){
						for(int j=0;j<Carte.getGrille()[0].length;j++){
							if(Carte.getGrille()[i][j].equals(perso)){
								try{
									if(Carte.getGrille()[i+1][j]==null){
										positionObjetX=i+1;
										positionObjetY=j;
									}
									else if(Carte.getGrille()[i+1][j+1]==null){
										positionObjetX=i+1;
										positionObjetY=j;
									}
									else if(Carte.getGrille()[i][j+1]==null){
										positionObjetX=i+1;
										positionObjetY=j;
									}
								}catch(Exception e){
									for(int x=0;x<Carte.getGrille().length && positionObjetX==-1;i++){
										for(int y=0;y<Carte.getGrille()[0].length && positionObjetX==-1;y++){
											if(Carte.getGrille()[x][y]==null){
												positionObjetX=x;positionObjetY=y;
											}
										}
									}
								}
	
							}
						}
					}
					try{
						Carte.getGrille()[positionObjetX][positionObjetY]=jeterObjet(perso.getInventaire());
					}catch(Exception e){}
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

	public static Item jeterObjet(Inventaire inventairePerso){
		afficheInventaire(inventairePerso);
		String question="Genre de l'item ?\n"
				+ "\t- sac a dos\n"
				+ "\t- arme\n"
				+ "\t- gants\n"
				+ "\t- armure\n"
				+ "\t- bottes\n";
		String reponse=demandeDuChoix(question).toLowerCase();
		if(reponse.equals("arme")|| reponse.equals("gants")|| reponse.equals("sac a dos"))
			return inventairePerso.jeter(reponse, Integer.parseInt(demandeDuChoix("Numero de l'emplacement du "+reponse))-1);
		else
			return inventairePerso.jeter(reponse, 0);
	}
}
