package Principles_Of_OOP.Relationship.Has_A_Relationship.Tight_Coupling;

public class Refill {
	String color;
	double size;
	String type;
	Refill(String color,double size,String type)
	{
		this.color = color;
		this.size = size;
		this.type=type;
	}
	public void displayRefill()
	{
		System.out.println("Color : "+color);
		System.out.println("Size : "+size);
		System.out.println("Type : "+type);
	}
}
