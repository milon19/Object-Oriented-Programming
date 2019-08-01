package Aggregation;

public class Test {

	public static void main(String[] args) {
		Wheel aWheel = new Wheel("Front", 100.2, "Black", 12345.3);
		Car aCar = new Car("audi", "2019", "Black", 12345.3, aWheel);
		aCar.Race();
	}

}
