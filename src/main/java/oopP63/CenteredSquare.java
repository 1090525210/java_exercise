package oopP63;

public class CenteredSquare extends Square implements Centered  {
	private double cx;
	private double cy;
	
	public void setCX(double cx) {
		this.cx=cx;
	}
	public void setCY(double cy) {
		this.cy=cy;
	}
	
	public double getCX() {
		return cx;
	}
	public double getCY() {
		return cy;
	}
	
	public void setCenter(double x, double y) {
		this.cx=x;
		this.cy=y;
	}
	
	public double getCenterX() {
		return cx;
	}
	public double getCenterY() {
		return cy;
	}
	public double calcuDis() {
		double distance = Math.sqrt(cx*cx+ cy*cy);
		return distance;
	}
}
