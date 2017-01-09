package fileinputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) throws IOException {
		
		int score;
		String name;
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name=keyboard.next();
		System.out.println("\nEnter your score: ");
		score=keyboard.nextInt();
		
		FileWriter writer=new FileWriter("d:/name.txt");
		BufferedWriter buffer=new BufferedWriter(writer);
		
		buffer.write("Your name is "+name);
		buffer.newLine();
		buffer.write("Your score is "+score);
		
		buffer.close();
		
		System.out.println("Program ended");
	}

}
