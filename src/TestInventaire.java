public class TestInventaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item[] sac={new PotionSoin(PotionSoin.SOIN_2),new Arme(Arme.BOUCLIER,"d'amadusum"),new Armure(Armure.ARMURE_BRONZE)};
		Arme[] arme={new Arme(Arme.EPEE,"de bablabus"),null};
		Gants[]	gants= new Gants[2];
		Inventaire inventaire=new Inventaire(sac,new Armure(Armure.ARMURE_BRONZE),arme,new PaireBottes(PaireBottes.PAIREBOTTES_CUIR),gants);
		Inventaire inventaire2=new Inventaire(inventaire);
		String s="";
		for(int i=0;i<inventaire.getSacADos().length;i++){
			s+=inventaire.getSacADos()[i]+"\n";
		}
		System.out.println(s);
		String s1="";
		for(int i=0;i<inventaire2.getSacADos().length;i++){
			s1+=inventaire2.getSacADos()[i]+"\n";
		}
		System.out.println(s1);
	}

}