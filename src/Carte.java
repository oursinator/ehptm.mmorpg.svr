import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3c8b203f-6a8a-4c2f-91d7-beea68711832")
public class Carte {
    @objid ("9f22a72b-d33d-47f4-bb48-4cf4651b6f7a")
    private String nom;

    @objid ("9e456c6b-bb43-4153-be99-4bcaf477e22d")
    private List<ItemPosition> itemPosition = new ArrayList<ItemPosition> ();

    @objid ("af6eb0b6-7094-48e7-b6ff-d0c4f23fa47c")
    private List<Personnage> personnage = new ArrayList<Personnage> ();

    @objid ("2a6392a1-f533-4f26-b065-8edf8108a618")
    private List<PointPlan> mur = new ArrayList<PointPlan> ();

    @objid ("8d8530b8-6991-41e0-9c9a-417eea5ebd20")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("3e1afff3-ec2f-47da-acea-667b540d107e")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("ae11b76d-9cf3-4434-abaa-5940873a7569")
    public void collision() {
    }

    @objid ("270a7215-6752-4fe0-84f1-959b084aa1fe")
    void setPersonnage(List<Personnage> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.personnage = value;
    }

    @objid ("af1ec020-45cd-4591-bfdc-7aaffc7d5b91")
    List<Personnage> getPersonnage() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.personnage;
    }

    @objid ("82e992c0-4883-4620-aab8-f25fb249e11a")
    void setMur(List<PointPlan> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.mur = value;
    }

    @objid ("ac67afa1-a5d8-47c5-83ef-eb2d560f8291")
    List<PointPlan> getMur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.mur;
    }

    @objid ("8610b863-05a8-46f2-bd46-27e19a4ef341")
    List<ItemPosition> getItemPosition() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.itemPosition;
    }

    @objid ("4f2a554e-b99c-4b2f-b13f-05c2dc03b2bc")
    void setItemPosition(List<ItemPosition> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.itemPosition = value;
    }

}
