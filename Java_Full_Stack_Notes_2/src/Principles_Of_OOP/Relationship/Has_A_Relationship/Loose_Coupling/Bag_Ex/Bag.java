package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling.Bag_Ex;
import Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex.Book;
import Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex.Pen;
import Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex.Laptop;
import Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex.WaterBottle;
import java.util.ArrayList;
import java.util.Scanner;

public class Bag {
	private final static int bookMaxCapacity = 5 ;
	private final static int penMaxCapacity = 10 ;
	private final static int laptopMaxCapacity = 1 ;
	private final static int waterbottleMaxCapacity = 2 ;
	
	private String brand;
	private String type;
	private double litre;
	private int price;
	private String color;
	private String material;
	
	Book book;
	Pen pen;
	Laptop laptop;
	WaterBottle waterBottle;
	Scanner sc ; 
	
	ArrayList<Book> bookList = new ArrayList<>();
	ArrayList<Pen> penList = new ArrayList<>();
	ArrayList<Laptop> laptopList = new ArrayList<>();
	ArrayList<WaterBottle> waterbottleList = new ArrayList<>();

	public Bag()
	{
		super();
	}
	public Bag(String brand,String type,double litre,int price,String color,String material)
	{
		this.brand=brand;
		this.type=type;
		this.litre=litre;
		this.price=price;
		this.color=color;
		this.material=material;
	}
	public void displayBag()
	{
		System.out.println("\nBrand : "+brand+"\nType : "+type+"\nLitre : "+litre+"\nPrice : "+price+"\nColor : "+color+"\nMaterial : "+material);
	}
	public void addBook()
	{
		sc = new Scanner(System.in);
		if(Book.getBookCounter()<=bookMaxCapacity)
		{
			String type = sc.next();
			String brand = sc.next();
			String size = sc.next();
			int pages = sc.nextInt();
			double price = sc.nextDouble();
			book = new Book(type,brand,size,pages,price);
		}
		else
		{
			System.out.println("Bag Holding Books Capacity Is Full");
		}
	}
	public void addPen()
	{
		sc = new Scanner(System.in);
		
		if(Pen.getPenCounter()<=penMaxCapacity)
		{
			
			String brand = sc.next();
			String type = sc.next();
			String color = sc.next();
			double price = sc.nextDouble();
			pen = new Pen( brand, type, color, price);
		}
		else
		{
			System.out.println("Bag Holding Pens Capacity Is Full");
		}
	}
	public void addLaptop()
	{
		sc = new Scanner(System.in);
	
		if(Laptop.getLaptopCounter()<=laptopMaxCapacity)
		{
			
			String brand = sc.next();
			String model = sc.next();
			double price = sc.nextDouble();
			laptop  = new Laptop( brand, model, price);
		}
		else
		{
			System.out.println("Bag Holding Laptops Capacity Is Full");
		}
	}
	public void addWaterBottle()
	{
		sc = new Scanner(System.in);
	
		if(WaterBottle.getBottleCounter()<=waterbottleMaxCapacity)
		{
			String brand = sc.next();
			String material= sc.next();
			double capacity = sc.nextDouble();
			double price = sc.nextDouble();
			waterBottle  = new WaterBottle(material,capacity,brand, price);
			
		}
		else
		{
			System.out.println("Bag Holding Laptops Capacity Is Full");
		}
		
	}
}
