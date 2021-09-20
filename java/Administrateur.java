
import java.util.*;

public class Administrateur extends Utilisateur {

    public Administrateur(int numEtudiant, String nom, String prenom,String adressepostale, String adressemail) {
        super(nom,prenom,adressepostale,adressemail);
    }

    public Cours creerCours(String intitule) {
        return new Cours(intitule);
    }


    public void supprCours(Cours c) {
        // TODO implement here
    }

}