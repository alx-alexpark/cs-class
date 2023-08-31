package point;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		x=0;
		y=0;
	}
	
	public String toString() {
		return String.format("(%d, %d)", this.x, this.y);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
