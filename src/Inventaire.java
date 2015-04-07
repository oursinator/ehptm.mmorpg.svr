import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("68ac6f91-faa6-45a3-ace5-c63ce60be32f")
public class Inventaire {
    @objid ("3de8dc5e-bde0-415c-af29-ff965ff1eb32")
    private int tailleSacADos;

    @objid ("3a82e576-3105-4328-9d93-653039ebc87a")
    private List<Item> sacADos = new ArrayList<Item> ();

    @objid ("b75415f6-4e8d-45bb-97f1-a3f311e7266b")
    private Armure armure;

    @objid ("9e4b45f8-3b0e-46fe-b067-a31886715fc2")
    private List<Arme> arme = new ArrayList<Arme> ();

    @objid ("7f6a6269-0b67-400d-9c96-dd30dd0f0659")
    private PaireBottes paireBottes;

    @objid ("b06d4046-b92c-4435-8536-3be26435c6f7")
    private List<Gant> gant = new ArrayList<Gant> ();

    @objid ("f03a1add-2b80-401f-93bb-25f19d336051")
    Item getItem() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.item;
    }

    @objid ("e6707639-468d-4797-b8c2-01335c4d7b85")
    void setItem(Item value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.item = value;
    }

    @objid ("fae7aedb-6693-4467-81a1-19bb69e61d5b")
    int getTailleSacADos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleSacADos;
    }

    @objid ("0b543cf5-2ec2-453b-bb70-4017a4fdbbb3")
    void setTailleSacADos(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tailleSacADos = value;
    }

    @objid ("56893107-deda-4c4f-bb57-6908f1b77388")
    Armure getArmure() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.armure;
    }

    @objid ("c9bb883e-d54b-48a6-a4f7-4a69d339daae")
    void setArmure(Armure value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.armure = value;
    }

    @objid ("a35bb9e0-ab58-49aa-8970-a2ebf65fda40")
    Arme getArme() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.arme;
    }

    @objid ("f5534d33-553c-47c7-bbce-1c702ee958df")
    void setArme(Arme value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.arme = value;
    }

    @objid ("d4cfba30-6780-4518-9c50-813d6e9ab473")
    PaireBottes getPaireBottes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.paireBottes;
    }

    @objid ("35fb6bc1-3af5-43ca-8b82-bb678516af9f")
    void setPaireBottes(PaireBottes value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.paireBottes = value;
    }

    @objid ("7128f5a1-85fa-416c-bc9a-367d19bf15fa")
    Gant getGant() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.gant;
    }

    @objid ("e4088443-e009-4219-b239-04ae75ef697e")
    void setGant(Gant value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.gant = value;
    }

    @objid ("b71a9350-214e-49f4-9b62-a38639e1366d")
    public void equiper() {
    }

    @objid ("4557c7ef-03a9-429a-9eaf-23873b2972b2")
    public void desequiper() {
    }

    @objid ("b4fc0f24-2934-4622-8473-aa5abb3bb4db")
    public void jeter() {
    }

}
