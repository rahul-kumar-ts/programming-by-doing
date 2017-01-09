package ifstatement;

import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		int weightOnEarth, planet;
		double newWeight=0;
		System.out.println("Enter your weight on earth : ");
		weightOnEarth=keyboard.nextInt();
		
		System.out.println("1. Venus     2. Mars    3. Jupiter");
		System.out.println("4. Saturn    5. Uranus  6. Neptune");
		
		System.out.println("Which planet are you visiting? Enter the number: ");
		planet=keyboard.nextInt();
		
		if(planet==1)
			newWeight=weightOnEarth*0.78;
		if(planet==2)
			newWeight=weightOnEarth*0.39;
		if(planet==3)
			newWeight=weightOnEarth*2.65;
		if(planet==4)
			newWeight=weightOnEarth*1.17;
		if(planet==5)
			newWeight=weightOnEarth*1.05;
		if(planet==6)
			newWeight=weightOnEarth*1.23;
			
		System.out.println("You will weigh "+ newWeight + " pounds on this planet");
	}

}
