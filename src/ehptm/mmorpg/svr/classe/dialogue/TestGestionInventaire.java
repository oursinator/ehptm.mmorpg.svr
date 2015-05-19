package ehptm.mmorpg.svr.classe.dialogue;

import ehptm.mmorpg.svr.classe.metier.Arme;
import ehptm.mmorpg.svr.classe.metier.Armure;
import ehptm.mmorpg.svr.classe.metier.Gants;
import ehptm.mmorpg.svr.classe.metier.Inventaire;
import ehptm.mmorpg.svr.classe.metier.Item;
import ehptm.mmorpg.svr.classe.metier.PaireBottes;
import ehptm.mmorpg.svr.classe.metier.PotionSoin;

public class TestGestionInventaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] sac= new Item[10];
		sac[0]=new PotionSoin(PotionSoin.SOIN_2);
		sac[1]=new Arme(Arme.BOUCLIER,"d'amadusum");
		sac[2]=new Armure(Armure.ARMURE_BRONZE);
		Arme[] arme={new Arme(Arme.EPEE,"de bablabus"),null};
		Gants[]	gants= new Gants[2];
		Inventaire inventaire=new Inventaire(sac,new Armure(Armure.ARMURE_BRONZE),arme,new PaireBottes(PaireBottes.PAIREBOTTES_CUIR),gants);
		GestionInventaire.menuInventaire(inventaire);
	}

}
