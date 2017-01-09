package functions;

import java.util.Scanner;

public class Keychain3 {

	static int currentKeychains=0;
	
	public static void main(String[] args) {
		
		int inputChoice;
		int keychainsAdded=0, keychainRemoved=0, price_per_keychain=10;
		
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Welcome to Keychain Shoppe\n");

		do{
			System.out.println("1. Add Keychains to Order\n"+
							   "2. Remove Keychains from Order\n"+
							   "3. View Current Order\n"+
							   "4. Checkout");
			
			System.out.println("Please enter your choice: ");
			inputChoice=keyboard.nextInt();
			
		//	code for adding keychains
			
			if(inputChoice==1){
				do{
					System.out.println("You have "+currentKeychains+" keychains. How many to add? ");
					keychainsAdded=keyboard.nextInt();
					if(keychainsAdded<=0)
						System.out.println("Invalid input! Please try again.\n");
				}while(keychainsAdded<=0);
				currentKeychains = addToOrder(keychainsAdded);
				System.out.println("You now have "+currentKeychains+" keychains.");
				System.out.println();
			}
			
		//	code for removing keychains
			
			if(inputChoice==2){
				do{
					System.out.println("You have "+currentKeychains+" keychains. How many to remove? ");
					keychainRemoved=keyboard.nextInt();
					if(keychainRemoved<=0)
						System.out.println("Invalid input! Please try again.\n");
				}while(keychainRemoved<=0);
				currentKeychains = removeFromOrder(keychainRemoved);
				System.out.println("You now have "+currentKeychains+" keychains.");
				System.out.println();
			}
					
			
			
		//	code for viewing order
			
			if(inputChoice==3)
				viewOrder(currentKeychains,price_per_keychain);
			
		} while(inputChoice!=4);	
	}
	
	public static int addToOrder(int keychainsAdded){
		
		currentKeychains=currentKeychains+keychainsAdded;
		return currentKeychains;
	}
	
	public static int removeFromOrder(int keychainRemoved){
		
		currentKeychains=currentKeychains-keychainRemoved;
		return currentKeychains;
	}

	public static void viewOrder(int currentKeychains,int price_per_keychain){
		
		System.out.println("You have "+currentKeychains +" keychains.");
		System.out.println("Keychains cost $"+price_per_keychain+" each.");
		System.out.println("Total cost is $"+(currentKeychains*price_per_keychain));
		
	}

}
