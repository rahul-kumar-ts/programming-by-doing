package randomnumbers;

import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {

		int fortuneNumber;
		
		Random r=new Random();
		
		fortuneNumber=1 + r.nextInt(6);
		
		if(fortuneNumber==1)
			System.out.println("You will find happiness with new love");
		else if(fortuneNumber==2)
			System.out.println("You will find material wealth soon");
		else if(fortuneNumber==3)
			System.out.println("Stick with your wife");
		else if(fortuneNumber==4)
			System.out.println("You're going to be a Yogi");
		else if(fortuneNumber==5)
			System.out.println("You're destined to be a legen-(wait for it)-dary");
		else if(fortuneNumber==6)
			System.out.println("You will have a great boss");
		
		for(int i=1;i<=6;i++){
			fortuneNumber=1+r.nextInt(55);
			System.out.print(fortuneNumber +" - ");
		}
		
	}

}
