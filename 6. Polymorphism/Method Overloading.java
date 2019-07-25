package Cars;


//Save as Car.java

public class Car {
	public String name;
  
  //Method Overloading.
	public void Start()
	{
		System.out.println("A car is starting with 0kmph speed");
	}
	
	public void Start(int n)
	{
		System.out.println("A car is starting with " + n +  "kmph speed");
	}
	
}

//Save as Test.java
public class Test {

	public static void main(String[] args) {
		Car aCar = new Car();
    
    //Same method with different parameter
		aCar.Start();
		aCar.Start(6);
	}

}

