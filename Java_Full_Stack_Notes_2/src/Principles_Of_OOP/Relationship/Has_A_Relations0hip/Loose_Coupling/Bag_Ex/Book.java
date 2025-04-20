package Principles_Of_OOP.Relationship.Has_A_Relations0hip.Loose_Coupling.Bag_Ex;

public class Book {
	private static int bookCounter = 0;
	private String type;
	private String brand;
	private String size;
	private int pages;
	private double price;
	public Book()
	{
		
	}
	public Book(String type,String brand,String size,int pages,double price)
	{
		super();
		bookCounter++;
		this.type =type;
		this.brand=brand;
		this.size=size;
		this.pages=pages;
		this.price=price;	
	}
	public void displayBook()
	{
		System.out.println("\nBrand : "+brand+"\nType : "+type+"\nSize : "+size+"\nPages : "+pages+"\nPrice : "+price);
	}
	public static int getBookCounter() {
		return bookCounter;
	}
}
