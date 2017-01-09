package functions;

import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {
		
		int side1, side2,side3;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Enter the 3 side of the triangle: ");
		side1=keyboard.nextInt();side2=keyboard.nextInt();side3=keyboard.nextInt();
		System.out.println("The area of triangle with sides "+side1+","+side2+","+side3+" is "+AreaOfTriangle(side1,side2,side3));
		
	}
	
	public static double AreaOfTriangle(int side1, int side2, int side3){
		double s, area;;
		s=(side1+side2+side3)/2.0;
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}

}
