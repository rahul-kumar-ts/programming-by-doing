package ifstatement;

import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		
		String name;
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Enter you name");
		name=keyboard.next();
		
		if(name.compareToIgnoreCase("Carswell")<0)
			System.out.println("you don't have to wait long");
		
		if(name.compareToIgnoreCase("Carswell")>0 && name.compareToIgnoreCase("Jones")<=0)
			System.out.println("that's not bad");
		
		if(name.compareToIgnoreCase("Jones")>0 && name.compareToIgnoreCase("Smith")<=0)
			System.out.println("looks like a bit of a wait");
		
		if(name.compareToIgnoreCase("Smith")>0 && name.compareToIgnoreCase("Young")<=0)
			System.out.println("it's gonna be a while");
		
		if(name.compareToIgnoreCase("Young")>0)
			System.out.println("not going anywhere for a while?");
		

	}

}
