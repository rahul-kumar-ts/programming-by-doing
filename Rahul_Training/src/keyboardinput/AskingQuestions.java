package keyboardinput;

import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args ){
		
		Scanner input=new Scanner(System.in);
		
		int age;
		String height;
		double weight;
		
		System.out.print("Enter your age : ");
		age=input.nextInt();
		
		System.out.print("Enter your height : ");
		height=input.next();
		
		System.out.print("Enter your weight : ");
		weight=input.nextDouble();
		
		System.out.println("I am "+age +" years old. I am "+height +" inches tall and weigh "+weight +" 34kilos.");
	}
}
