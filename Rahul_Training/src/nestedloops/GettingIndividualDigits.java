package nestedloops;

public class GettingIndividualDigits {

	public static void main(String[] args) {
		
		int digit1, digit2, div, sum;
		
		for(int i=10;i<100;i++){
			
			digit1=i%10;
			div=i/10;
			digit2=div%10;
			sum=digit1+digit2;
			
			System.out.println(i+", "+digit2+"+"+digit1+"="+sum);
		}

	}

}
