package keyboardinput;

import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {

		double number1, number2, number3;
		
		Scanner keyinput=new Scanner(System.in);
		
		System.out.print("What is your first number? ");
		number1=keyinput.nextDouble();
		
		System.out.print("What is your second number? ");
		number2=keyinput.nextDouble();
		
		System.out.print("What is your third number? ");
		number3=keyinput.nextDouble();
		
		System.out.println("Average of these numbers is: "+(number1+number2+number3)/3);
		
	}

}
