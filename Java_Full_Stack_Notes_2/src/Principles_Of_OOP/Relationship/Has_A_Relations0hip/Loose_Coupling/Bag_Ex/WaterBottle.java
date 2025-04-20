package Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex;

public class WaterBottle {
	private static int bottleCounter=0;
	private String material;
	private double capacity;
	private String brand;
	private double price;
	public WaterBottle()
	{
		
	}
	public WaterBottle(String material,double capacity ,String brand,double price)
	{
		super();
		bottleCounter++;
		this.brand = brand;
		this.material = material;
		this.capacity = capacity;
		this.price = price;
	}
	public static int getBottleCounter() {
		return bottleCounter;
	}
	public void displayWaterBottle()
	{
		System.out.println("\nBrand : "+brand+"\nMaterial : "+material+"\nPrice : "+price+"\nCapacity : "+capacity);
	}
	
}
