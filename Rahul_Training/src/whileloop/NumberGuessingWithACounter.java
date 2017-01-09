package whileloop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter {


		
		public static void main(String[] args) {
			
			int secretNumber, userinput, count=0;
			Random r=new Random();
			Scanner keyboard=new Scanner(System.in);
			
			secretNumber=1+r.nextInt(10);
			
		
			
			System.out.println("Guess a number between 1 to 10");
			System.out.print("Your Guess :");
			userinput=keyboard.nextInt();
			count++;
			while(userinput!=secretNumber){
				System.out.println("\nYou guessed wrong! Try again.");
				System.out.print("Your Guess :");
				userinput=keyboard.nextInt();
				count++;
			}
			System.out.println("\nBingo! You got it in "+count +" tries.");
		}

	

}
