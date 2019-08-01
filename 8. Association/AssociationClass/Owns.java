package AssociationClass;

public class Owns {
	
	protected Person aPerson;
	protected Company aCompany;
	protected int noOfShares;
	
	public String ID;
	public String CID;
	public double Price;
	public String Date;
	
	public Owns(String ID, int price, Person P, Company C, int num)
	{
		this.ID = ID;
		this.Price = price;
		this.aPerson = P;
		this.aCompany = C;
		this.noOfShares = num;
	}

}
