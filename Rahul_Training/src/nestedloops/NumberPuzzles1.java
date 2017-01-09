package nestedloops;

public class NumberPuzzles1 {

	public static void main(String[] args) {
		
	//		int difference, sum, number1,number2;
			for(int i=60;i>=0;i--){
				for(int j=1;j<=60;j++){
					if(i-j==14){
						if(i+j==60)
							System.out.println(i+","+j);
					}
				}
			}   
		
	}

}
