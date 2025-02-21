package ma.projet.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ma.projet.Professeur;
import ma.projet.Specialiste;

public class Testspe {
    public static  void main(String[] args) {
        Specialiste javaJEE = new Specialiste("JAVA", "Java/JEE");
        Specialiste cisco = new Specialiste("CISCO", "CISCO");

        List<Professeur> professeurs = new ArrayList<>();
        professeurs.add(new Professeur("Amal", "SAFI", "0600000000", "safi@gmail.com"));
        professeurs.add(new Professeur("Said", "ALAMI", "0611111111", "alami@yahoo.fr"));
        professeurs.add(new Professeur("Reda", "ALAOUI", "0622222222", "alaoui@yahoo.fr"));
        professeurs.add(new Professeur("Imane", "KAMALI", "0633333333", "i.kamali@gmail.com"));

        Map<Specialiste, List<Professeur>> specialiteProfesseurs = new HashMap<>();
        specialiteProfesseurs.put(javaJEE, new ArrayList<>());
        specialiteProfesseurs.put(cisco, new ArrayList<>());

        specialiteProfesseurs.get(javaJEE).add(professeurs.get(0));
        specialiteProfesseurs.get(javaJEE).add(professeurs.get(1));
        specialiteProfesseurs.get(cisco).add(professeurs.get(2));
        specialiteProfesseurs.get(cisco).add(professeurs.get(3));

        for (Map.Entry<Specialiste, List<Professeur>> entry : specialiteProfesseurs.entrySet()) {
            Specialiste specialite = entry.getKey();
            List<Professeur> profs = entry.getValue();

            System.out.println("Spécialité : " + specialite.getLibelle());
            for (Professeur professeur : profs) {
                System.out.println(" - " + formatNom(professeur));
            }
        }
    }

    private static String formatNom(Professeur professeur) {
        String nom = professeur.getNom().toUpperCase();
        String prenom = professeur.getPrenom();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
        return prenom + " " + nom + " (" + professeur.getTelephone() + ")";
    }
}
