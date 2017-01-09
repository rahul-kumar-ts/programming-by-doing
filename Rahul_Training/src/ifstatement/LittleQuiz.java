package ifstatement;

import java.util.Scanner;

public class LittleQuiz {

	public static void main(String[] args) {
		
		int score=0, answer;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Here comes your quiz..");
		
		System.out.println("Q1) What is the capital of Telangana? \n    1. Hyderabad \n    2. Warangal \n    3. Kurnool");
		System.out.println("Please select the correct answer number: " );
		answer=keyboard.nextInt();
		
		if(answer==1){
			System.out.println("Bingo! That is correct.");
			score+=1;
		}
		else
			System.out.println("Wrong! Better luck next time.");
		
		System.out.println();
		
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int? \n    1. Yes \n    2. No");
		System.out.println("Please select the correct answer number: " );
		answer=keyboard.nextInt();
		
		if(answer==2){
			System.out.println("Bingo! That is correct.");
			score+=1;
		}
		else
			System.out.println("Wrong! Better luck next time.");
		
		System.out.println();
		
		System.out.println("Q3) What is the result of 9+6/3? \n    1. 5 \n    2. 11 \n   3. 15/3");
		System.out.println("Please select the correct answer number: " );
		answer=keyboard.nextInt();
		
		if(answer==2){
			System.out.println("Bingo! That is correct.");
			score+=1;
		}
		else
			System.out.println("Wrong! Better luck next time.");
		
		System.out.println("You total score is "+score +" out of 3");
	}	

}
