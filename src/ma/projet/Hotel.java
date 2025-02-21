package ma.projet;

import java.util.Arrays;

public class Hotel {
    private static int comp = 1; 
    private int id;
    private String nom;
    private String adresse;
    private String telephone;
    private Salle[] salles;
    private int nbSalles;

    private static final int MAX_SALLES = 10; 

    public Hotel(String nom, String adresse, String telephone) {
        this.id = comp++;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.salles = new Salle[MAX_SALLES]; 
        this.nbSalles = 0; 
    }

    public void ajouterSalle(Salle salle) {
        if (nbSalles < MAX_SALLES) {
            salles[nbSalles] = salle;
            nbSalles++;
        } else {
            System.out.println("Impossible d'ajouter plus de salles. La capacité est atteinte!");
        }
    }

    @Override
    public String toString() {
        return String.format(
            "L'hôtel %s contient %d salles de réunions:\n %s \n Ses coordonnées sont les suivantes :\nTél :%s\nAdresse :%s",
            nom, nbSalles, 
            Arrays.toString(Arrays.copyOf(salles, nbSalles)).replace(",", "\n").replace("[", "").replace("]", ""),
            telephone, adresse
        );
    }
}
