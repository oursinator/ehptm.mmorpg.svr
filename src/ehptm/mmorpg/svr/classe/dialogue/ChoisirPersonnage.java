package ehptm.mmorpg.svr.classe.dialogue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import ehptm.mmorpg.svr.classe.metier.Personnage;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;

public class ChoisirPersonnage{

	public static Personnage choisirPersonnage() throws IOException
	{
		File file = new File("test.txt");
		FileReader lec= null;
		PersonnageJoueur joueur= null;
		System.out.println("Tapez 1 pour créer un personnage et 2 pour charger un personnage");
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		while(a !=1 || a!=2)
		{
			System.out.println("Tapez 1 pour créer un personnage et 2 pour charger un personnage");
			a= input.nextInt();
			
		}
		if(a ==1)
		{
			System.out.println("Choisissez le nom de votre personnage");
			String b= input.next();
			joueur= new PersonnageJoueur();
			joueur.setNom(b);
			
		}
		else
		{
			try{
				
				lec= new FileReader(file);
				joueur.setNom((char)lec.read());
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
