package tp2exercices;


class testexe1 {

	    public static void main(String[] args) {
	    	Point p1 = new Point(1.0, 3.0);
	    	Point p2 = new Point(5.0, 6.0);
	    	Point p3 = p1.translation(2.0, 1.5);
	        double d = Point.distance(p1, p2);

	        System.out.println("p1 = " + p1);
	        System.out.println("p2 = " + p2);
	        System.out.println("p3 = " + p3);
	        System.out.println("Distance = " + d);
	    }
	}


