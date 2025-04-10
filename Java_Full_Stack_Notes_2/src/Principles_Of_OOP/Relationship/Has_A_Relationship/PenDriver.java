package Principles_Of_OOP.Relationship.Has_A_Relationship;

public class PenDriver {
	public static void main(String args[])
	{
		Pen p1 = new Pen("Flair","Simple",25);
		p1.ref.displayRefill();
		p1.displayPen();
	}
}
