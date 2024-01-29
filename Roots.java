import java.util.Scanner;
public class Roots {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c:  ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b, 2) - 4*a*c;
		
		double dis = Math.pow(discriminant,0.5);
		if(discriminant < 0)
			System.out.println("The equation no real zeros.");
		
		else if (discriminant == 0)
			System.out.println("The equation has one root "+ -b/(2*a));
		else 
			System.out.println("The equation has two roots "+ ((-b+dis)/(2*a)) + " and "
					+ ((-b-dis)/(2*a)));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
