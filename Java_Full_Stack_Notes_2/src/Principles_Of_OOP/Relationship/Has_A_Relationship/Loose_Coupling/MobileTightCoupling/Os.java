package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling.MobileTightCoupling;

public class Os {
	private String version;
	private String name;
	private double memory;
	private String releaseDate;
	Os(String version,String name,double memory,String releaseDate)
	{
		this.version = version;
		this.name = name;
		this.memory = memory;
		this.releaseDate = releaseDate;
	}
	public void displayOs()
	{
		System.out.println("\nVersion : "+version+"\nOS Name : "+name+"\nMemory : "+memory+"\nRelease Date : "+releaseDate);
	}
}
