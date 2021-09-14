package oopP63;

public class Square extends Shape{
	private double width;
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double area() {
		double area = width*width;
		return area;
	}
	
	public double circumference() {
		double circumference= 4*width;
		return circumference;
	}
	public double calcuDis() {
		return 5;
	}
	
}
