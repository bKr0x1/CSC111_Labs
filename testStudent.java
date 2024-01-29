import java.util.Scanner;
public class testStudent {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your registerd course: ");
		String course = input.next();
		
			Student s1 = new Student(); // Defining the object is not enough, object should be build using the keyword new as used in Scanner.
			s1.name = "Saleh";
			s1.age = 25;
			s1.GPA = 4.25;
			s1.course = course;
			
			s1.infoPrint();
			
			System.out.println("------------------------");
			
			Student s2 = new Student();
			s2.name = "Ahmed";
			s2.age = 19;
			s2.GPA = 4.69;
			s2.course = course;
			
			s2.infoPrint();

	}
}
