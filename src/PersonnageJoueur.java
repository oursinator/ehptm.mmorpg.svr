import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("83cf2207-dabf-489a-b982-65eaf615aaa0")
public class PersonnageJoueur extends Personnage {
    @objid ("ddd8439a-8a28-49c1-a817-90ea0ee9f877")
    private int px;

    @objid ("cba4aa57-547c-41cc-a743-e89681c1d04a")
    private int force;

    @objid ("76f764b9-7078-44b0-ab3b-88292b701bac")
    private int adresse;

    @objid ("9167c9a1-4f56-41bc-b34e-9ba6cad75fae")
    private int resistance;

    @objid ("df2c0e93-2723-49cb-94b3-3041bd924dac")
    private int getPx() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.px;
    }

    @objid ("5ad0b02b-fd91-4756-ae55-2ca28c72febd")
    void setPx(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.px = value;
    }

    @objid ("9c239adb-45ef-44fc-b6c6-f74c0a23acf6")
    int getForce() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.force;
    }

    @objid ("9d8973a7-1351-4c0b-b4f5-f1fc5f03acb1")
    void setForce(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.force = value;
    }

    @objid ("919bb48a-6b78-4eb7-89ce-87d56b8b04a9")
    int getAdresse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.adresse;
    }

    @objid ("bf55c5c5-f988-4de1-879a-435255cb4739")
    void setAdresse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresse = value;
    }

    @objid ("42730e82-c8bf-43e8-b5cf-ade5599d4d6f")
    int getResistance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.resistance;
    }

    @objid ("65a7608a-50b4-42c1-9c72-16c3c34d0710")
    void setResistance(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.resistance = value;
    }

    @objid ("39219d12-8a74-4680-8988-38b7383c6b16")
    public int initiative() {
    }

    @objid ("5638d85f-3c91-4068-9b9f-09b0463b774f")
    public int attaque() {
    }

    @objid ("499bf623-6f60-4d51-b6a8-41c589f97794")
    public int esquive() {
    }

    @objid ("56412998-a133-4348-b146-1bd9fafd46d1")
    public int degat() {
    }

    @objid ("4a1c3441-7f72-428e-8c1c-d8d73aa78c3c")
    public int defense() {
    }

    @objid ("fd46f767-d7c4-43ae-a7c3-c35708c5af80")
    public void dropItem() {
    }

}
