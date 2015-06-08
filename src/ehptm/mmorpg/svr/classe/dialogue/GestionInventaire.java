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
					+ "\t4 - Jeter un objet ( -2PA )\n"
					+ "\t5 - Quitter le gestionnaire");
			
			do{
				try{
					choix=Integer.parseInt(demandeDuChoix("Taper le chiffre correspondant : "));
				}catch(Exception e){
					choix=-1;
					
				}
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
					try{
						for(int i=0;i<Carte.getGrille().length;i++){
							for(int j=0;j<Carte.getGrille()[0].length;j++){
								if(Carte.getGrille()[i][j]==perso){
									if(j+1<Carte.getGrille()[0].length && Carte.getGrille()[i][j+1]==null){
										positionObjetX=i;
										positionObjetY=j+1;
									}
									else if(j-1<Carte.getGrille()[0].length && Carte.getGrille()[i][j-1]==null){
										positionObjetX=i;
										positionObjetY=j-1;
									}
									else if(i+1<Carte.getGrille().length){
										if(Carte.getGrille()[i+1][j]==null){
											positionObjetX=i+1;
											positionObjetY=j;
										}
										else if(j+1<Carte.getGrille()[0].length){
											if(Carte.getGrille()[i+1][j+1]==null){
												positionObjetX=i+1;
												positionObjetY=j+1;
											}
										}
										else if(j-1<Carte.getGrille()[0].length){
											if(Carte.getGrille()[i+1][j-1]==null){
												positionObjetX=i+1;
												positionObjetY=j-1;
											}
										}
									}
									else if(i-1<Carte.getGrille().length && i-1>0){
										if(Carte.getGrille()[i-1][j]==null){
											positionObjetX=i-1;
											positionObjetY=j;
										}
										else if(j+1<Carte.getGrille()[0].length){
											if(Carte.getGrille()[i-1][j+1]==null){
												positionObjetX=i-1;
												positionObjetY=j+1;
											}
										}
										else if(j-1<Carte.getGrille()[0].length){
											if(Carte.getGrille()[i-1][j-1]==null){
												positionObjetX=i-1;
												positionObjetY=j-1;
											}
										}
									}
									else{
										for(int x=0;x<Carte.getGrille().length && positionObjetX==-1;i++){
											for(int y=0;y<Carte.getGrille()[0].length && positionObjetX==-1;y++){
												if(Carte.getGrille()[x][y]==null){
													positionObjetX=x;
													positionObjetY=y;
												}
											}
										}
									}
								}
							}
						}
						try{
							Carte.getGrille()[positionObjetX][positionObjetY]=jeterObjet(perso);
						}catch(Exception e){
							System.out.println(e.getMessage());
						}
					}catch(Exception e){
						try{
							jeterObjet(perso);
						}catch(Exception ex){
							System.out.println(ex.getMessage());
						}
					}
				break;
			}
		}while(choix!=5);
	}
	
	public static void afficheInventaire(Inventaire inventairePerso){
		System.out.println(inventairePerso.toString());
	}
//	
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

	public static Item jeterObjet(Personnage perso)throws Exception{
		if(perso.getPointAction()-2<0)throw new Exception("Pas assez de point d'action ..");
		Item itemCache=null;
		afficheInventaire(perso.getInventaire());
		String question="Genre de l'item ?\n"
				+ "\t- sac a dos\n"
				+ "\t- arme\n"
				+ "\t- gants\n"
				+ "\t- armure\n"
				+ "\t- bottes\n";
		String reponse=demandeDuChoix(question).toLowerCase();
		if(reponse.equals("arme")|| reponse.equals("gants")|| reponse.equals("sac a dos"))
			itemCache= perso.getInventaire().jeter(reponse, Integer.parseInt(demandeDuChoix("Numero de l'emplacement du "+reponse))-1);
		else
			itemCache= perso.getInventaire().jeter(reponse, 0);
		if(itemCache!=null) 
			perso.setPointAction(perso.getPointAction()-2);
		return itemCache;
		
	}
	
	public static boolean ajouterUnObjet(Inventaire inventairePerso,Item item){
		if(item !=null){
			try{
				inventairePerso.ajouter(item);
				return true;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				return false;
			}
		}
		else
			return false;
	}
}
