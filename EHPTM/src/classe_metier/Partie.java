package classe_metier;

public class Partie {
    
    private static final int NB_MAX_JOUEUR=5;

   
    private Carte carte;

    
    void setCarte(Carte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }

    Carte getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    static int getNB_MAX_JOUEUR() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return NB_MAX_JOUEUR;
    }

    public void ajouterPersonnageJoueur() {
    }

    public void ajouterMonstre() {
    }

}