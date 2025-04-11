package Principles_Of_OOP.Encapsulation;


class BankAccount {
	private String userName;
	private String bankName;
	private long accno;
	private int pin;
	private String ifsc;
	private double balance;
	private long phNo;
	private long aadhar;
	
	public BankAccount(String userName,String bankName,long accno,int pin,String ifsc,long phNo,long aadhar) {
		this.userName = userName;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin ;
		this.ifsc = ifsc;
		this.phNo=phNo;
		this.aadhar=aadhar;
		System.out.println("Bank Account Created");
	}
	public long getPhoneNumber()
	{
		return phNo;
	}
	public void setPhoneNumber(long aadhar,long phNo)
	{
		if(this.aadhar==aadhar)
		{
			this.phNo=phNo;
			System.out.println("Phone Number Updated");
		}
		else
		{
			System.out.println("Invalid Details");
		}
	}
	public long getAadhar()
	{
		return aadhar;
	}
	public String getUserName()
	{
		return userName;
	}
	public String getBankName()
	{
		return bankName;
	}
	public long getAccNo()
	{
		return accno;
	}
	public void setPin(long accno,int newPin , int oldPin)
	{
		if(this.accno==accno && pin==oldPin)
		{
			pin = oldPin;
			System.out.print("Pin Updated");
		}
		else
		{
			System.out.println("Invlid Credentials");
		}
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public double getBalance(long accno,int pin)
	{
		if(this.accno==accno && this.pin==pin)
		{
			return balance;
		}
		else
		{
			System.out.print("Invalid Credentials");
			return 0;
		}
	}
	public void credit(long accno,double amt)
	{
		if(this.accno==accno)
		{
			if(amt>0)
			{
				balance+=amt;
				System.out.println("Amount Credited Successfully...\nTotal Amount : "+balance);
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	public void debit(long accno,int pin,int amt)
	{
		if(this.accno==accno)
		{
			if(balance-amt>2000)
			{
				balance-=amt;
				System.out.print("Amount Debited Successfully...\nTotal Amount : "+balance);
			}
			else
			{
				System.out.println("Insuffiecient Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
}
