package whileloop;

import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
	
	public static void main(String[] args){
		
		int count=2;
		Random r = new Random();
		int secretNumber = 1+r.nextInt(100);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I\'m thinking of a number between 1-100.  Try to guess it.");
		
		int guess = keyboard.nextInt();
		System.out.println();
		
		while(secretNumber!=guess && count<=7){
		
				if(secretNumber>guess)
					System.out.println("Sorry, you are too low. Guess Again");
				else
					System.out.println("Sorry, you are too high. Guess Again");
				count++;
				System.out.println("Guess again!");
				guess = keyboard.nextInt();
		}
		
		if(count<=7)
			System.out.println("Bingo! You guessed right!");
		else
			System.out.println("Sorry! You could not guess it in 7 tries");
	}
}
