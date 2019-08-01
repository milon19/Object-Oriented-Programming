package AssociationClass;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public String SSN;
	public String Name;
	public String Sex;
	public String Email;
	public String Contact;
	
	private List<Owns> Investment = new ArrayList<>();
	
	public void Buy(Company C, int num)
	{
		Owns anOwn = new Owns("123", 12, this, C, num);
		Investment.add(anOwn);
	}
	public void Sell()
	{
		
	}
	public List<Owns> GetShares()
	{
		return this.Investment;
	}
	
	

}
