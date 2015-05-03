import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("68ac6f91-faa6-45a3-ace5-c63ce60be32f")
public class Inventaire {
    @objid ("3de8dc5e-bde0-415c-af29-ff965ff1eb32")
    private int tailleSacADos;

    @objid ("3a82e576-3105-4328-9d93-653039ebc87a")
    private Item[] sacADos;

    @objid ("b75415f6-4e8d-45bb-97f1-a3f311e7266b")
    private Armure armure;

    @objid ("9e4b45f8-3b0e-46fe-b067-a31886715fc2")
    private Arme[] arme;

    @objid ("7f6a6269-0b67-400d-9c96-dd30dd0f0659")
    private PaireBottes paireBottes;

    @objid ("b06d4046-b92c-4435-8536-3be26435c6f7")
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
    
    @objid ("d4883274-8609-43ee-8f7a-419816eee988")
    public void setSacADos(Item[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.sacADos = value;
        this.tailleSacADos=this.sacADos.length;
    }

    @objid ("fed01aa0-22bb-4c69-8e20-b686d4279f2a")
    public Item[] getSacADos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.sacADos;
    }

    @objid ("784009be-44fb-4104-96ea-fcfa4902bde5")
    public Armure getArmure() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.armure;
    }

    @objid ("3cc8b7da-5c8e-4183-b14d-1fc03db432d3")
    public void setArmure(Armure value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.armure = value;
    }

    @objid ("4ee0a1de-946c-499a-b0cf-ccc775cd71e1")
    public Arme[] getArme(){
    	return this.arme;
    }
    
    public void setArme(Arme[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.arme = value;
    }

    @objid ("69a2e600-d7fc-42db-a413-a7aedc608a43")
    public void setPaireBottes(PaireBottes value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.paireBottes = value;
    }

    @objid ("b944055b-3ecc-43a0-878d-1f978fd2add7")
    public PaireBottes getPaireBottes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.paireBottes;
    }

    @objid ("c211d7e8-eced-4885-93ae-e2c25c4f8505")
    public Gants[] getGants() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.gants;
    }

    @objid ("08341949-c16b-4b8d-a454-5b4985bfd885")
    public void setGants(Gants[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.gants = value;
    }

    @objid ("12410745-e1fb-46f1-a5d3-4848cc13391c")
    public int getTailleSacADos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleSacADos;
    }

    @objid ("3472ea93-c08b-472b-9d69-2f4cf46bafea")
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

	@objid ("dd0a0ae8-1389-40bf-982f-95a1a1c4d7ee")
    public void equiper(int numeroItem) {
		if(this.sacADos[numeroItem] instanceof Arme){
			if(this.arme[0]==null)
				this.arme[0]=(Arme)this.sacADos[numeroItem];
			else if(this.arme[1]==null)
				this.arme[1]=(Arme)this.sacADos[numeroItem];
		}
		else if(this.sacADos[numeroItem] instanceof Gants){
			if(this.gants[0]==null)
				this.gants[0]=(Gants)this.sacADos[numeroItem];
			else if(this.gants[1]==null)
				this.gants[1]=(Gants)this.sacADos[numeroItem];
		}
		else if(this.sacADos[numeroItem] instanceof Armure){
			if(this.armure==null)
				this.armure=(Armure)this.sacADos[numeroItem];
		}
		else if(this.sacADos[numeroItem] instanceof PaireBottes){
			if(this.paireBottes==null)
				this.paireBottes=(PaireBottes)this.sacADos[numeroItem];
		}
    }

    @objid ("be12ee50-1884-4ae6-88c6-80e81998bdf2")
    public void desequiper(int typeItem,int numeroItem) {
    	if(this.getNbPlaceRestanteSacADos()>0){
    		int i=0;
    		while(i<this.sacADos.length && this.sacADos[i]!=null){
    			i++;
    		}
    		i--;
	    	switch(typeItem){
		    	case 0:
		    		this.sacADos[i]=this.arme[numeroItem];
		    		this.arme[numeroItem]=null;
		    		break;
		    	case 1:
		    		this.sacADos[i]=this.gants[numeroItem];
		    		this.gants[numeroItem]=null;
		    		break;
		    	case 2:
		    		this.sacADos[i]=this.armure;
		    		this.armure=null;
		    		break;
		    	case 3:
		    		this.sacADos[i]=this.paireBottes;
		    		this.paireBottes=null;
		    		break;
		    }
    	}
    	
    }

    @objid ("79e89308-6d1f-4ef6-87bc-3b71c289c719")
    public Item jeter(int choix,int numeroItem) {
    	Item item_cache=new Item("");
	    switch(choix){
	    	case 0:
	    		item_cache=this.sacADos[numeroItem];
	    		this.sacADos[numeroItem]=null;
	    		break;
	    	case 1:
	    		item_cache=this.arme[numeroItem];
	    		this.arme[numeroItem]=null;
	    		break;
	    	case 2:
	    		item_cache=this.gants[numeroItem];
	    		this.gants[numeroItem]=null;
	    		break;
	    	case 3:
	    		item_cache=this.armure;
	    		this.armure=null;
	    		break;
	    	case 4:
	    		item_cache=this.paireBottes;
	    		this.paireBottes=null;
	    		break;
	    }
	    return item_cache;
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
    	
    	s+="\n### Armure ###\n\t"+this.armure+"\n";
    	s+="\n### Bottes ###\n\t"+this.paireBottes+"\n";
    	return s;
    }

}
