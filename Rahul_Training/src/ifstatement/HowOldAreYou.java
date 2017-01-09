package ifstatement;

import java.util.Scanner;

public class HowOldAreYou {

	public static void main(String[] args) {

		String name;
		int age;
		
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Hey, what is your name? ");
		name=keyboard.next();
		
		System.out.println("Hey "+name +", how old are you? ");
		age=keyboard.nextInt();
		
		if(age<16)
			System.out.println("You can't drive");
		if(age<18)
			System.out.println("You can't vote");
		if(age<25)
			System.out.println("You can't rent a car");
		if(age>=25)
			System.out.println("You can do everything that is legal");
	
	}

}
