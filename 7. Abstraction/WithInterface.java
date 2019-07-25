package Abs;
//Save as Car.java
public interface Car {
	public void accelerate();
}

//Save as Vehicle.java
public interface Vehicle {
	public void start();
}

//Save as BMW.java
public class BMW implements Vehicle, Car{

	@Override
	public void accelerate() {
		System.out.println("Accelerating BMW....!");
	}
	@Override
	public void start() {
		System.out.println("Starting BMW....!");
	}
}


//Save as Test.java
public class Test {
	public static void main(String[] args) {
		Vehicle v1;
		Car c1;
		v1 = new BMW();
		c1 = new BMW();
		v1.start();
		c1.accelerate();
	}
}
