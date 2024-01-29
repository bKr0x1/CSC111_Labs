import java.util.Scanner;
public class HighScores {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String name;
		int score;
		int numberStu;
		
		System.out.print("Enter number of students: ");
		numberStu = input.nextInt();
		
		System.out.print("Enter student name: ");
		String name1 = input.next();
		input.nextLine();
		System.out.print("Enter Student score: ");
		int score1 = input.nextInt();
		

		System.out.print("Enter student name: ");
		String name2 = input.next();
		input.nextLine();
		System.out.print("Enter Student score: ");
		int score2 = input.nextInt();
		
		if(score2 >score1) {
			String tempName; // temporary variables to swap information when our proposition is not True
			int tempScore;
			
			tempName = name1;
			tempScore = score1;
			name1 = name2;
			score1 = score2;
			
			name1 = tempName;
			score1 = tempScore;
		}
		/*
		  لكي نفرز أفضل/أعلى درجة، نفترض أن الطالب لاول في الكشف هو الافضل
		  ثم بعد ذلك نمر على بقية الطلاب باستخدام for loop أخر.
		*/
		
		for(int i=0; i<numberStu-2; i++) {// 1 is subtracted from number of Students because 1 has been registered
			System.out.print("Enter student name: ");
			name = input.next();
			input.nextLine();
			System.out.print("Enter Student score: ");
			score = input.nextInt();
			
			if(score > score1) {
				
				name2 = name1;
				score2 = score1;
				name1 = name;
				score1 = score;
			}
			else if (score > score2) {
				name2 = name;
				score2 = score;
			}
				
				
		}
		
		System.out.println("Top two students: ");
		System.out.println("1)"+name1+ "'s score is "+score1);
		System.out.println("2)"+name2+ "'s score is "+score2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
