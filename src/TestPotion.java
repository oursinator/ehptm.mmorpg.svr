import ehptm.mmorpg.svr.classe.metier.Potion;
import ehptm.mmorpg.svr.classe.metier.PotionMolotov;
import ehptm.mmorpg.svr.classe.metier.PotionSoin;


public class TestPotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Potion potion[]={new PotionSoin(PotionSoin.SOIN_1),new PotionSoin(PotionSoin.SOIN_2),new PotionSoin("radimusus"),
				new PotionMolotov(PotionMolotov.MOLOTOV_1),new PotionMolotov(PotionMolotov.MOLOTOV_2),new PotionMolotov("bleurburn")};
		
		for(int i =0;i<potion.length;i++){
			System.out.println(potion[i]);
		}
	
	
	}

}
