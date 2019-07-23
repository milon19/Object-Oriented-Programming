package Cars;

/*
Constructor:
    1. Name as Class Name.
    2. No Return Type.

*/
public class Car {
    public String name;
    public String color;
    
    public Car()  //Constructor with no-arg
    {
        this.name = "No Value";
    }
    public Car(String n) //Constructor with arg
    {
        this.name = n;
    }
    public void start()
    {
        System.out.println(this.name + " is started");
    }
}
