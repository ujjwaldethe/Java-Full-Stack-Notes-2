package Principles_Of_OOP.Encapsulation;

import java.util.Scanner;

public class Paytm {
	private String name;
	private long phNo;
	private int age;
	private String upiId;
	private long accNo;
	private long debitCardNo;
	private int upiPin;
	UPI u;
	Scanner sc ;
	private Paytm()
	{
		
	}
	Paytm(String name,long phNo,int age)
	{
		this.name=name;
		this.phNo=phNo;
		this.age=age;
	}
	public void displayPaytm()
	{	
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Mobile Number : "+phNo);
	}
	public void createUpi(BankAccount B)
	{ 
		if(validateBank(B))
		{	sc = new Scanner(System.in);
			System.out.println("Enter Upi Id : ");
			upiId = sc.next();
			System.out.println("Enter Debit-Card No : ");
			debitCardNo = sc.nextLong();
			System.out.println("Enter UPI Pin : ");
			debitCardNo = sc.nextInt();
			u = new UPI(upiId,phNo,debitCardNo,upiPin,B);
		}
		else 
		{
			System.out.print("Please Enter Valid Details");
		}
	}
	public boolean validateBank(BankAccount B)
	{
		sc = new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		accNo = sc.nextLong();
		if(B.getAccNo()==accNo )
		{
			return true;
		}
		return false;
	}
	
}
