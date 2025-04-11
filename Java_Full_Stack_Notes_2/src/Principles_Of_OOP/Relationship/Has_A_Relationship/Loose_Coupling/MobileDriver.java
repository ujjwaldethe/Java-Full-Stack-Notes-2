package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung","S21",35000l,"5G");
		m.displayMobile();
		m.insertSim();
		m.s.displaySim();
		m.displayMobile();
	}

}
