package ifstatement;

import java.util.Scanner;

public class AgeMessages3 {

	public static void main(String[] args) {

		String name;
		int age;
		
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Hey, what is your name? ");
		name=keyboard.nextLine();
		
		System.out.println("Hey "+name +", how old are you? ");
		age=keyboard.nextInt();
		
		if(age<16)
			System.out.println("You can't drive");
		else if(age>=16 && age<18)
			System.out.println("You can drive but not vote.");
		else if(age>=18 && age<25)
			System.out.println("You can vote but not rent a car.");
		else if(age>=25)
			System.out.println("You can do pretty much anything.");
	}

}
