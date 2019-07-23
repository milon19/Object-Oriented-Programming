package Encapsulation;

public class Test {
    
    public static void main(String arg[])
    {
        Customer aCustomer = new Customer();
        aCustomer.setAge(-15);
        int age = aCustomer.getAge();
        System.out.println(age);
        aCustomer.setAge(30);
        int age1 = aCustomer.getAge();
        System.out.println(age1);
        
    }
}
