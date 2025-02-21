package tp2exercices;
import tp2exercices.Cercle;
import tp2exercices.Point;
public class TestCercle {
    public static void main(String[] args) {
        Point centre = new Point(3.0, 4.0);
        Cercle c1 = new Cercle(centre, 5.0);

        System.out.println("Cercle : " + c1);
        System.out.println("Périmètre : " + c1.perimetre());
        System.out.println("Surface : " + c1.surface());

        Point p1 = new Point(6.0, 8.0);
        Point p2 = new Point(10.0, 10.0);

        System.out.println("p1 est dans le cercle ? " + c1.contient(p1)); // true
        System.out.println("p2 est dans le cercle ? " + c1.contient(p2)); // false
    }
}

