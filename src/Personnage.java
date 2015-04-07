import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("71e46fc8-9446-4836-b20e-559d7c79d44f")
public class Personnage {
    @objid ("cd751c06-1689-4e8d-bd93-d67ece2016cd")
    private int pointVie;

    @objid ("dbbe75f6-96b9-4d76-a86d-0cb5be32beb5")
    private int pointAction;

    @objid ("cee850ea-ae37-4a4d-8c5f-559443484b2e")
    private PointPlan position;

    @objid ("2890b3bd-1f4a-41bf-97f4-3060e3833cf7")
    private Inventaire inventaire;

    @objid ("2f797d6d-f1a1-4879-a680-6ca475082aba")
    int getPointAction() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointAction;
    }

    @objid ("6e6c60e2-5657-4903-92be-83627107727d")
    void setPointAction(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointAction = value;
    }

    @objid ("55e136a9-e8ac-4fe7-b30e-d93edf41ea03")
    int getPointVie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointVie;
    }

    @objid ("c4fe3d00-cb60-496d-a6a0-6819589bd7eb")
    void setPointVie(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointVie = value;
    }

    @objid ("97d63975-49e9-47e5-807b-742796872cd6")
    public void attaquer(Personnage cible) {
    }

    @objid ("69ea79c6-4370-4d77-8d92-e50ec769b079")
    public void utiliserItem(Item item) {
    }

    @objid ("57af6db1-81dd-4fc1-bf9e-59eadfea0222")
    public void deplacer(int x, int y) {
    }

    @objid ("5a3a7caa-198d-4ea6-a92a-948c2290481d")
    PointPlan getPointPlan() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointPlan;
    }

    @objid ("24607851-442b-4b5d-8f5d-1f4c56311a2a")
    void setPointPlan(PointPlan value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointPlan = value;
    }

    @objid ("809d8f2f-76e6-48da-a7d4-19ce3541669e")
    public int etat() {
    }

    @objid ("e2355739-8edf-44c6-902e-c130de52cfeb")
    public void recuperationPointAction() {
    }

    @objid ("6742f55c-5c8c-4c79-9af9-22aa311223b4")
    Inventaire getInventaire() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.inventaire;
    }

    @objid ("8738e4ce-5855-48c9-bae0-1fb302d809de")
    void setInventaire(Inventaire value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.inventaire = value;
    }

}
