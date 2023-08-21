package circle;
import circle.Circle;
import java.util.ArrayList;

public class CircleTester {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(4);
		ArrayList<Circle> circles = new ArrayList<Circle>();
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
	
		for (Circle ci : circles) {
			System.out.println(ci.toString() + ", Area: " + ci.area() + ", Circumference: " + ci.circumference() + ", Diameter:" + ci.diameter());
		}
	}
}
