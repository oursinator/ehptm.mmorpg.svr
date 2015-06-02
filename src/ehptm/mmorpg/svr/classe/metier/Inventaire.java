package ehptm.mmorpg.svr.classe.metier;

public class Inventaire {
    private int tailleSacADos;

    private Item[] sacADos;

    private Armure armure;

    private Arme[] arme;

    private PaireBottes paireBottes;

    private Gants[] gants;

    public Inventaire(){
    	this.tailleSacADos=20;
    	this.sacADos=new Item[this.tailleSacADos];
    	this.arme=new Arme[2];
    	this.gants=new Gants[2];
    }
    public Inventaire(Item[] sacADos,Armure armure,Arme[] arme,PaireBottes paireBottes,Gants[] gants){
    	this.sacADos=sacADos;
    	this.tailleSacADos=sacADos.length;
    	this.armure=armure;
    	this.arme=arme;
    	this.paireBottes=paireBottes;
    	this.gants=gants;
    }
    public Inventaire(Inventaire inventaire){
    	this.tailleSacADos=inventaire.getSacADos().length;
    	this.armure=new Armure(inventaire.getArmure());
    	this.paireBottes=new PaireBottes(inventaire.getPaireBottes());
    	this.sacADos=new Item[inventaire.getSacADos().length];
    	for(int i=0;i<inventaire.getSacADos().length;i++){
    		if (inventaire.getSacADos()[i] instanceof Arme)
    			this.sacADos[i]=new Arme((Arme)inventaire.getSacADos()[i]);
    		else if (inventaire.getSacADos()[i] instanceof Armure)
    			this.sacADos[i]=new Armure((Armure)inventaire.getSacADos()[i]);
    		else if (inventaire.getSacADos()[i] instanceof Gants)
    			this.sacADos[i]=new Gants((Gants)inventaire.getSacADos()[i]);
    		else if (inventaire.getSacADos()[i] instanceof PaireBottes)
    			this.sacADos[i]=new PaireBottes((PaireBottes)inventaire.getSacADos()[i]);
    		else if (inventaire.getSacADos()[i] instanceof PotionSoin)
    			this.sacADos[i]=new PotionSoin((PotionSoin)inventaire.getSacADos()[i]);
    		else if (inventaire.getSacADos()[i] instanceof PotionMolotov)
    			this.sacADos[i]=new PotionMolotov((PotionMolotov)inventaire.getSacADos()[i]);
    	}
    	this.arme=new Arme[inventaire.getArme().length];
    	for(int i=0;i<inventaire.getArme().length;i++){
    		if (inventaire.getArme()[i] instanceof Arme)
    		this.arme[i]=new Arme(inventaire.getArme()[i]);
    	}
    	this.gants=new Gants[inventaire.getGants().length];
    	for(int i=0;i<inventaire.getGants().length;i++){
    		if (inventaire.getGants()[i] instanceof Gants)
    		this.gants[i]=new Gants(inventaire.getGants()[0]);
    	}
    }
    
    public void setSacADos(Item[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.sacADos = value;
        this.tailleSacADos=this.sacADos.length;
    }

    public Item[] getSacADos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.sacADos;
    }

