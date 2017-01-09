package randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

	public static void main(String[] args) {
		
		int input, ace;
		
		Random r=new Random();
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Which one is ace? \n\n\t# # # \n\t# # # \n\t1 2 3");
		System.out.println(">");
		input=keyboard.nextInt();
		
		ace=1+r.nextInt(3);
		
		if(ace==input)
			System.out.println("\nYou nailed it!");
		else
			System.out.println("\nYou lose! The correct number was "+ace);
		
	}

}
