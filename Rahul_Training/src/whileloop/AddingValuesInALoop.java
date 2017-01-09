package whileloop;

import java.util.Scanner;

public class AddingValuesInALoop {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		int inputNumber, sum=0;
		
		System.out.println("I will add up the numbers you give me. (Enter 0 to exit)) \nNumber: ");
		inputNumber=keyboard.nextInt();
		
		while(inputNumber!=0){
			sum=sum+inputNumber;
			System.out.println("The total so far is "+sum);
			System.out.println("Number: ");
			inputNumber=keyboard.nextInt();
		}
		
		System.out.println("The total is "+sum);
	}

}
