package oopP43;
//面向对象第一个P43
class Vehicle {
	public void start() {
		System.out.println("start move!");
	}
	public void stop() {
	    System.out.println("stop!");
	}
}
	
class Car extends Vehicle{
	String color;
	int doornum;
	double maxspd;
	public void play() {
		System.out.println("Play music!");
	}
}

class SportsCar extends Car {
	double nowKmCar;
	public void setSpeed(double speed) {
		if(speed>120) {
			System.out.println("不要超速！");
		}else if(speed<0) {
			System.out.println("速度不能为负数！");
		}else {
			this.nowKmCar=speed;
		}
	}
}


public class Test {
	public static void main(String[] args) {
	SportsCar car1 = new SportsCar();
	Car car2 = new SportsCar();
	
	car1.setSpeed(100);
	car1.color="silver";
	car1.doornum=2;
	car1.maxspd=220;
	
	System.out.println("Now speed is "+ car1.nowKmCar+", color is "+car1.color+", number of door is "+car1.doornum+", the max speed is "+car1.maxspd);
	
	car2=(SportsCar)car2;
	car2.start();
	car2.stop();
}	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	


	
	

