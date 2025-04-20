package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling.MobileTightCoupling;

public class Battery {
	private int capacity;
	private String brand;
	private String type;
	private String manfDate;
	private String warranty;
	private double power;
	public Battery()
	{
		
	}
	Battery(int capacity,String brand,String type,String manfDate,String warranty,double power)
	{
		super();
		this.brand = brand;
		this.capacity =capacity;
		this.manfDate = manfDate;
		this.power = power;
		this.type = type;
		this.warranty = warranty;
	}
	public void displayBattery()
	{
		System.out.println("\nBrand : "+brand+"\nCapacity : "+capacity+"\nManufacturing Date : "+manfDate+"\nPower : "+power+"\nType : "+type+"\nWarranty : "+warranty);
	}
	
}
