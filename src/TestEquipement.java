import ehptm.mmorpg.svr.classe.metier.Armure;
import ehptm.mmorpg.svr.classe.metier.Equipement;
import ehptm.mmorpg.svr.classe.metier.Gants;
import ehptm.mmorpg.svr.classe.metier.PaireBottes;


public class TestEquipement {

	public static void main(String[] args) {

		//Test equipement
		int[] solidite={2,10};
		int[] encombrement={1,10};
		Equipement equip1=new Equipement("SuperArmure",solidite,encombrement);
		Equipement equip1_1=new Equipement(equip1);
		Equipement equip2=new Equipement("Equipement detruit");
		System.out.println(equip1+"]");
		System.out.println(equip1_1+"]");
		System.out.println(equip2+"]");
		//Test Armure
		Armure armure=new Armure(Armure.ARMURE_BRONZE);
		System.out.println(armure);
		Armure armure1=new Armure(armure);
		int[] arm1Solid={6,0};
		armure1.setSolidite(arm1Solid);
		System.out.println(armure1);
		Armure armure2=new Armure("Armure du Chevalier Invisible",arm1Solid,encombrement);
		System.out.println(armure2);
		//Test PaireBottes
		PaireBottes paire1=new PaireBottes(PaireBottes.PAIREBOTTES_OR);
		System.out.println(paire1);
		PaireBottes paire2=new PaireBottes(paire1);
		System.out.println(paire2);
		paire2.setNom("Sandalette du roi");
		System.out.println(paire2);
		System.out.println(paire1);
		PaireBottes paire3=new PaireBottes("Chaussure volante",solidite,encombrement);
		System.out.println(paire3);
		//Test Gants
		Gants gants=new Gants(Gants.GANT_CUIR);
		Gants gants_cop=new Gants(gants);
		Gants gants_new=new Gants("Gants electronique",solidite,encombrement);
		System.out.println(gants+"\n"+gants_cop+"\n"+gants_new);
		gants_cop.setNom(gants_cop.getNom()+" troué");
		gants_cop.setSolidite(new int[2]);
		System.out.println(gants+"\n"+gants_cop+"\n"+gants_new);
	}

}
