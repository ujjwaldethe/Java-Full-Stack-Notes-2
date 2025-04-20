package Principles_Of_OOP.Relationship.Has_A_Relationship.Loose_Coupling.MobileTightCoupling;

public class MobileDriver {

 public static void main(String[] args) {
	 	Os os = new Os(	"14.32.3","Android",2,"20-04-2025");
	 	Mobile m = new Mobile("Samsung","M55",30000,"Red",45.3,os);
	 	m.DisplayMobile();
	 	m.os.displayOs();
	 	m.ps.displayProcessor();
	 	m.battery.displayBattery();
	 
 	}
}
