package whileloop;

import java.util.Scanner;

public class BabyCalculator {

	public static void main(String[] args) {
		
		double number1, number2, result=0;
		String operand;
		
		Scanner keyboard=new Scanner(System.in);
					
	//	System.out.println(number1+operand+number2);
		
		do{
			
			System.out.println("> ");
			number1=keyboard.nextDouble();
			operand=keyboard.next();
			number2=keyboard.nextDouble();
			
		//	System.out.println(operand);
			
			if(operand.equals("+"))
				System.out.println(number1+number2);
			else if(operand.equals("-"))
				System.out.println(number1-number2);
			else if(operand.equals("*"))
				System.out.println(number1*number2);
			else if(operand.equals("/"))
				System.out.println(number1/number2);
			
		} while(number1!=0);
		
		System.out.println("Buh Buhayee");
	}

}
