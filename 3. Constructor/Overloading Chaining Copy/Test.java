package Constructor;

public class Test {
    
    public static void main(String arg[])
    {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.start();
        
        Car car2 = new Car("ABC");
        car2.start();
        
        Car car3 = new Car("DEF", "RED");
        car3.start();
        
        Car car4 = new Car(car3);
        car4.start();
    }
}
