package Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex;

public class Pen {
	private static int penCounter = 0;
	private String brand;
	private String type;
	private String color;
	private double price;
	public Pen()
	{
		
	}
	public Pen(String brand,String type,String color,double price)
	{
		penCounter++;
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
	}
	public static int getPenCounter() {
		return penCounter;
	}
	public void displayPen() 
	{
		System.out.println("\nBrand : "+brand+"\nType : "+type+"\nColor : "+color+"\nPrice : "+price);
	}
}
