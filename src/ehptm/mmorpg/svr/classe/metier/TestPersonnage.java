package ehptm.mmorpg.svr.classe.metier;

import java.io.IOException;

import ehptm.mmorpg.svr.classe.dialogue.SauvegarderPersonnage;

public class TestPersonnage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonnageJoueur a= new PersonnageJoueur();
		
		PersonnageNonJoueur b= new PersonnageNonJoueur();
		System.out.println(b);
		Item[] sac= new Item[10];
		sac[0]=new PotionSoin(PotionSoin.SOIN_2);
		sac[1]=new Arme(Arme.BOUCLIER,"d'amadusum");
		sac[2]=new Armure(Armure.ARMURE_BRONZE);
		Arme[] arme= new Arme[2];
		arme[0]= new Arme(Arme.EPEE,"de bablabus");
		arme[1]= new Arme(Arme.BOUCLIER,"gemme");
		Gants[]	gants= new Gants[2];
		gants[0]= new Gants("rex");
		gants[1]= new Gants("zangetsu");
		Inventaire inventaire=new Inventaire(sac,new Armure(Armure.ARMURE_BRONZE),arme,new PaireBottes(PaireBottes.PAIREBOTTES_CUIR),gants);
		Personnage c= new PersonnageJoueur(a);
		System.out.println(c);
		a.setNom("tanos");
		
		
		a.setInventaire(inventaire);
		b.setInventaire(inventaire);
		System.out.println(a+" dfdf");
		a.attaquer(b);
		System.out.println(b);
		System.out.println(a.getPointAction());
		
		Monstre m= new Monstre(6, 6, inventaire, "tarantule", 2);
		m.setPointVie(0);
		Inventaire x=m.dropItem();
		System.out.println(m.getPointVie());
		System.out.println(m.getInventaire());
		System.out.println(x);
		System.out.println(b.etat());
		Carte y= new Carte();
		
		y.ajouter(a);
		y.ajouter(b);
		y.ajouter(c);
		System.out.println(y.toString());
		System.out.println(y.deplacer(a, -1, -1));
		System.out.println(y.toString());
		Partie p= new Partie(Partie.PARTIE_COURTE);
		p.setCarte(y);
		a.recuperationPointAction(p);
		System.out.println(a.getPointAction());
//		System.out.println(a.getPointAction());
		try{
		SauvegarderPersonnage.sauvegarder(a);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
