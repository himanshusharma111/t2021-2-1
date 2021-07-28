package First_Screening_t2021_2_1;

import java.util.Scanner;

public class Problem1 {

	public double addition(double firstDigit, double secondDigit) {
		double value = firstDigit + secondDigit;	
		return value;
	}

	public double subtraction(double firstDigit, double secondDigit) {
		double value = firstDigit - secondDigit;	
		return value;
	}

	public double multiplication(double firstDigit, double secondDigit) {
		double value = firstDigit * secondDigit;	
		return value;
	}

	public double divide(double firstDigit, double secondDigit) {
		double value = firstDigit / secondDigit;	
		return value;
	}

	public static void main(String[] args) {
	
		double firstDigit;
		double secondDigit;
		String operation;
		Problem1 p1 = new Problem1();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first digit : ");
		firstDigit = sc.nextDouble();

		System.out.println("Enter the opration you want to perform (+,-,*,/) : ");
		operation = sc.next();
		operation = operation.trim();
		
		System.out.println("Enter the second digit : ");
		secondDigit = sc.nextDouble();


		switch (operation) {
		case "+":
			double res = p1.addition(firstDigit, secondDigit);
			System.out.println(res);
			break;
			
		case "-":
			double result = p1.subtraction(firstDigit, secondDigit);
			System.out.println(result);
			break;
			
		case "*":
			double result1 = p1.multiplication(firstDigit, secondDigit);
			System.out.println(result1);
			break;
			
		case "/":
			double result11 = p1.divide(firstDigit, secondDigit);
			System.out.println(result11);
			break;
		
		default:
			System.out.println("Please enter correct operation");
			break;
		}	
	}
}
