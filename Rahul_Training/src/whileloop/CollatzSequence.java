package whileloop;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		
		int number, count=1, temp;
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number=keyboard.nextInt();
		
		System.out.print(number +"\t");
		
		do{
			temp=number;
			if(number%2==0){
				number=number/2;
				System.out.print(number +"\t");
			}
			else {
				number=number*3+1;
				System.out.print(number +"\t");
			}
			count++;
		}while(number!=1);
		
		System.out.println("\nTotal numbers in sequence are "+count);
	}

}
