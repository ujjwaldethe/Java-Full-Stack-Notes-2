package Principles_Of_OOP.Relationship.Has_A_Relationship.Tight_Coupling;

public class Refill {
	String color;
	double size;
	Refill(String color,double size)
	{
		this.color = color;
		this.size = size;
	}
	public void displayRefill()
	{
		System.out.println("Color : "+color);
		System.out.println("Size : "+size);
	}
}
