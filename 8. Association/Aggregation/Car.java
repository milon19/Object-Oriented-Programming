package Aggregation;

public class Car {
	public String Name;
	public String Model;
	public String Color;
	public double price;
	
	private	Wheel Wheel;
	
	public Car(String Name, String Model, String Color, double price, Wheel aWheel)
	{
		this.Name = Name;
		this.Model = Model;
		this.Color = Color;
		this.price = price;
		this.Wheel = aWheel;
	}
	
	
	
	public void Race()
	{
		Wheel.spin();
	}
}
