
package AccessModifiers;

/*
    Types --> 1. Public
              2. Private
              3. Protected
              4. No Modifier / Default

    Modifier - It's specifics the accessibility of a
              1. Class (Public/ No Modifier)
              2. Variable (all)
              3. Method/ Function (all)
              4. Constructor (all)

*/

public class TypesOfModifier {  //Class example
    public String Name;
    private int Age;
    protected String Phone;    // Variable example
    String email;
    
    public void getName(String name)  //Function example
    {
        this.Name = name;
    }
    
    private String setName()    //Function example
    {
        return Name;
    }
    
    //Constructor example.
    
    protected TypesOfModifier(String Name, int Age, String Phone, String email)
    {
       this.Name = Name;
       this.Age = Age;
       this.Phone = Phone;
       this.email = email;
    }
}
