package conko1;

public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
	}

	public MyPoint(double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distance(MyPoint n) {
		return this.distance(n.getX(), n.getY());
	}

	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	public static double distance(MyPoint n, MyPoint m) {
		return n.distance(m.x, m.y);
	}

}
