
import java.util.*;

/**
 * 
 */
public class Cours {

    public boolean coursFini;
    private string nom;
    List listCours= new List(Cours);

    /**
     * Default constructor
     */
    public Cours(string nom) {
        this.nom=nom;
    }

    /**
     * 
     */
    public void supprimerCours(Cours c){
        listCours.remove(c);
    }






}