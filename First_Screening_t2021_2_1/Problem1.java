/* Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string */

package First_Screening_t2021_2_1;

import java.util.Scanner;
public class Problem1 {

	public void addition(double a,String addition, double b){
		
		if(addition.equals("+"))
		{
		 double value = a+b ;
		 System.out.println(value);
		}

	}
	public void subtraction(double a, String subtraction, double b) {
		if(subtraction.equals("-"))
		{
		 double value = a-b;
		 System.out.println(value);
		} 
	}
	public void multiplication(double a, String multiplication, double b) {
		if(multiplication.equals("*"))
		{
		 double value = a*b ;
		 System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		
	
		int value = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the first digit : "); 
		double a  = sc.nextDouble(); 
	
		System.out.println("Enter the opration you want to perform (+,-,*) : "); 
		String operation = sc.next(); 
		
		System.out.println("Enter the second digit : ");
		double b  = sc.nextDouble(); 
		
		
		Problem1 p1 = new Problem1();
		
		if (operation.equals("+")) {
			p1.addition(a, operation, b);
		}
		else if (operation.equals("-")) {
			p1.subtraction(a, operation, b);
		}
		else if (operation.equals("*")){
			p1.multiplication(a, operation, b);
		}
		else 
		{
			System.out.println("Please enter the valid operation from given list of three operators (+,-,*) ... :)");
		}
	}

}
