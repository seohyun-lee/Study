
class Car {
	String color;
	int speed = 0;
	int gear = 0;
	
	public Car() {};
	
	public Car (String color, int speed, int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}

	void changeGear(int i) {
		this.gear = i;
	}
	void speedUp() {
		this.speed += 10;
	}
	void speedDown() {
		this.speed -= 10;
	}
}

public class Practice01 {

	public static void main(String[] args) {
		Car car = new Car();
		car.changeGear(1);
		car.speedUp();
		System.out.println("Car [color="+car.color+", speed="+car.speed+", gear="+car.gear+"]");

	}

}
