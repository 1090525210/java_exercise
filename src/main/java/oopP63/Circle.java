package oopP63;

public class Circle extends Shape{
	final static double pi = 3.1415926;
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double area() {
		double area = radius*radius*pi;
		return area;
	}
	
	public double circumference() {
		double circumference= pi*radius*2;
		return circumference;
	}
	
	public double calcuDis() {
		return 5;
	}

}
