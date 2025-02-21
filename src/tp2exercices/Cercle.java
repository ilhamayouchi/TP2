package tp2exercices;

public class Cercle {
    private Point centre;
    private double rayon;

    // Constructeur
    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Méthode pour vérifier si un point est dans le cercle
    public boolean contient(Point p) {
        return Point.distance(centre, p) <= rayon;
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return "Cercle[centre=" + centre + ", rayon=" + rayon + "]";
    }
}