    public Armure getArmure() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.armure;
    }

    public void setArmure(Armure value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.armure = value;
    }

    public Arme[] getArme(){
    	return this.arme;
    }
    
    public void setArme(Arme[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.arme = value;
    }

    public void setPaireBottes(PaireBottes value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.paireBottes = value;
    }

    public PaireBottes getPaireBottes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.paireBottes;
    }

    public Gants[] getGants() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.gants;
    }

    public void setGants(Gants[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.gants = value;
    }

    public int getTailleSacADos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleSacADos;
    }

    public void setTailleSacADos(int value) {
        this.tailleSacADos = value;
        /*Recreer tableau, 
         * verifier que le sac à dos a assez de place libre 
         * pour le changer sa taille*/
    }

    public int getNbPlaceRestanteSacADos() {
    	int nbPlaceSacADos=0;
		for(int i=0;i<this.sacADos.length;i++){
			if(this.sacADos[i]==null)
				nbPlaceSacADos++;
		}
		return nbPlaceSacADos;
	}

    public void equiper(int numeroItem) {
		if(this.sacADos[numeroItem] instanceof Arme){
			if(this.arme[0]==null){
				this.arme[0]=(Arme)this.sacADos[numeroItem];
				this.sacADos[numeroItem]=null;
			}
			else if(this.arme[1]==null){
				this.arme[1]=(Arme)this.sacADos[numeroItem];
				this.sacADos[numeroItem]=null;
			}
		}
		else if(this.sacADos[numeroItem] instanceof Gants){
			if(this.gants[0]==null){
				this.gants[0]=(Gants)this.sacADos[numeroItem];
				this.sacADos[numeroItem]=null;
			}
			else if(this.gants[1]==null){
				this.gants[1]=(Gants)this.sacADos[numeroItem];
				this.sacADos[numeroItem]=null;
			}
		}
		else if(this.sacADos[numeroItem] instanceof Armure){
			if(this.armure==null){
				this.armure=(Armure)this.sacADos[numeroItem];
				this.sacADos[numeroItem]=null;
			}
		}
		else if(this.sacADos[numeroItem] instanceof PaireBottes){
			if(this.paireBottes==null){
				this.paireBottes=(PaireBottes)this.sacADos[numeroItem];
				this.sacADos[numeroItem]=null;
			}
		}
    }

    public void desequiper(String typeItem,int numeroItem) {
    	if(this.getNbPlaceRestanteSacADos()>0){
    		int i=0;
    		while(i<this.sacADos.length && this.sacADos[i]!=null){
    			i++;
    		}
	    	switch(typeItem){
		    	case "arme":
		    		this.sacADos[i]=this.arme[numeroItem];
		    		this.arme[numeroItem]=null;
		    		break;
		    	case "gants":
		    		this.sacADos[i]=this.gants[numeroItem];
		    		this.gants[numeroItem]=null;
		    		break;
		    	case "armure":
		    		this.sacADos[i]=this.armure;
		    		this.armure=null;
		    		break;
		    	case "bottes":
		    		this.sacADos[i]=this.paireBottes;
		    		this.paireBottes=null;
		    		break;
		    }
    	}
    	
    }

    public Item jeter(String choix,int numeroItem) {
    	Item item_cache=null;
	    switch(choix){
	    	case "sac a dos":
	    		item_cache=this.sacADos[numeroItem];
	    		this.sacADos[numeroItem]=null;
	    		break;
	    	case "arme":
	    		item_cache=this.arme[numeroItem];
	    		this.arme[numeroItem]=null;
	    		break;
	    	case "gants":
	    		item_cache=this.gants[numeroItem];
	    		this.gants[numeroItem]=null;
	    		break;
	    	case "armure":
	    		item_cache=this.armure;
	    		this.armure=null;
	    		break;
	    	case "bottes":
	    		item_cache=this.paireBottes;
	    		this.paireBottes=null;
	    		break;
	    }
	    return item_cache;
    }
    
    public void ajouter(Item item) throws Exception{
    	if(this.getNbPlaceRestanteSacADos()<=0)throw new Exception("Il n'y a plus de place dans le sac");
    	try{
    		int emplacement=-1;
    		for(int i=0;i<this.sacADos.length && emplacement<0;i++){
    			if(this.sacADos[i]==null){
    				emplacement=i;
    			}
    		}
    		this.sacADos[emplacement]=item;
    	}catch(IndexOutOfBoundsException e){
    		throw new Exception("Impossible d'ajouter cet objet");
    	}
    }
    
    public String toString(){
    	String s="### Contenu du sac a dos ###\nPlace restante: "+this.getNbPlaceRestanteSacADos()+"\n";
    	for(int i=0;i<this.sacADos.length;i++){
    		if(this.sacADos[i]!=null)
    			s+="\tEmplacement "+(i+1)+": "+this.sacADos[i]+"\n";
    	}
    	s+="\n### Armes ###\n";
    	s+="\tEmplacement 1: ";
    	if(arme[0]!=null)
    		s+=this.arme[0]+"\n";
    	else
    		s+="vide\n";
    	s+="\tEmplacement 2: ";
    	if(arme[1]!=null)
    	   	s+=this.arme[1]+"\n";
    	else
    		s+="vide\n";
    	
    	s+="\n### Gants ###\n";
    	s+="\tEmplacement 1: ";
    	if(gants[0]!=null)
    		s+=this.gants[0]+"\n";
    	else
    		s+="vide\n";
    	s+="\tEmplacement 2: ";
    	if(gants[1]!=null)
    	   	s+=this.gants[1]+"\n";
    	else
    		s+="vide\n";
    	s+="\n### Armure ###\n\tEmplacement 1: ";
    	if(armure!=null)
    		s+=this.armure+"\n";
    	else
    		s+="vide\n";
    	s+="\n### Bottes ###\n\tEmplacement 1: ";
    	if(paireBottes!=null)
    		s+=this.paireBottes+"\n";
    	else
    		s+="vide\n";
    	return s;
    }

}
