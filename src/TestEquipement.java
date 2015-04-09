
public class TestEquipement {

	public static void main(String[] args) {

		int[] solidite={2,10};
		int[] encombrement={1,10};
		Equipement equip1=new Equipement("SuperArmure",solidite,encombrement);
		Equipement equip1_1=new Equipement(equip1);
		Equipement equip2=new Equipement("SSS");
		System.out.println(equip1);
		System.out.println(equip1_1);
		System.out.println(equip2);
		Armure armure=new Armure(Armure.ARMURE_BRONZE);
		System.out.println(armure);
		Armure armure1=new Armure(armure);
		System.out.println(armure1);
	}

}
