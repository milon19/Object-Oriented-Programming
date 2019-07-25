package Cars;

//Save as Car.java
public class Car {
	public String name = "Something";
	public void Start()
	{
		System.out.println("A car is starting with 0kmph speed");
	}
	
	public void Start(int n)
	{
		System.out.println("A car is starting with " + n +  "kmph speed");
	}
	
	public void TopSpeed()
	{
		System.out.println( name + "'s Top Speed: Something");
	}
	
}


//Save as Audi.java
public class Audi extends Car{

	public String name = "Audi";
	
	//Overriding
	public void TopSpeed() 
	{
		System.out.println(name + "'s Top Speed: 200kmps");
	}
}

//Save as Ferrari.java
public class Ferrari extends Car{

	public String name = "Ferrari";
	
	//Overriding
	public void TopSpeed()
	{
		System.out.println( name + "'s Top Speed: 250kmph");
	}
}

//Save as Test.java
public class Test {

	public static void main(String[] args) {
		Car aCar = new Car();
		System.out.println(aCar.name);
		aCar.TopSpeed();
		
		Audi aAudi = new Audi();
		System.out.println(aAudi.name);
		aAudi.TopSpeed();
		
		
		Ferrari aFerrari = new Ferrari();
		System.out.println(aFerrari.name);
		aFerrari.TopSpeed();
		
		Car  car1, car2;
		car1 = new Audi();
		car2 = new Ferrari();
		
		
		//Field can't not overridden
		System.out.println(car1.name);
		car1.TopSpeed();
		System.out.println(car2.name);
		car2.TopSpeed();
		
	}

}
