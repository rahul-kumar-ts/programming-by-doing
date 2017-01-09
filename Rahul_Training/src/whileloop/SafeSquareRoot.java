package whileloop;

import java.util.Scanner;

public class SafeSquareRoot {

	public static void main(String[] args) {
		
		int number;
		double sqrt;
		Scanner keyboard=new Scanner(System.in);
		
		do{
			System.out.println("Enter your Number to find its square root: ");
			number=keyboard.nextInt();
			System.out.println("Invalid Number");
		}while(number<=0);
		
		sqrt=Math.sqrt(number);
		System.out.println("Square root id "+sqrt);
	}

}
