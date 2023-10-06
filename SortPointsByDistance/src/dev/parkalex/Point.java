package dev.parkalex;

public class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getDistanceFromOrigin() {
		return Math.sqrt(Math.pow(this.x-0, 2) + Math.pow(this.y-0, 2));
	}
	
	public int compareTo(Point other) {
		if (other.getDistanceFromOrigin() > this.getDistanceFromOrigin()) {
			return -1;
		} else if (other.getDistanceFromOrigin() < this.getDistanceFromOrigin()){
			return 1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
