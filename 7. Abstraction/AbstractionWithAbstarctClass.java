//Save as Bike.java
//abstract class with normal method
public abstract class Bike { 
	public abstract void TopSpeed();
	public void test()
	{
	}
}

//Save as Bike1.java
//abstract class with full abstract method
public abstract class Bike1 {
	public abstract void Test();
}

//Save as Honda.java
public class Honda extends Bike{
	public void TopSpeed() {
		System.out.println("Top Speed: 120kmph");
	}
}

//Save as Yamaha.java
public class Yamaha extends Bike1{
	public void Test() {
		System.out.println("This is a test method from Yamaha");
	}
}

//Save as Test.java
public class Test {

	public static void main(String[] args) {
		Bike b1; //Use the referance bike only.
		b1 = new Honda();
		b1.TopSpeed();
		Bike1 b2;
		b2 = new Yamaha();
		b2.Test();
		
		//Bike aBike = new Bike(); //Not possible; 
	}

}
