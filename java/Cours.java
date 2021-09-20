
import java.util.*;


public class Cours {

    public boolean coursFini;
    private String intitule;
    ArrayList<Devoir> listDevoir = new ArrayList<>();



    public Cours(String intitule) {
        this.intitule=intitule;
        this.coursFini=false;
    }

    public boolean isCoursFini() {
        return coursFini;
    }

    public String getIntitule() {
        return intitule;
    }

    public ArrayList<Devoir> getListDevoir() {
        return listDevoir;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void terminerCours(){
        this.coursFini=false;
    }







}