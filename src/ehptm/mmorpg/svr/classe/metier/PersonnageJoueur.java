package ehptm.mmorpg.svr.classe.metier;
public class PersonnageJoueur extends Personnage {

	private int[] px;
	private int[] force;
	private int[] adresse;
	private int[] resistance;
	
	public PersonnageJoueur(int pointVie, int pointAction, Inventaire inventaire, String nom, int[] px, int[] force, int[] adresse, int[] resistance) {
		super(pointVie, pointAction, inventaire, nom);
		this.px = px;
		this.force = force;
		this.adresse = adresse;
		this.resistance = resistance;
	}
	
	public PersonnageJoueur()
	{
		super();
		this.px= new int[2];
		this.force= new int[2];
		this.adresse= new int[2];
		this.resistance= new int[2];
		for(int i=0;i<2;i++)
		{
			this.px[i]=9;
			this.force[i]=9;
			this.adresse[i]=9;
			this.resistance[i]=9;
		}
		
	}
	
	public PersonnageJoueur(PersonnageJoueur a)
	{
		this.px= new int[2];
		this.force= new int[2];
		this.adresse= new int[2];
		this.resistance= new int[2];
		for(int i=0;i<2;i++)
		{
			this.px[i]= a.getPx()[i];
			this.force[i]= a.getForce()[i];
			this.adresse[i]= a.getAdresse()[i];
			this.resistance[i]= a.getResistance()[i];
		}
	}
	
	public int[] getPx() {
		return px;
	}


	public void setPx(int[] px) {
		this.px = px;
	}


	public int[] getForce() {
		return force;
	}


	public void setForce(int[] force) {
		this.force = force;
	}


	public int[] getAdresse() {
		return adresse;
	}


	public void setAdresse(int[] adresse) {
		this.adresse = adresse;
	}


	public int[] getResistance() {
		return resistance;
	}


	public void setResistance(int[] resistance) {
		this.resistance = resistance;
	}


	public int[] initiative()
	{
		int[] encombrement= new int[2];
		encombrement[0]=0;
		encombrement[1]=0;
		
		for(int i=0;i<2;i++){
			if(this.getInventaire().getArme()[i]!=null){
				encombrement[0]+=this.getInventaire().getArme()[i].getEncombrement()[0];
				encombrement[1]+=this.getInventaire().getArme()[i].getEncombrement()[1];
			}
		}
		for(int i=0;i<this.getInventaire().getGants().length;i++){
			if(this.getInventaire().getArme()[i]!=null){
				encombrement[0]+=this.getInventaire().getGants()[i].getEncombrement()[0];
				encombrement[1]+=this.getInventaire().getGants()[i].getEncombrement()[1];
			}
		}
		if(this.getInventaire().getArmure()!=null){
			encombrement[0]+=this.getInventaire().getArmure().getEncombrement()[0];
			encombrement[1]+=this.getInventaire().getArmure().getEncombrement()[1];
		}
		if(this.getInventaire().getPaireBottes()!=null){
			encombrement[0]+=this.getInventaire().getPaireBottes().getEncombrement()[0];
			encombrement[1]+=this.getInventaire().getPaireBottes().getEncombrement()[1];
		}
		System.out.println(encombrement[0]+" zz");
		System.out.println(encombrement[1]+" yy");
		
		encombrement[0]= this.getAdresse()[0]- encombrement[0];
		encombrement[1]= this.getAdresse()[1]- encombrement[1];
		
		if(encombrement[0]<0)
		{
			encombrement[0]=0;
		}
		if(encombrement[1]<0)
		{
			encombrement[1]=0;
		}
		return encombrement;
	}
	public int[] attaque()
	{
		int tab[]= new int[2];
		if(this.getInventaire().getArme()[0]!=null && this.getInventaire().getArme()[1]!=null){
			tab[0]=	this.getInventaire().getArme()[0].getManiabilite()[0]+this.getInventaire().getArme()[1].getManiabilite()[0];
			tab[1]= this.getInventaire().getArme()[0].getManiabilite()[1]+this.getInventaire().getArme()[1].getManiabilite()[1];
		}
		tab[0]= tab[0]+ this.getAdresse()[0];
		tab[1]= tab[1]+this.getAdresse()[1];
		return tab;
	}
	public int[] esquive()
	{
		return this.initiative(); // car meme formule que initiative donc gain de temps
	}
	public int[] degats()
	{
		int tab[]= new int[2];
		for(int i=0;i<this.getInventaire().getArme().length;i++){
			if(this.getInventaire().getArme()[i]!=null){
				tab[0]+=this.getInventaire().getArme()[i].getImpact()[0];
				tab[1]+=this.getInventaire().getArme()[i].getImpact()[1];
			}
		}
		
		tab[0]= tab[0]+ this.getForce()[0];
		tab[1]= tab[1]+ this.getForce()[1];
		
			return tab;
			
	}
	public int[] defense()
	{
		int tab[]= new int[2];
		for(int i=0;i<this.getInventaire().getArme().length;i++){
			if(this.getInventaire().getArme()[i]!=null){
				tab[0]+=	this.getInventaire().getArme()[i].getSolidite()[0];
				tab[1]+= this.getInventaire().getArme()[i].getSolidite()[1];
			}
		}
		for(int i=0;i<this.getInventaire().getGants().length;i++){
			if(this.getInventaire().getArme()[i]!=null){
				tab[0]+=this.getInventaire().getGants()[i].getSolidite()[0];
				tab[1]+=this.getInventaire().getGants()[i].getSolidite()[1];
			}
		}
		if(this.getInventaire().getPaireBottes()!=null){
			tab[0]+=this.getInventaire().getPaireBottes().getSolidite()[0];
			tab[1]+=this.getInventaire().getPaireBottes().getSolidite()[1];
		}
		if(this.getInventaire().getArmure() != null){
			tab[0]+=this.getInventaire().getArmure().getSolidite()[0];
			tab[1]+=this.getInventaire().getArmure().getSolidite()[1];
		}
		
		tab[0]= tab[0]+ this.getResistance()[0];
		tab[1]= tab[1]+ this.getResistance()[1];
		return tab;
	}
	/*
	public void dropItem(Item nom)
	{
		for(int i=0;i<this.getInventaire().getTailleSacADos();i++)
		{
			if(this.getInventaire().getSacADos()[i].equals(nom.getNom()))//m�thode equals a definir dans la classe Item 
			{
				this.getInventaire().getSacADos()[i]= null;
			}
		}
	}*/
	
