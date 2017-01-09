package randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		int guessednumber, secretnumber;
		Scanner keyboard=new Scanner(System.in);
		Random r=new Random();
		System.out.println("I am thinking of a number between 1 to 10 \n Your guess: ");
		guessednumber=keyboard.nextInt();
		
		secretnumber=1+ r.nextInt(10);
		
		if(secretnumber==guessednumber)
			System.out.println("That's right! I too was thinking about "+secretnumber);
		else
			System.out.println("Sorry! I was thinking about "+secretnumber);
		
		
	}

}
