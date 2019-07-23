
package Encapsulation;

public class Customer {
    private int age;
    
    public void setAge(int n)
    {
        if(n < 0)
            System.out.println("Inviled Age");
        else
            this.age = n;
    }
    public int getAge()
    {
        return this.age;
    }
}
