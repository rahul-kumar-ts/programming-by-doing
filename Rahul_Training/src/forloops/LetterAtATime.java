package forloops;

import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {
		
		String input;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a message");
		input=keyboard.nextLine();
		
		for(int i=0;i<input.length();i++){
			System.out.println(i+ " - "+input.charAt(i));
		}
		
		
		
		
	}

}
