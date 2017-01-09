package ifstatement;

import java.util.Scanner;

public class TwoMoreQuestions {

	public static void main(String[] args) {
		
		String answer1, answer2;
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("TWO QUESTIONS \n Think of an object and I'll try to guess it.");
		
		System.out.println("Q1) Is it an animal, vegetable or mineral?");
		answer1=keyboard.next();
		
		System.out.println();
		
		System.out.println("Q2) Is it bigger or smaller than a breadbox?");
		answer2=keyboard.next();
		
//		System.out.println(answer1 + "\n" + answer2);
	
		if(answer1.equalsIgnoreCase("animal") && answer2.equalsIgnoreCase("bigger"))
			System.out.println("My guess is that you are thinking about Moose");
		if(answer1.equalsIgnoreCase("animal") && answer2.equalsIgnoreCase("smaller"))
			System.out.println("My guess us that you are thinking about Squirrel");
		
		if(answer1.equalsIgnoreCase("vegetable") && answer2.equalsIgnoreCase("bigger"))
			System.out.println("My guess is that you are thinking about Watermelon");
		if(answer1.equalsIgnoreCase("vegetable") && answer2.equalsIgnoreCase("smaller"))	
			System.out.println("My guess us that you are thinking about Carrot");
		
		if(answer1.equalsIgnoreCase("mineral") && answer2.equalsIgnoreCase("bigger"))
			System.out.println("My guess is that you are thinking about Camaro");
		if(answer1.equalsIgnoreCase("mineral") && answer2.equalsIgnoreCase("smaller"))
			System.out.println("My guess us that you are thinking about Paper Clip");
			

	}

}
