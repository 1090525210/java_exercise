//é?¢å?‘å¯¹è±¡P63
package oopP63;

public class Test {
	
	public static void main(String[] args) {

		Shape[] arr = new Shape[3];
	
		CenteredCircle circle= new CenteredCircle();
		circle.setCenter(1.0, 1.0);
		circle.setRadius(1.0);
		
		CenteredSquare square= new CenteredSquare();
		square.setCenter(2.5, 2);
		square.setWidth(3);
		
		CenteredRectangle rectangle= new CenteredRectangle();
		rectangle.setCenter(2.3, 4.5);
		rectangle.setWidth(3);
		rectangle.setHeight(4);
		
		arr[0] = circle;
		arr[1] = square;
		arr[2] = rectangle;
		
		double totalArea=0;
		double totalDistance=0;
		
		for(int i=0;i<3;i++) {
			totalArea += arr[i].area();
			totalDistance += arr[i].calcuDis();
		}
		double averageArea = totalArea/3;
		double averageDis = totalDistance/3;
		
//		if(arr[0] instanceof CenteredCircle) {
//			//Shape arr[0] = (CenteredCircle)arr[0];
//			CenteredCircle circle2 = (CenteredCircle)arr[0];
//			System.out.println("yes");
//		}
//		//circle instanceof Center
		
		
		System.out.println("The average area is "+averageArea);
		System.out.println("The average distance is "+averageDis);
	}
}
