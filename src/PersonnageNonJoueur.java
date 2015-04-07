import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1211c6ae-9fed-46a0-9809-d692319369e6")
public class PersonnageNonJoueur extends Personnage {
    @objid ("b1091b14-a9f8-4ebf-8027-036a2de4e0d5")
    private int niveau;

    @objid ("85967ac5-25ef-410f-9b42-bbf13fb7c8f3")
    private int initiative;

    @objid ("088117ab-0193-475e-9dff-a5f97bc5b3f1")
    private int attaque;

    @objid ("a3c2659c-adf0-40ed-a1e2-65a2ec9e7223")
    private int esquive;

    @objid ("46701f96-9187-419c-b0f4-e168efff51da")
    private int degat;

    @objid ("fa19b090-69ca-4bb6-9035-a6dbbfa97f0e")
    private int defense;

    @objid ("51418914-6da4-421a-863e-72d7c4458a9e")
    int getNiveau() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.niveau;
    }

    @objid ("1acd2909-0a2b-4ebf-99a2-e3a9eaa456b2")
    void setNiveau(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.niveau = value;
    }

    @objid ("a00cea3c-3977-4da2-b318-f278bd450771")
    int getInitiative() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.initiative;
    }

    @objid ("6f1f2c59-c42c-429c-ada7-4b8ec68bcc19")
    void setInitiative(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.initiative = value;
    }

    @objid ("24370ae3-3cff-4915-ab49-92da04fa5ea5")
    int getAttaque() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.attaque;
    }

    @objid ("673afcae-160b-4bf9-900f-38d71724b764")
    void setAttaque(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.attaque = value;
    }

    @objid ("3cce8fad-6d71-41bb-96bd-473463419d22")
    int getEsquive() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.esquive;
    }

    @objid ("4aaf4971-cf61-4f63-8254-380d3f2db7ef")
    void setEsquive(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.esquive = value;
    }

    @objid ("ea90ed9f-8b6e-4785-83a9-a1f475aeff3c")
    int getDegat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.degat;
    }

    @objid ("4694f18b-eb3f-4c75-a1fb-007c3323bec3")
    void setDegat(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.degat = value;
    }

    @objid ("9d2c9795-9f99-4469-90d7-4f00d32525cc")
    int getDefense() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.defense;
    }

    @objid ("2f939720-1310-471c-991f-cff2a074db81")
    void setDefense(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.defense = value;
    }

    @objid ("f59da161-946d-4f8e-8e64-72f72e9f6d63")
    public void dropItem() {
    }

}
