package ma.projet.test;

import ma.projet.Hotel;
import ma.projet.Salle;

public class Testhotel {
    public static void main(String[] args) {
        // Création des salles
        Salle s1 = new Salle("S1", "Chaplin");
        Salle s2 = new Salle("S2", "Formation");
        Salle s3 = new Salle("S3", "Univers");
        Salle s4 = new Salle("S4", "Pôle");
        Salle s5 = new Salle("S5", "Fête");

        // Création des hôtels (sans `null` et `nbSalles`)
        Hotel ibis = new Hotel("IBIS", "21, rue Mohamed V Agadir", "0524676898");
        Hotel albatros = new Hotel("ALBATROS GARDEN", "45, rue Mohamed VI Casa", "0524778909");

        // Ajout des salles aux hôtels
        ibis.ajouterSalle(s3); // Univers
        ibis.ajouterSalle(s4); // Pôle

        albatros.ajouterSalle(s1); // Chaplin
        albatros.ajouterSalle(s2); // Formation
        albatros.ajouterSalle(s5); // Fête

        // Affichage des informations
        System.out.println(ibis);
        System.out.println();
        System.out.println(albatros);
    }
}
