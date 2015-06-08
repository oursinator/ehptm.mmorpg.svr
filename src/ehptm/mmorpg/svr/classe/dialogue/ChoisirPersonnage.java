package ehptm.mmorpg.svr.classe.dialogue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ehptm.mmorpg.svr.classe.metier.Arme;
import ehptm.mmorpg.svr.classe.metier.Armure;
import ehptm.mmorpg.svr.classe.metier.Gants;
import ehptm.mmorpg.svr.classe.metier.Inventaire;
import ehptm.mmorpg.svr.classe.metier.Item;
import ehptm.mmorpg.svr.classe.metier.PaireBottes;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;

public class ChoisirPersonnage{

	
	public static PersonnageJoueur chargerPersonnage() throws IOException,Exception{
		PersonnageJoueur perso=new PersonnageJoueur();
		Arme arme[]=new Arme[2];
		Gants gants[]=new Gants[2];
		File file = new File("test.txt");
		if(!file.exists())throw new Exception("Aucune sauvegarde ..");
		FileReader lec= new FileReader(file);;
		try{
			BufferedReader buff= new BufferedReader(lec);
			String line = buff.readLine();
			perso.setNom(line);
			line = buff.readLine();
			perso.setPointAction(Integer.parseInt(line));
			line=buff.readLine();
			perso.setPointVie(Integer.parseInt(line));
			line=buff.readLine();
			perso.getInventaire().setTailleSacADos(Integer.parseInt(line));
			line=buff.readLine();
			if(Boolean.parseBoolean(line))
			{
				String nom=buff.readLine();
				int encombrement[]= new int[2];
				int solidite[]= new int[2];
				for(int i=0;i<2;i++)
				{//encombrement
					line=buff.readLine();
					encombrement[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{//solidite
					line=buff.readLine();
					solidite[i]= Integer.parseInt(line);
				}
				perso.getInventaire().setArmure(new Armure(nom,solidite,encombrement));
			}
			
			line=buff.readLine();
			if(Boolean.parseBoolean(line))
			{
				String nom=buff.readLine();
				int encombrement[]= new int[2];
				int solidite[]= new int[2];
				int maniabilite[]= new int[2];
				int impact[]= new int[2];
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					encombrement[i]= Integer.parseInt(line);
					
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					solidite[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					maniabilite[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					impact[i]= Integer.parseInt(line);
				}
				arme[0]=new Arme(nom,solidite,encombrement,maniabilite,impact);
			}
			line=buff.readLine();
			if(Boolean.parseBoolean(line))
			{
				String nom=buff.readLine();
				int encombrement[]= new int[2];
				int solidite[]= new int[2];
				int maniabilite[]= new int[2];
				int impact[]= new int[2];
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					encombrement[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					solidite[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					maniabilite[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					impact[i]= Integer.parseInt(line);
				}
				arme[1]=new Arme(nom,solidite,encombrement,maniabilite,impact);
			}
			perso.getInventaire().setArme(arme);
			
			line=buff.readLine();
			if(Boolean.parseBoolean(line))
			{
				String nom=buff.readLine();
				int encombrement[]= new int[2];
				int solidite[]= new int[2];
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					encombrement[i]= Integer.parseInt(line);
					
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					solidite[i]= Integer.parseInt(line);
					
				}
				perso.getInventaire().setPaireBottes(new PaireBottes(nom,solidite,encombrement));
			}
			line=buff.readLine();
			if(Boolean.parseBoolean(line))
			{
				String nom=buff.readLine();
				int encombrement[]= new int[2];
				int solidite[]= new int[2];
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					encombrement[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					solidite[i]= Integer.parseInt(line);
				}
				gants[0]=new Gants(nom,solidite,encombrement);
			}
			line=buff.readLine();
			if(Boolean.parseBoolean(line))
			{
				String nom=buff.readLine();
				int encombrement[]= new int[2];
				int solidite[]= new int[2];
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					encombrement[i]= Integer.parseInt(line);
				}
				for(int i=0;i<2;i++)
				{
					line=buff.readLine();
					solidite[i]= Integer.parseInt(line);
				}
				gants[1]=new Gants(nom,solidite,encombrement);
			}
			perso.getInventaire().setGants(gants);
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
			perso.setPx(px);
			perso.setForce(force);
			perso.setAdresse(adresse);
			perso.setResistance(resistance);
			for(int i=0;i<perso.getInventaire().getSacADos().length;i++)
			{
				Item item=null;
				String type=buff.readLine();
				if(!Boolean.parseBoolean(type)){
					if(type.equals("PotionSoin")){
						String nom=buff.readLine();
						int pa=Integer.parseInt(buff.readLine());
						int soin=Integer.parseInt(buff.readLine());
					}
					else if(type.equals("PotionMolotov")){
						String nom=buff.readLine();
						int pa=Integer.parseInt(buff.readLine());
						int degat=Integer.parseInt(buff.readLine());
						int radius=Integer.parseInt(buff.readLine());
					}
					else if(type.equals("Arme")){
						String nom=buff.readLine();
						int encombrement[]= new int[2];
						int solidite[]= new int[2];
						int maniabilite[]= new int[2];
						int impact[]= new int[2];
						for(int n=0;n<2;n++)
						{
							line=buff.readLine();
							encombrement[i]= Integer.parseInt(line);
						}
						for(int n=0;n<2;n++)
						{
							line=buff.readLine();
							solidite[i]= Integer.parseInt(line);
						}
						for(int n=0;n<2;n++)
						{
							line=buff.readLine();
							maniabilite[i]= Integer.parseInt(line);
						}
						for(int n=0;n<2;n++)
						{
							line=buff.readLine();
							impact[i]= Integer.parseInt(line);
						}
						item=new Arme(nom,solidite,encombrement,maniabilite,impact);
					}
					else if(type.equals("Armure") || type.equals("Gants") || type.equals("PaireBottes")){
						String nom=buff.readLine();
						int encombrement[]= new int[2];
						int solidite[]= new int[2];
						for(int n=0;n<2;n++)
						{
							line=buff.readLine();
							encombrement[i]= Integer.parseInt(line);
						}
						for(int n=0;n<2;n++)
						{
							line=buff.readLine();
							solidite[i]= Integer.parseInt(line);
						}
						if(type.equals("Armure"))
							item=new Armure(nom,solidite,encombrement);
						else if(type.equals("Armure"))
							item=new Gants(nom,solidite,encombrement);
						else if(type.equals("PaireBottes"))
							item=new PaireBottes(nom,solidite,encombrement);
					}
				}
				perso.getInventaire().getSacADos()[i]=item;
			}
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
		
		return perso;
	}
	public static PersonnageJoueur creerPersonnage(){
		PersonnageJoueur joueur;
		Scanner input= new Scanner(System.in);
		System.out.println("Choisissez le nom de votre personnage");
		String b= input.next();
		int degres;
		int force[]=new int[2];
		int adresse[]=new int[2];
		int resistance[]=new int[2];
		int etreSur=-1;
		do{
			try{
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
			}catch(InputMismatchException e){
				System.out.println("On demande un nombre, on recommence ..");
				input= new Scanner(System.in);
			}
		}while(etreSur != 0);
		Inventaire inventaire=new Inventaire();
		joueur= new PersonnageJoueur(6,25,inventaire,b,new int[2],force,adresse,resistance);
		return joueur;
		
	}
	public static PersonnageJoueur choisirPersonnage() throws IOException
	{
		
		PersonnageJoueur joueur= null;
		Scanner input= new Scanner(System.in);
		int a;
		do{
			System.out.println("Tapez 1 pour créer un personnage et 2 pour charger un personnage");
			try{
				a= input.nextInt();
			}catch(InputMismatchException e){
				a=-1;
				input= new Scanner(System.in);
			}
		}while(a !=1 && a!=2);
		if(a ==1)
		{
			joueur= ChoisirPersonnage.creerPersonnage();
		}
		else
		{
			try{
				joueur= ChoisirPersonnage.chargerPersonnage();
				System.out.println("Voici le personnage que vous voulez charger: ");
				InformationPersonnage.afficherEtat(joueur);
				InformationPersonnage.afficherCaracteristique(joueur);
				InformationPersonnage.afficherPointAction(joueur);
				GestionInventaire.afficheInventaire(joueur.getInventaire());
				int choix;
				do{
					System.out.println("Etes vous sur ?\n"
							+ " 1 - Pour charger ce personnage\n"
							+ " 2 - Pour en creer un nouveau");
					try{
						choix=input.nextInt();
					}catch(Exception e){
						System.out.println("Oups je n'ai pas compris. Est-ce vraiment un chiffre ?");
						choix=0;
						input= new Scanner(System.in);
					}
				}while(choix<1 || choix>2);
				if(choix==2){
					ChoisirPersonnage.creerPersonnage();
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
				ChoisirPersonnage.creerPersonnage();
			}
			
		}	
		return joueur;
	}




}
