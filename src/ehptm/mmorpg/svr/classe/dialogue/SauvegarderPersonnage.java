package ehptm.mmorpg.svr.classe.dialogue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;

public class SauvegarderPersonnage{

	public static void sauvegarder(PersonnageJoueur joueur) throws IOException
	{
		File file= new File("test.txt");
		FileWriter w= null;
		String nom=joueur.getNom();
		int pa= joueur.getPointAction();
		int pv= joueur.getPointVie();
		long time= joueur.getStartTime();
		int taille= joueur.getInventaire().getTailleSacADos();
		
		boolean armure= false;
		boolean arme= false;
		boolean bottes= false;
		boolean gants= false;

		if(joueur.getInventaire().getArmure() != null)
		{
			armure= true;
		}
		if(joueur.getInventaire().getArme() != null)
		{
			arme= true;
		}
		if(joueur.getInventaire().getPaireBottes() != null)
		{
			bottes= true;
		}
		if(joueur.getInventaire().getGants() != null)
		{
			gants= true;
		}



		try{
			w= new FileWriter(file,true);
			w.write(nom+"\r\n");
			w.write(pa+"\r\n");
			w.write(pv+"\r\n");
			w.write(time+"\r\n");
			w.write(taille+"\r\n");
			
			w.write(armure+"\r\n");
			if(armure==true)
			{
				w.write(joueur.getInventaire().getArmure().getNom()+"\r\n");

				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArmure().getEncombrement()[i]+"\r\n");
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArmure().getSolidite()[i]+"\r\n");
				}
			}
			if(arme==true)
			{
				w.write(joueur.getInventaire().getArme()[0].getNom()+"\r\n");
				w.write(joueur.getInventaire().getArme()[1].getNom()+"\r\n");
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getEncombrement()[i]+"\r\n");
					w.write(joueur.getInventaire().getArme()[1].getEncombrement()[i]+"\r\n");
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getSolidite()[i]+"\r\n");
					w.write(joueur.getInventaire().getArme()[1].getSolidite()[i]+"\r\n");
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getManiabilite()[i]+"\r\n");
					w.write(joueur.getInventaire().getArme()[1].getManiabilite()[i]+"\r\n");
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getImpact()[i]+"\r\n");
					w.write(joueur.getInventaire().getArme()[1].getImpact()[i]+"\r\n");
				}
			}
			if(bottes==true)
			{
				w.write(joueur.getInventaire().getPaireBottes().getNom()+"\r\n");

				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getPaireBottes().getEncombrement()[i]+"\r\n");
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getPaireBottes().getSolidite()[i]+"\r\n");
				}
			}
			if(gants==true)
			{
				w.write(joueur.getInventaire().getGants()[0].getNom()+"\r\n");
				w.write(joueur.getInventaire().getGants()[1].getNom()+"\r\n");
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getGants()[0].getEncombrement()[i]+"\r\n");
					w.write(joueur.getInventaire().getGants()[1].getEncombrement()[i]+"\r\n");
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getGants()[0].getSolidite()[i]+"\r\n");
					w.write(joueur.getInventaire().getGants()[1].getSolidite()[i]+"\r\n");
				}
				
			}
			for(int i=0;i<2;i++)
			{
				w.write(joueur.getPx()[i]+"\r\n");
				w.write(joueur.getForce()[i]+"\r\n");
				w.write(joueur.getAdresse()[i]+"\r\n");
				w.write(joueur.getResistance()[i]+"\r\n");
			}

		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(w != null)
			{
				w.close();
			}
		}

	}
}
