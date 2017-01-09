package keyboardinput;

import java.util.Scanner;

public class InputUserData {

	public static void main(String[] args) {

		String name;
		int age;
		double salary;
		
		Scanner keyinput=new Scanner(System.in);
		
		System.out.println("What is your name?");
		name=keyinput.next();
		
		System.out.println("Hi "+name + " ,how old are you?");
		age=keyinput.nextInt();
		
		System.out.println( age + ", great! How much do you earn?");
		salary=keyinput.nextDouble();
		
		System.out.println("That's nice!");
		
	}

}
