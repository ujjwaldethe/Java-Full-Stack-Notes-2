package Principles_Of_OOP.Relationship.Has_A_Relationship.Tight_Coupling;

import java.util.Scanner;

public class Pen {
	String brand;
	String type;
	double price;
	Refill ref;
	Scanner sc ;
	Pen(String brand,String type,double price)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
		sc = new Scanner(System.in);
		System.out.println("Enter Refill Color : ");
		String refillColor = sc.next();
		System.out.println("Enter Refill Size : ");
		double refillSize = sc.nextDouble();
		System.out.println("Enter Refill Type : ");
		String refillType = sc.next();
		ref = new Refill(refillColor,refillSize,refillType);
	}
	public void displayPen()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
	}
}
