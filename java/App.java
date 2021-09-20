public class App {

    public static void main(String[] args) {
        Cours prog = new Cours("PROG");
        Devoir d1 = new Devoir("projet COO","projet Uber Eat");
        Devoir d2 = new Devoir("projet PROG","projet BANG");
        Administrateur admin = new Administrateur(123,"mac", "alister","10 rue de l'univ","a@a.fr");
        Enseignant lebreton = new Enseignant(9,5,"Lebreton","Romain","12 rue de l'univ", "r.lebreton@lirmm.fr");
        Enseignant trombettoni = new Enseignant(7,3,"Trombettoni","Gilles","11 rue de l'univ", "g.trombettoni@lirmm.fr");
        Etudiant e1= new Etudiant(1,"romain","besso","10 rue", "r.beso@g.fr");

        Cours coursCree= admin.creerCours("testCoursCree");
        e1.suivreCours(coursCree);
        lebreton.donnerDev(coursCree,d1);
        trombettoni.donnerDev(prog,d2);

        e1.telechargerDevoir();


    }

}
