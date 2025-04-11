package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling;

public class Sim {
	String operator;
	String type;
	long simNo;
	String plan;
	private Sim()
	{
		
	}
	Sim (String operator,String type,long simNo,String plan)
	{
		this.operator=operator;
		this.type=type;
		this.simNo=simNo;
		this.plan=plan;
	}
	public void displaySim()
	{
		System.out.println(operator);
		System.out.println(type);
		System.out.println(simNo);
		System.out.println(plan);
	}
	
}
