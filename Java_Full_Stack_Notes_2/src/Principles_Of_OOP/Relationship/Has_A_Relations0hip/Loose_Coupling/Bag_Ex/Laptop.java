package Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex;

public class Laptop {
	private static int laptopCounter = 0;
	private String brand;
	private String model;
	private double price;
	public Laptop()
	{
		
	}
	public Laptop(String brand,String model,double price)
	{
		super();
		laptopCounter++;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public static int getLaptopCounter() {
		return laptopCounter;
	}
	public void displayLaptop()
	{
		System.out.println("\nBrand : "+brand+"\nModel : "+model+"\nPrice : "+price);
	}
}
