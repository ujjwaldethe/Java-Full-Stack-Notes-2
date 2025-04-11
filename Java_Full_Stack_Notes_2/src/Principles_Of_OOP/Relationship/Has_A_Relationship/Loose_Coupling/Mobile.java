package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling;

public class Mobile {
	String brand;
	String name;
	long price;
	String type;
	Sim s;
	String simStatus="Not Inserted";
	private Mobile()
	{
		
	}
	Mobile(String brand,String name,long price,String type)
	{
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.type=type;
		System.out.println("Mobile Created");
	}
	public void insertSim()
	{
		s = new Sim("jio","5G",9370682720l,"prepaid");
		simStatus="Inserted";
		System.out.println("Sim Created");
	}
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
	}
}
