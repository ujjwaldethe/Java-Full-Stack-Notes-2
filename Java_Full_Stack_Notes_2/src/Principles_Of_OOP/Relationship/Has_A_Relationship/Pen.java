package Principles_Of_OOP.Relationship.Has_A_Relationship;

public class Pen {
	String brand;
	String type;
	double price;
	Refill ref = new Refill("Pen",7);
	Pen(String brand,String type,double price)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
	}
	public void displayPen()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
	}
}
