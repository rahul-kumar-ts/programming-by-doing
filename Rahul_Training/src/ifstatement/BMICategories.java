package ifstatement;

import java.util.Scanner;

public class BMICategories {

	public static void main(String[] args) {
		
		double weight, height;
		double bmi=0;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Enter you height in meters: ");
		height=keyboard.nextDouble();
		
		System.out.print("Enter you weight in kgs: ");
		weight=keyboard.nextDouble();
		
		bmi=weight/height;
		
		System.out.println("Your BMI is: "+bmi);
		if(bmi<18.5)
			System.out.println("BMI category: Underweight");
		
		if(bmi>=18.5 && bmi<=24.9)
			System.out.println("BMI category: Normal Weight");
		
		if(bmi>=25 && bmi<=29.9)
			System.out.println("BMI category: Overweight");
		
		if(bmi>=30)
			System.out.println("BMI category: Obese");
		
	}

}
