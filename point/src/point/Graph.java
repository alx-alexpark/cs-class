package point;

public class Graph {
	public static void main(String[] args) {
		Point[] points = new Point[4];
		points[0] = new Point(1, 2);
		points[1] = new Point(3, 4);
		points[2] = new Point(5, 4);
		points[3] = new Point(7, 8);
		
//		System.out.println(points[0]);
//		points[0].setX(3);
//		points[0].setY(5);
//		System.out.println(points[0]);
		
		System.out.println(distance(points[0], points[3]));
		System.out.println(distance(points[2], points[1]));
		System.out.println(slope(points[0], points[3]));
		System.out.println(slope(points[2], points[0]));
		System.out.println(isHorizontal(points[1], points[2]));
		System.out.println(isHorizontal(points[0], points[3]));
		System.out.println(farthestDistanceAway(points));
	}
	
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
	}
	
	public static double slope(Point p1, Point p2) {
		return (double) (p2.getY() - p1.getY())/(p2.getX() - p1.getX());
	}
	
	public static boolean isHorizontal(Point p1, Point p2) {
		return slope(p1, p2) == 0;
	}
	
	public static double farthestDistanceAway(Point[] points) {
		double farthest = 0;
		for (Point p : points) {
			double currentDist = distance(new Point(0, 0), p);
			if (currentDist > farthest) {
				farthest = currentDist;
			}
		}
		return farthest;
	}
	
	

}
