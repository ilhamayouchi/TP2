package tp2exercices;


public class Point {
    private double x;
    private double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point translation(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }
    
	public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
	@Override
	public String toString() {
		return "(" + this.x + ","+ this.y + ")";
	}
	
   
}
