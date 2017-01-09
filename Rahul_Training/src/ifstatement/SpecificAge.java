package ifstatement;

import java.util.Scanner;

public class SpecificAge {

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
		else if(age<18)
			System.out.println("You can't vote");
		else if(age<25)
			System.out.println("You can't rent a car");
		else if(age>=25)
			System.out.println("You can do everything that is legal");
	}

}
