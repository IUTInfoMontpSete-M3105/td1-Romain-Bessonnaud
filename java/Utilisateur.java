
import java.util.*;

public class Utilisateur {

    private String prenom;
    private String adressePostale;
    private String adresseMail;
    private String nom;

    public Utilisateur(String nom, String prenom,String adressepostale, String adressemail) {
        this.nom=nom;
        this.prenom=prenom;
        this.adressePostale=adressepostale;
        this.adresseMail=adressemail;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void consulterDonnes() {
        // TODO implement here
    }

}