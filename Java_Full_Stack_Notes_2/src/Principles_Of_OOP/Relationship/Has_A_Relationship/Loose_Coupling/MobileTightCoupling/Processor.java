package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling.MobileTightCoupling;

public class Processor {
	private String type;
	private double clockSpeed;
	private int ram;
	private int rom;
	public Processor()
	{
		
	}
	Processor(String type,double clockSpeed,int ram,int rom)
	{
		this.clockSpeed = clockSpeed;
		this.ram = ram;
		this.rom = rom;
		this.type = type;
	}
	public void displayProcessor()
	{
		System.out.println("\nType : "+type+"\n Clock Speed : "+clockSpeed+"Ghz"+"\nRam : "+ram+"\nRom : "+rom);
	}
	
}
