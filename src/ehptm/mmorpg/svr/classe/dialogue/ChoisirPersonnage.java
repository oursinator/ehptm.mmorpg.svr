package ehptm.mmorpg.svr.classe.dialogue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import ehptm.mmorpg.svr.classe.metier.Armure;
import ehptm.mmorpg.svr.classe.metier.Inventaire;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;

public class ChoisirPersonnage{

	
	public static PersonnageJoueur choisirPersonnage() throws IOException
	{
		File file = new File("test.txt");
		FileReader lec= null;
		PersonnageJoueur joueur= null;
		System.out.println("Tapez 1 pour créer un personnage et 2 pour charger un personnage");
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		while(a !=1 && a!=2)
		{
			System.out.println("Tapez 1 pour créer un personnage et 2 pour charger un personnage");
			a= input.nextInt();
			
		}
		if(a ==1)
		{
			System.out.println("Choisissez le nom de votre personnage");
			String b= input.next();
			int degres;
			int force[]=new int[2];
			int adresse[]=new int[2];
			int resistance[]=new int[2];
			int etreSur;
			do{
				System.out.println("Repartissez vos degres entre la force, l'adresse et la resistance.");
				degres=18;
				do{
					System.out.println("Degres : "+degres);
					System.out.print("Force: ");
					force[1]=input.nextInt();
				}while(force[1]>degres);
				degres-=force[1];
				do{
					System.out.println("Degres : "+degres);
					System.out.print("Adresse: ");
					adresse[1]=input.nextInt();
				}while(adresse[1]>degres);
				degres-=adresse[1];
				System.out.println("Degres : "+degres);
				System.out.println("Resistance: "+degres);
				resistance[1]=degres;
				degres-=resistance[1];
				System.out.println("Etes-vous sur ? 0-Oui  1-Non");
				etreSur=input.nextInt();
			}while(etreSur != 0);
			joueur= new PersonnageJoueur(6,10,new Inventaire(),b,new int[2],force,adresse,resistance);
		}
		else
		{
			joueur= new PersonnageJoueur();
			try{
				
				
				lec= new FileReader(file);
				BufferedReader buff= new BufferedReader(lec);
				String line = buff.readLine();
				joueur.setNom(line);
				line = buff.readLine();
				joueur.setPointAction(Integer.parseInt(line));
//				System.out.println(joueur.getPointAction()+"dfdf");
				line=buff.readLine();
				joueur.setPointVie(Integer.parseInt(line));
				line=buff.readLine();
				joueur.setStartTime(Long.parseLong(line));
				line=buff.readLine();
				joueur.getInventaire().setTailleSacADos(Integer.parseInt(line));
				line=buff.readLine();
				if(Boolean.parseBoolean(line))
				{
					
					line=buff.readLine();
					String nom= line;
					//joueur.getInventaire().getArmure().setNom(line);
					int tab[]= new int[2];
					for(int i=0;i<2;i++)
					{//encombrement
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
					}
				//	joueur.getInventaire().getArmure().setEncombrement(tab);
					int tab2[]=new int[2];
					for(int i=0;i<2;i++)
					{//solidite
						line=buff.readLine();
						tab2[i]= Integer.parseInt(line);
					}
					Armure vet= new Armure(nom,tab2,tab);
					joueur.getInventaire().setArmure(vet);
					//joueur.getInventaire().getArmure().setSolidite(tab);
				}
				
				line=buff.readLine();
				
				if(Boolean.parseBoolean(line))
				{
					line=buff.readLine();
					joueur.getInventaire().getArme()[0].setNom(line);
					line=buff.readLine();
					joueur.getInventaire().getArme()[1].setNom(line);
					int tab[]= new int[2];
					int tab2[]= new int[2];
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						line=buff.readLine();
						tab2[i]= Integer.parseInt(line);
						
					}
					joueur.getInventaire().getArme()[0].setEncombrement(tab);
					joueur.getInventaire().getArme()[1].setEncombrement(tab2);
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						line=buff.readLine();
						tab2[i]= Integer.parseInt(line);
					}
					joueur.getInventaire().getArme()[0].setSolidite(tab);
					joueur.getInventaire().getArme()[1].setSolidite(tab2);
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						line=buff.readLine();
						tab2[i]= Integer.parseInt(line);
					}
					joueur.getInventaire().getArme()[0].setManiabilite(tab);
					joueur.getInventaire().getArme()[1].setManiabilite(tab2);
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						line=buff.readLine();
						tab2[i]= Integer.parseInt(line);
						
					}
					joueur.getInventaire().getArme()[0].setImpact(tab);
					joueur.getInventaire().getArme()[1].setImpact(tab2);
				}
				
				line=buff.readLine();
				if(Boolean.parseBoolean(line))
				{
					line=buff.readLine();
					joueur.getInventaire().getPaireBottes().setNom(line);
					int tab[]= new int[2];
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						
					}
					joueur.getInventaire().getPaireBottes().setEncombrement(tab);
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						
					}
					joueur.getInventaire().getPaireBottes().setSolidite(tab);
				}
				line=buff.readLine();
				if(Boolean.parseBoolean(line))
				{
					line=buff.readLine();
					joueur.getInventaire().getGants()[0].setNom(line);
					joueur.getInventaire().getGants()[1].setNom(line);
					int tab[]= new int[2];
					int tab2[]= new int[2];
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						line=buff.readLine();
						tab2[i]= Integer.parseInt(line);
						
					}
					joueur.getInventaire().getGants()[0].setEncombrement(tab);
					joueur.getInventaire().getGants()[1].setEncombrement(tab2);
					for(int i=0;i<2;i++)
					{
						line=buff.readLine();
						tab[i]= Integer.parseInt(line);
						line=buff.readLine();
						tab2[i]= Integer.parseInt(line);
					}
					joueur.getInventaire().getGants()[0].setSolidite(tab);
					joueur.getInventaire().getGants()[1].setSolidite(tab2);
				}
				int px[]= new int[2];
				int force[]= new int[2];
				int adresse[]= new int[2];
				int resistance[]= new int[2];
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					px[i]= Integer.parseInt(line);
					line=buff.readLine();
					force[i]= Integer.parseInt(line);
					line=buff.readLine();
					adresse[i]= Integer.parseInt(line);
					line=buff.readLine();
					resistance[i]= Integer.parseInt(line);
					
				}
				joueur.setPx(px);
				joueur.setForce(force);
				joueur.setAdresse(adresse);
				joueur.setResistance(resistance);
				
//				while(line  != null)
//				{
//					System.out.println(line);
//					line=buff.readLine();
//					
//				}
			        
				/*char rep= (char)(lec.read());
				System.out.println(line+" dfd");*/
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				if(lec != null)
				{
					lec.close();
				}
			}
			
		}	
		return joueur;
	}




}
