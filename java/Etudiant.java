
import java.util.*;

public class Etudiant extends Utilisateur {

    private int numEtudiant;
    ArrayList<Cours> listCours = new ArrayList<>();

    public Etudiant(int numEtudiant, String nom, String prenom,String adressepostale, String adressemail) {
        super(nom,prenom,adressepostale,adressemail);
        this.numEtudiant=numEtudiant;
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public void suivreCours(Cours c) {
        listCours.add(c);
    }

    public ArrayList<Cours> getListCours() {
        return listCours;
    }

    public void telechargerDevoir() {
        System.out.println("\n");
        for (Cours c : this.listCours){
            System.out.println(c.getIntitule());
            System.out.println(c.getListDevoir());
            System.out.println("\n");
        }
    }

}