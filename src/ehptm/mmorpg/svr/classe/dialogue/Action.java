package ehptm.mmorpg.svr.classe.dialogue;

import java.util.Scanner;

import ehptm.mmorpg.svr.classe.metier.Carte;
import ehptm.mmorpg.svr.classe.metier.Personnage;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;

public class Action {

	public static void choisirAction(Carte carte, Personnage personnage) throws IndexOutOfBoundsException
	{
		System.out.println("Que voulez-vous faire? Tapez\n 1-pour vous deplacer\n 2-pour utiliser un équipement\n 3-pour attaquer\n 0-pour passer votre tour");
		Scanner input= new Scanner(System.in);
		int choix= input.nextInt();
		while(choix !=1 || choix!=2 || choix!=3 || choix!=0)
		{
			System.out.println("Que voulez-vous faire? Tapez\n 1-pour vous deplacer\n 2-pour utiliser un équipement\n 3-pour attaquer\n 0-pour passer votre tour");
			choix= input.nextInt();
		}
		if(choix==1)
		{
			System.out.println("Si vous voulez vous déplacer horizontalement tapez 1.\n Si vous voulez vous déplacer verticalement tapez -1");
			int direction= input.nextInt();
			while(direction != 1 || direction!=2)
			{
				System.out.println("Si vous voulez vous déplacer horizontalement tapez 1.\n Si vous voulez vous déplacer verticalement tapez 2");
				direction= input.nextInt();
			}
			if(direction==1)
			{
				System.out.println("Si vous voulez vous déplacer à droite tapez 1 et -1 si vous voulez vous déplacer à gauche");
				direction= input.nextInt();
				while(direction!=1 || direction !=-1)
				{
					System.out.println("Si vous voulez vous déplacer à droite tapez 1 et -1 si vous voulez vous déplacer à gauche");
					direction= input.nextInt();
				}
				if(direction ==1)
				{
					System.out.println(carte.deplacer(personnage, 1, 1));
				}
				else
				{
					System.out.println(carte.deplacer(personnage,1,1));
				}
			}
			else
			{
				System.out.println("Si vous voulez vous déplacer à droite tapez 1 et -1 si vous voulez vous déplacer à gauche");
				direction= input.nextInt();
				while(direction!=1 || direction !=-1)
				{
					System.out.println("Si vous voulez vous déplacer en haut tapez 1 et -1 si vous voulez vous déplacer en bas");
					direction= input.nextInt();
				}
				if(direction ==1)
				{
					System.out.println(carte.deplacer(personnage, -1, 1));
				}
				else
				{
					System.out.println(carte.deplacer(personnage,-1,1));
				}
			}

		}
		else if(choix==2)
		{
			for(int i=0;i<personnage.getInventaire().getTailleSacADos();i++)
			{
				System.out.println(personnage.getInventaire().getSacADos()[i]+"" +i);
				System.out.println("taper le numero de l'item que vous voulez utiliser");
				int arme= input.nextInt();
				personnage.utiliserItem(personnage.getInventaire().getSacADos()[arme]);
			}
		}
		else if(choix==3)
		{

			if(personnage instanceof PersonnageJoueur)
			{
				System.out.println("Tapez 1 pour attaquer celui du haut, 2 pour diagonale en haut à droite, 3 pour à droite, 4 pour en bas à droite, 5 en bas, 6 en bas à gauche, 7 à gauche et 8 en haut à gauche");
				int cible= input.nextInt();
				while(cible != 1 || cible !=2 ||cible != 3 || cible !=4 ||cible != 5 || cible !=6 ||cible != 7 || cible !=8)
				{
					System.out.println("Tapez 1 pour attaquer celui du haut, 2 pour diagonale en haut à droite, 3 pour à droite, 4 pour en bas à droite, 5 en bas, 6 en bas à gauche, 7 à gauche et 8 en haut à gauche");
					cible= input.nextInt();
				}

				PersonnageJoueur a= (PersonnageJoueur)personnage;
				for(int i=0;i<carte.getGrille().length;i++)
				{
					for(int j=0;j<carte.getGrille().length;j++)
					{

						if(carte.getGrille()[i][j]== a)
						{
							if(cible==1)
							{
								if(carte.getGrille()[i-1][j] !=null)
								{
									if(carte.getGrille()[i-1][j] instanceof Personnage)
									{
										a.attaquer((Personnage)carte.getGrille()[i-1][j]);
									}
								}
							}
							else if(cible==2)
							{
								if(cible==1)
								{
									if(carte.getGrille()[i-1][j+1] !=null)
									{
										if(carte.getGrille()[i-1][j] instanceof Personnage)
										{
											a.attaquer((Personnage)carte.getGrille()[i-1][j]);
										}
									}
								}
								else if(cible ==3)
								{
									if(carte.getGrille()[i][j+1] !=null)
									{
										if(carte.getGrille()[i][j+1] instanceof Personnage)
										{
											a.attaquer((Personnage)carte.getGrille()[i][j+1]);
										}
									}
								}
								else if(cible == 4)
								{
									if(carte.getGrille()[i+1][j+1] !=null)
									{
										if(carte.getGrille()[i+1][j+1] instanceof Personnage)
										{
											a.attaquer((Personnage)carte.getGrille()[i+1][j+1]);
										}
									}
								}
								else if(cible ==5)
								{
									if(carte.getGrille()[i+1][j] !=null)
									{
										if(carte.getGrille()[i+1][j] instanceof Personnage)
										{
											a.attaquer((Personnage)carte.getGrille()[i+1][j]);
										}
									}
								}
								else if(cible ==6)
								{
									if(carte.getGrille()[i+1][j-1] !=null)
									{
										if(carte.getGrille()[i+1][j-1] instanceof Personnage)
										{
											a.attaquer((Personnage)carte.getGrille()[i+1][j-1]);
										}
									}
								}
								else if(cible ==7)
								{
									if(carte.getGrille()[i][j-1] !=null)
									{
										if(carte.getGrille()[i][j-1] instanceof Personnage)
										{
											a.attaquer((Personnage)carte.getGrille()[i][j-1]);
										}
									}
								}
								else if(cible ==8)
								{
									if(carte.getGrille()[i-1][j-1] !=null)
									{
										if(carte.getGrille()[i-1][j-1] instanceof Personnage)
										{
											a.attaquer((Personnage)carte.getGrille()[i-1][j-1]);
										}
									}
								}



							}
						}
					}


				}

			}


		}
	}
}
