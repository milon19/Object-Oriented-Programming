package Cars;

public class Test {
    
    public static void main(String arg[])
    {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.start();
        
        Car car2 = new Car("ABC");
        car2.start();
    }
}
