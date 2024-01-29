import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int Fahrenheit, speed;
		double twc = 0;
		
		
		
		System.out.println("Enter the temperature in Fahrenheit:");
		Fahrenheit = input.nextInt();
		
		if (Fahrenheit<= -58 || Fahrenheit>= 41) 
			System.out.println("Temperature must be between -58F and 41F.");
			
			else {
		System.out.println("Enter the wind speed miles per hour: ");
		speed = input.nextInt();
		
				if(speed<= 2) 
			System.out.println("Speed must be greater than or equal to 2");
				else
		
				  twc = 35.74 + (0.6215*Fahrenheit) - (35.75* Math.pow(speed, 0.16)) 
				+ (0.4275*Fahrenheit *Math.pow(speed, 0.16)) ;
		
		
		System.out.println("The wind chill index is "+twc);}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
