import java.util.Scanner;
public class CountPositiveNegative {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double average;
		int positive = 0, negative=0, total=0,count=0;//the variable count is the number of positives + negatives 
		
		System.out.print("Enter unspecified number of integers and 0 to end: ");
		
		
		int number = input.nextInt();
		
		while (number!=0) {
			if(number >0)
				positive ++;
			else
				negative ++;
			
			total = total + number;
			count++; //كل مرة المستخدم يدخل عدد صحيح سواء موجب أو سولب يزداد العداد بواحد
			
			number = input.nextInt();
		}
		
		
		if(count == 0)
			System.out.println("No numbers are entered except ZERO!");
		else {
			average = (double)total/(count);
			System.out.println("Number of positives: "+ positive);
			System.out.println("Number of negatives: "+ negative);
			System.out.println("The total is: "+total);
			System.out.println("The average is: "+average);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
