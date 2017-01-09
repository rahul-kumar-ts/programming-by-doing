package fileinputoutput;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LetterRevisited {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer=new FileWriter("letter.txt");
		BufferedWriter fw=new BufferedWriter(writer);
		
//		bw.write("This is a test \n to check if linefeed works here.");
		
		
		
		fw.write("+--------------------------------------------------+\n");
		fw.write("|                                             ###  |\n");
		fw.write("|                                             ###  |\n");
		fw.write("|                                             ###  |\n");	
		fw.write("|                                                  |\n");
		fw.write("|                                                  |\n");
		fw.write("|                                  Rahul Kumar     |\n");
		fw.write("|                                  Manikonda       |\n");
		fw.write("|                                  Hyderabad, TS   |\n");
		fw.write("|                                                  |\n");
		fw.write("+--------------------------------------------------+");
	
		
		fw.close();
		
		System.out.println("Success");

	}

}
