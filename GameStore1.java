import java.util.Scanner;

public class GameStore1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberOfGames = 0;
		double total = 0;
		
		
		System.out.println("Welcome to Gaming Center :).");
		System.out.print("Please, enter game id: ");
		int id = input.nextInt();
		
		while(id!=-1) {
			System.out.print("Please, enter the price of next game: ");
			double price = input.nextDouble();
			
			total = total  + price;
			numberOfGames++;
			
			System.out.print("Please, enter game id: ");
			id = input.nextInt();
			
		}
			System.out.println("Total price before discount: "+ total+"SR" );
			
			if(numberOfGames <1) 
				System.out.println("Error");
			else {
				double DisAmount = 0;
				double discount = 20.0/100;
				if(numberOfGames>2)
					DisAmount = discount  * total ;
				double Total = total - DisAmount;
				System.out.println("Your discount is: "+ DisAmount+"SR");
				System.out.println("Total price after discount: "+ Total +"SR");
			}
			
				
				

		
	}

}
