package ehptm.mmorpg.svr.classe.dialogue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ehptm.mmorpg.svr.classe.metier.Arme;
import ehptm.mmorpg.svr.classe.metier.Armure;
import ehptm.mmorpg.svr.classe.metier.Equipement;
import ehptm.mmorpg.svr.classe.metier.Gants;
import ehptm.mmorpg.svr.classe.metier.PaireBottes;
import ehptm.mmorpg.svr.classe.metier.PersonnageJoueur;
import ehptm.mmorpg.svr.classe.metier.PotionMolotov;
import ehptm.mmorpg.svr.classe.metier.PotionSoin;

public class SauvegarderPersonnage{

	public static void sauvegarder(PersonnageJoueur joueur) throws IOException
	{
		File file= new File("test.txt");
		if(!file.exists())
			file.createNewFile();
		System.out.println(file.exists());
		BufferedWriter  w= null;
		String nom=joueur.getNom();
		int pa= joueur.getPointAction();
		int pv= joueur.getPointVie();
		int taille= joueur.getInventaire().getTailleSacADos();


		try{
			w= new BufferedWriter(new FileWriter(file));
			w.write(nom);w.newLine();			
			w.write(pa+"");w.newLine();
			w.write(pv+"");w.newLine();
			w.write(taille+"");w.newLine();
			if(joueur.getInventaire().getArmure()!=null){
				w.write(""+true);w.newLine();
				w.write(joueur.getInventaire().getArmure().getNom());

				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArmure().getEncombrement()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArmure().getSolidite()[i]);w.newLine();
				}
			}
			else{
				w.write(""+false);w.newLine();
			}
			if(joueur.getInventaire().getArme()[0]!=null){
				w.write(""+true);w.newLine();
				w.write(joueur.getInventaire().getArme()[0].getNom());w.newLine();				
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getEncombrement()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getSolidite()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getManiabilite()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[0].getImpact()[i]);w.newLine();
				}
			}
			else{
				w.write(""+false);w.newLine();
			}
			if(joueur.getInventaire().getArme()[1]!=null){
				w.write(""+true);w.newLine();
				w.write(joueur.getInventaire().getArme()[1].getNom());w.newLine();				
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[1].getEncombrement()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[1].getSolidite()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[1].getManiabilite()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getArme()[1].getImpact()[i]);w.newLine();
				}
			}
			else{
				w.write(""+false);w.newLine();
			}
			if(joueur.getInventaire().getPaireBottes()!=null)
			{
				w.write(""+true);
				w.write(joueur.getInventaire().getPaireBottes().getNom());w.newLine();

				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getPaireBottes().getEncombrement()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getPaireBottes().getSolidite()[i]);w.newLine();
				}
			}
			else{
				w.write(""+false);w.newLine();
			}
			if(joueur.getInventaire().getGants()[0]!=null)
			{
				w.write(""+true);w.newLine();
				w.write(joueur.getInventaire().getGants()[0].getNom());w.newLine();
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getGants()[0].getEncombrement()[i]);w.newLine();
				}
				for(int i=0;i<2;i++)
				{
					w.write(joueur.getInventaire().getGants()[0].getSolidite()[i]);w.newLine();
				}
				
			}
			else{
				w.write(""+false);w.newLine();
			}
			for(int i=0;i<2;i++)
			{
				w.write(""+joueur.getPx()[i]);w.newLine();
				w.write(""+joueur.getForce()[i]);w.newLine();
				w.write(""+joueur.getAdresse()[i]);w.newLine();
				w.write(""+joueur.getResistance()[i]);w.newLine();
			}
			for(int i=0;i<joueur.getInventaire().getSacADos().length;i++)
			{
				if(joueur.getInventaire().getSacADos()[i] == null){
					w.write(""+false);w.newLine();
				}
				else{
					if(joueur.getInventaire().getSacADos()[i] instanceof PotionSoin){
						w.write("PotionSoin");w.newLine();
						PotionSoin p=(PotionSoin)joueur.getInventaire().getSacADos()[i];
						w.write(p.getNom());w.newLine();
						w.write(""+p.getPointAction());w.newLine();
						w.write(""+p.getSoin());w.newLine();
					}
					else if(joueur.getInventaire().getSacADos()[i] instanceof PotionMolotov){
						w.write("PotionMolotov");w.newLine();
						PotionMolotov p=(PotionMolotov)joueur.getInventaire().getSacADos()[i];
						w.write(p.getNom());w.newLine();
						w.write(""+p.getPointAction());w.newLine();
						w.write(""+p.getDegat());w.newLine();
						w.write(""+p.getRadius());w.newLine();
					}
					else if(joueur.getInventaire().getSacADos()[i] instanceof Arme){
						w.write("Arme");w.newLine();
						Arme a=(Arme)joueur.getInventaire().getSacADos()[i];
						w.write(a.getNom());w.newLine();				
						for(int n=0;n<2;n++)
						{
							w.write(""+a.getEncombrement()[i]);w.newLine();
						}
						for(int n=0;n<2;n++)
						{
							w.write(""+a.getSolidite()[i]);w.newLine();
						}
						for(int n=0;n<2;n++)
						{
							w.write(""+a.getManiabilite()[i]);w.newLine();
						}
						for(int n=0;n<2;n++)
						{
							w.write(""+a.getImpact()[i]);w.newLine();
						}
					}
					else if(joueur.getInventaire().getSacADos()[i] instanceof Armure || joueur.getInventaire().getSacADos()[i] instanceof Gants || joueur.getInventaire().getSacADos()[i] instanceof PaireBottes){
						Equipement a=(Equipement)joueur.getInventaire().getSacADos()[i];
						if(joueur.getInventaire().getSacADos()[i] instanceof Armure){
							w.write("Armure");w.newLine();
						}
						else if(joueur.getInventaire().getSacADos()[i] instanceof Gants){
							w.write("Gants");w.newLine();
						}
						if(joueur.getInventaire().getSacADos()[i] instanceof PaireBottes){
							w.write("PaireBottes");w.newLine();
						}
						
						w.write(a.getNom());w.newLine();				
						for(int n=0;n<2;n++)
						{
							w.write(""+a.getEncombrement()[i]);w.newLine();
						}
						for(int n=0;n<2;n++)
						{
							w.write(""+a.getSolidite()[i]);w.newLine();
						}
					}
				}
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
