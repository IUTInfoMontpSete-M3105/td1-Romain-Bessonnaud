
import java.util.*;

public class Devoir {

    private String nom;
    private String description;
    public int nbPoints;
    //private void deadline;


    public Devoir(String nom, String description) {
        this.nom=nom;
        this.description=description;
        nbPoints=0;
    }


    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    @Override
    public String toString() {
        return "Devoir: " + "nom du devoir= " + nom + ", description='" + description  + ", nbPoints=" + nbPoints;
    }

}