	public boolean attaquer(Personnage cible) // cette m�thode ne calcule pas les carac mais fait des d�gats
	{
		boolean mess=false;
		if(this.getPointAction()>=3)
		{
			this.setPointAction(this.getPointAction()-3);
			int somme=0;
			for(int i=0;i<this.attaque()[0];i++)
			{
				int a= (int)((Math.random()*(7-1))+1);
				somme+= a;
			}
			somme+= this.attaque()[1];		
			if(cible instanceof PersonnageJoueur)
			{
				PersonnageJoueur b= new PersonnageJoueur((PersonnageJoueur)cible);
					int somme2=0;
					for(int i=0;i<b.esquive()[0];i++)
					{
						int a= (int)((Math.random()*(7-1))+1);
						somme2 += a;
					}
					somme2 += b.esquive()[1];
					if(somme> somme2)
					{
						int degats=0;
						for(int i=0;i<this.degats()[0];i++)
						{
							int a= (int)((Math.random()*(7-1))+1);
							degats += a;
						}
						degats += this.degats()[1];
						int def=0;
						for(int i=0;i<b.defense()[0];i++)
						{
							int a= (int)((Math.random()*(7-1))+1);
							def += a;
						}
						def += b.defense()[1];
						int difference= degats- def;
						int pvPerdu= (int) difference/3;
						System.out.println(pvPerdu);
						cible.setPointVie(cible.getPointVie()- pvPerdu);
						if(cible.getPointVie()<0)
						{
							cible.setPointVie(0);
						}
						
						mess= true;
					}
			
			}
			if(cible instanceof PersonnageNonJoueur)
			{
				PersonnageNonJoueur newCible = new PersonnageNonJoueur((PersonnageNonJoueur) cible);
				if(somme> newCible.getInitiative())
				{
					int degats=0;
					for(int i=0;i<this.degats()[0];i++)
					{
						int a= (int)((Math.random()*(7-1))+1);
					degats += a;
					}
					degats += this.degats()[1];
					int difference= degats - newCible.getDefense();
					int pvPerdu= (int)difference/3;
					cible.setPointVie(cible.getPointVie()- pvPerdu);
					if(cible.getPointVie()<0)
					{
						cible.setPointVie(0);
					}
					
					mess=true;
				}
				
			}
		
		}
		
		return mess;
	}
	
	public void recuperationPointAction(Partie partie)
	{
		int degre =this.initiative()[0]*3+this.initiative()[1];
		long endTime = System.currentTimeMillis();
		long dla= this.getStartTime();
		if(endTime-dla>= partie.getDuree())
		{
			this.setPointAction((int)(this.getPointAction()+(degre*0.5)));
			if(this.getPointAction()>6)
			{
				this.setPointAction(6);
			}
		}
		
	}
	
	
}
