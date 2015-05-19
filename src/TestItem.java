import ehptm.mmorpg.svr.classe.metier.Item;


public class TestItem {

	public static void main(String[] args) {
		Item item=new Item("saperlipopette");
		Item item1=new Item(item);
		System.out.println(item);
		item1.setNom(item1.getNom()+" bleurbum");
		System.out.println(item1);
	}

}
