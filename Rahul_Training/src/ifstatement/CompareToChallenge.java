package ifstatement;

public class CompareToChallenge {

	public static void main(String[] args) {
		
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int i = "axe".compareTo("dog");
		System.out.println(i);

		System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		System.out.println( "applebee's".compareTo("apple") );

		System.out.print("Comparing \"dog\" with \"cat\" produces ");
		System.out.println( "dog".compareTo("cat") );
		
		System.out.print("Comparing \"me\" with \"you\" produces ");
		System.out.println( "me".compareTo("you") );
		
		System.out.print("Comparing \"day\" with \"night\" produces ");
		System.out.println( "day".compareTo("night") );
		
		System.out.print("Comparing \"Sun\" with \"SUN\" produces ");
		System.out.println( "acz".compareTo("abc") );
	}

}
