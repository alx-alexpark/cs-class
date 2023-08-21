package circle;
import java.lang.Math;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 1;
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public double diameter() {
		return radius * 2;
	}
	
	public double circumference() {
		return Math.PI * radius * 2;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Circle with radius: " + radius;
	}
}
