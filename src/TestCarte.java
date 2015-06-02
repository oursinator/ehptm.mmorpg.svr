import ehptm.mmorpg.svr.classe.metier.Carte;


public class TestCarte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carte carte1=new Carte();
		System.out.println(carte1.getNom());
		String s="";
		System.out.println(Carte.TAILLE_GRILLE);
		for(int i=0;i<carte1.getGrille().length;i++){
			for(int j=0;j<carte1.getGrille()[0].length;j++){
				//System.out.println(i+" "+j);
				if(carte1.getGrille()[i][j]==null)
					System.out.print(" ");
				else if(carte1.getGrille()[i][j] instanceof Object)
					System.out.print("#");
			}
			System.out.print("\n");
		}
		System.out.println("\n"+s);
	}

}
