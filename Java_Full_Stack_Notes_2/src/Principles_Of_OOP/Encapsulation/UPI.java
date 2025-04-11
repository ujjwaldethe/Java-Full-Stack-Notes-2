package Principles_Of_OOP.Encapsulation;

public class UPI {
	private String upiId;
	private long phNo;
	private long accNo;
	private long debitCardNo;
	private int upiPin;
	BankAccount B;
	private UPI()
	{
		
	}
	UPI(String upiId,long phNo,long debitCardNo,int pin,BankAccount B)
	{
		this.upiId=upiId;
		this.phNo=phNo;
		this.debitCardNo=debitCardNo;
		upiPin=pin;
		this.B=B;
		System.out.println("UPI ID CREATED");
	}
	public void displayUpi()
	{
		System.out.println("UPI Id : "+upiId);
		System.out.println("Phone Number : "+phNo);
		System.out.println("Username : "+B.getUserName());
		System.out.println("Bank : "+B.getBankName());
		System.out.println("Account No : "+B.getAccNo());
		System.out.println("Aadhar No : "+B.getAadhar());
	}
	
	
}
