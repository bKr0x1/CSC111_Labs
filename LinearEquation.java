import java.util.Scanner;
public class LinearEquation {

	public double a, b, c, d, e, f;
	
	public boolean isSolvable() {
		if(a*d-b*c == 0)
			return false;
		return true;// Any line after return is not compiled
		
	}
	
	public double solveX() {
		return (e*d - b*f) / (a*d - b*c);
	}
	public double solveY() {
		return (a*f - e*c) / (a*d - b*c);
	}
	
	

		public static void main(String args[]) {
			
			Scanner input = new Scanner(System.in);
			
			LinearEquation e = new LinearEquation();
			
			System.out.print("Enter a, b, c, d, e, f: ");
			e.a = input.nextDouble();
			e.b = input.nextDouble();
			e.c = input.nextDouble();
			e.d = input.nextDouble();
			e.e = input.nextDouble();
			e.f = input.nextDouble();
			
			if(e.isSolvable()) {
				System.out.println("X = "+e.solveX());
				System.out.println("Y ="+e.solveY());
			}
			else 
				System.out.println("The system has no solution.");
		}	
		
		
		










}