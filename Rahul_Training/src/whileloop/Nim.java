package whileloop;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		
		int pileA=3, pileB=4, pileC=5;
		int removePile, last=0;
		String pileChoice, player1, player2;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Player 1, enter your name: ");
		player1=keyboard.next();
		
		System.out.print("Player 2, enter your name: ");
		player2=keyboard.next();
		
		do{
			System.out.println("\nA:"+pileA +"\t B:"+pileB +"\t C:"+pileC);
			System.out.println();
		
		//  Player 1 chance 
			
			System.out.print(player1 +",choose a pile: ");
			pileChoice=keyboard.next();
			System.out.println("How many to remove from pile: ");
			removePile=keyboard.nextInt();
			
			if(pileChoice.equalsIgnoreCase("A")){
				pileA=pileA-removePile;
				last=1;
			}
			else if(pileChoice.equalsIgnoreCase("B")){
				pileB=pileB-removePile;
				last=1;
			}
			else if(pileChoice.equalsIgnoreCase("C")){
				pileC=pileC-removePile;
				last=1;
			}
			
			if(pileA==0 && pileB==0 && pileC==0)
				break;
	//		Player 2 chance 
			
			System.out.println("\nA:"+pileA +"\t B:"+pileB +"\t C:"+pileC);
			
			System.out.print(player2 +",choose a pile: ");
			pileChoice=keyboard.next();
			System.out.println("How many to remove from pile: ");
			removePile=keyboard.nextInt();
			
			if(pileChoice.equalsIgnoreCase("A")){
				pileA=pileA-removePile;
				last=2;
			}
			else if(pileChoice.equalsIgnoreCase("B")){
				pileB=pileB-removePile;
				last=2;
			}
			else if(pileChoice.equalsIgnoreCase("C")){
				pileC=pileC-removePile;
				last=2;
			}
			
			if(pileA==0 && pileB==0 && pileC==0)
				break;
			
		}while(pileA>0 || pileB>0 || pileC>0);
		
		System.out.println("\nA:"+pileA +"\t B:"+pileB +"\t C:"+pileC);

		
		if(last==1)
			System.out.println(player2+ ",no more piles to remove, so you win ");
		else if(last==2)
			System.out.println(player1+ ",no more piles to remove, so you win ");

	}

}
