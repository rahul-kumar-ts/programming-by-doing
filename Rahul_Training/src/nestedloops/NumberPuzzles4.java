package nestedloops;

public class NumberPuzzles4 {

	public static void main(String[] args) {

		for(int i=1;i<=45;i++){
			for(int j=1;j<=45;j++){
				for(int k=1;k<=45;k++){
					for(int m=1;m<=45;m++){
						if(i+j+k+m==45){
							if(i+2==j-2 && j-2==k*2 && k*2==m/2)
								System.out.println(i+","+j+","+k+","+m+",");
						}
					}
				}
			}
		}
		
	}

}
