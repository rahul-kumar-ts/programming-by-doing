package whileloop;

import java.util.Scanner;

public class BabyNim {

	public static void main(String[] args) {
		
		int pileA=3, pileB=3, pileC=3;
		int removeFromPile;
		String choosePile;
		
		Scanner keyboard=new Scanner(System.in);
		
		do{
			System.out.println("A:"+pileA +"\t B:"+pileB +"\t C:"+pileC);
			System.out.print("Choose a pile: ");
			choosePile=keyboard.next();
			System.out.println("How many to remove from pile: ");
			removeFromPile=keyboard.nextInt();
		
			if(choosePile.equalsIgnoreCase("A"))
				pileA=pileA-removeFromPile;
			if(choosePile.equalsIgnoreCase("B"))
				pileB=pileB-removeFromPile;
			if(choosePile.equalsIgnoreCase("C"))
				pileC=pileC-removeFromPile;
		
					
		}while((pileA>0) || (pileB>0) || (pileC>0));
		
		System.out.println("Congrats! All your piles are empty");

	}

}
