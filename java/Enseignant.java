
import java.util.*;

public class Enseignant extends Utilisateur {

    private int numharpege;
    private int numnumem;

    public Enseignant(int numharpege, int numnumem, String nom, String prenom, String adressepostale, String adressemail) {
        super(nom,prenom,adressepostale,adressemail);
        this.numharpege=numharpege;
        this.numnumem=numnumem;
    }

    public int getNumharpege() {
        return numharpege;
    }

    public int getNumnumem() {
        return numnumem;
    }

    public void setNumharpege(int numharpege) {
        this.numharpege = numharpege;
    }

    public void setNumnumem(int numnumem) {
        this.numnumem = numnumem;
    }

    public void corriger(Devoir d, int nbPoints) {
        d.setNbPoints(nbPoints);
    }



}