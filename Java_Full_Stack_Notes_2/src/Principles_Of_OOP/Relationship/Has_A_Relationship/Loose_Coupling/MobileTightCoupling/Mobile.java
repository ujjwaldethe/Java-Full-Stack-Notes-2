package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling.MobileTightCoupling;

public class Mobile {
	private String brand;
	private String model;
	private double price;
	private String color;
	private double camera;
	Os os;
	Battery battery;
	Processor ps = new Processor("SnapDragon",3.3,12,512);
	public Mobile() {
		
	}
	Mobile(String brand,String model,double price,String color,double camera,Os os)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.camera = camera;
		this.os = os;
		this.battery = new Battery(5000,"Samsung","Lithium Ion","20-04-2025","12 Months",45);
	}
	public void DisplayMobile()
	{
		System.out.println("Brand : "+brand+"\nModel :  "+ model+"\nPrice : "+ price+"\nColor : "+color+"\nCamera : "+camera);	 
	}
}
