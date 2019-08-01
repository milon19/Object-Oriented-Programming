package AssociationClass;

public class Test {

	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.Name = "Milon";
		Company company1 = new Company("123", "ABC", "123");
		aPerson.Buy(company1, 5);
		Company company2 = new Company("333", "xyz", "123");
		aPerson.Buy(company2, 10);
		
		for(Owns a : aPerson.GetShares())
		{
			System.out.println(a.aPerson.Name+" Owns " + a.noOfShares+ " share of "  + a.aCompany.Name);
		}

	}

}
