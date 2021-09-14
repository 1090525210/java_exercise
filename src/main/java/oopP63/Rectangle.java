package oopP63;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double area() {
		double area = width*height;
		return area;
	}
	
	public double circumference() {
		double circumference= 2*(width+height);
		return circumference;
	}
	
	public double calcuDis() {
		return 5;
	}

}
