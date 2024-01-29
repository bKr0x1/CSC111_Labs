import java.util.Scanner;

public class GameStore3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String option;
		System.out.println("Welcome to gaming center");
		do {
			System.out.print("Please enter the game type: ");
			char type = input.next().charAt(0);
			System.out.print("Please enter the price of the game: ");
			double price = input.nextDouble();
			System.out.print("Please enter number of copies: ");
			int num = input.nextInt();//عدد النسخ
			
			switch(type) { //you can also use if-else Statement
			case 'g':
				double gPrice = price *1.40;
				double gSubtotal= 0;// before discount
				double gdisAmount= 0;// discount amount
				double gdiscount = 20.0/100;
				double gTotal= 0;
				
				
				if(num>0 &&num<=2) {
					gSubtotal = gPrice * num;
					gTotal = gSubtotal; //disAmount == 0 does not deserve discount(discount is subtracted from subtotal 
				}
				else {
					gSubtotal = gPrice * (num-1);//num -1 because the first game doesn't count in the discount
					gdisAmount = gSubtotal * gdiscount;
					gTotal = gSubtotal - gdisAmount + gPrice;//gPtice is cost of the first game bought 	
				}
				System.out.println("Total price is: "+gTotal+"SR");
				break;
				
				
				
			case 'n':
				double nSubtotal = 0;// before discount
				double ndisAmount= 0;// discount amount
				double ndiscount = 10.0/100;
				double nTotal= 0;
				
				if(num>0 && num<3)
					nTotal = price * num;
				else {
					nSubtotal = price * (num-2);
					ndisAmount = nSubtotal * ndiscount;
					nTotal = nSubtotal - ndisAmount + price + price;// "price + price " is the price of the first and second copies.	
				}System.out.println("Total price is: "+nTotal+"SR");
				break;
		
				default:
					System.out.println("Error.Wrong type!"); break;
			}
					
			
		
			
			
			
			
			
			
			
			
			System.out.println("Do you want to continue? (yes or no) ");
			option = input.next();
		}while(!option.equalsIgnoreCase("No"));	
		
		System.out.println("Good Bye");
		
		
	}

}
