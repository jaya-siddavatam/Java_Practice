package arithmetic_calculator;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		int number1 ;
		int number2;
	    double sum , mul,div,sub ;
	    char A ;                 // Declaring variables
		System.out.println("Enter the values to perform operation ");
		
		Scanner obj = new Scanner(System.in); // taking numbers from user to perform operation
		number1 = obj.nextInt(); 
		System.out.println("The 1st value you entered is " +number1 );
		System.out.println("Enter the another value to perform operation ");
		number2 = obj.nextInt();
		System.out.println("The 2st value you entered is " +number2  );
		
		System.out.println("Choose an operator + , - , * ,/ "  ); //user chooses the operator
		A = obj.next().charAt(0);

		if(A == '+') {                                           //checking the condition 
		
		sum = number1 + number2;
		System.out.println("\nThe addition of two numbers is " + sum );
		}
		else if(A == '*') {
		mul = number1*number2;
		System.out.println("\nmultiplication of two numbers is " + mul );
		}
		else if(A == '/') {
		
		div = number1/ number2;
		System.out.println("\nThe division of two numbers is " + div);
		}
		
		else if(A == '-') {
		sub = number1-number2;
		System.out.println("\nThe subtraction of two numers  is " + sub );
		}
		else {
			System.out.println("enter the correct operator");	 // if user input other than given operators
		}
		 
	}
	
}
