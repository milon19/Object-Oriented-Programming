package Constructor;

import Cars.*;

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
        
    }
    
    public Car(String n) //Constructor with arg
    {
        this.name = n;
    }
    
    public Car(String n, String c) //Constructor with arg
    {
        this(n);            //CONSTRUCTOR CHAINING
        this.color = c;
    }
    
    public Car(Car acar)    //COPY CONSTRUCTOR
    {
        this.name = acar.name;
        this.color = acar.color;
    }
    public void start()
    {
        System.out.println(this.color + " " + this.name + " is started");
    }
}
