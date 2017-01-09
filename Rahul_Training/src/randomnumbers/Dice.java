package randomnumbers;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		
		int diceroll1, diceroll2,total=0;
		Random r=new Random();
		
		System.out.println("Here comes the dice!");
		
		diceroll1= 1+r.nextInt(6);
		System.out.println("\nRoll #1: "+diceroll1);
		
		diceroll2=1+r.nextInt(6);
		System.out.println("Roll #2: "+diceroll2);
		
		total=diceroll1+diceroll2;
		System.out.println("Total is: "+total);

	}

}
