import java.util.Scanner;

public class GameStore2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		String option;
		int numberOfGames = 0;
		
		
		do {
		System.out.println();	
		System.out.println("Welcome to the Game Store");
		System.out.println("Please choose an option: ");
		System.out.println("\"add\" to the inventory");
		System.out.println("\"sell\" games to cusotmer");
		System.out.println("\"exit\" to end the program");
		System.out.print("Enter your option: ");
		option = input.next();
		
		if(option.equals("sell")) {
			if (numberOfGames == 0) {
				System.out.println("There are no more games in the inventory!");
				System.out.println();}
			else {
				double totalPrice = 0;
				int num = 0;
				System.out.println("Please enter game id (-1 to end): ");
				int id = input.nextInt();
				
				while(id!=-1 && numberOfGames >0) {
					System.out.println("Please enter the price of the game: ");
					double price = input.nextDouble();
					totalPrice= totalPrice + price;
					num++;
					numberOfGames --;
					if (numberOfGames<=0)
						System.out.println("Sorry can't sell more games.Out of Stock!");
					else {
						System.out.println("Please enter game id (-1 to end): ");
						id = input.nextInt();}
					
					
	}	double discount =0;
		if (num>2)
			discount  = 20.0/100;
		else {
			System.out.println("Total price before discount: "+totalPrice);
			System.out.println("Your discount is: " + (totalPrice - (totalPrice*(1-discount)))+"SR");
			
			totalPrice = totalPrice*(1-discount);
			System.out.println("Total price after discount is "+totalPrice+"SR");
		}
				
				
				
			}
		}
		else if(option.equals("add")) {
			System.out.println("Please enter game id (-1 to end): ");
			int id = input.nextInt();
			while(id!=-1) {
				numberOfGames++;
				System.out.println("Please enter game id (-1 to end): ");
				 id = input.nextInt();
		}
		}	}while (!option.equalsIgnoreCase("exit"));
		System.out.println("Thanks!GoodBye");
	}

}
