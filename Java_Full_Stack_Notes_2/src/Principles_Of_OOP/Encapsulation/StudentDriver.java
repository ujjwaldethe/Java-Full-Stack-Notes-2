package Principles_Of_OOP.Encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1 = new Student("Ujjwal","Java Full Stack",39000,"Deccan",8.30,"BE",85,84.23,9370682720l);
		System.out.println(s1.getBranch());
		System.out.println(s1.getInstituteName());
		s1.setBranch(false, "Hadapsar");
		s1.setPhno(false, 9822740586l);
	}
}
