package forloops;

import java.util.Scanner;

public class AddingValuesForLoop {

	public static void main(String[] args) {
		
		int number, sum=0;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=keyboard.nextInt();
		
		for(int i=1;i<=number;i++)
			sum+=i;
		System.out.println("Total is: "+sum);

	}

}
