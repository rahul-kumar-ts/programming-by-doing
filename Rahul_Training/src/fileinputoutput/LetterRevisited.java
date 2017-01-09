package fileinputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class LetterRevisited {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("letter.txt");
		
		fw.write("+--------------------------------------------------+\n"+
				"|                                             ###   |\n");
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
