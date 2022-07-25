package practice1;

import java.util.Scanner;

public class Email_Validation {
	static boolean Validate(String email) {
			String characters = "^[a-z0-9_!#$%&'*+/=?`{|}~^.(-)]+@+gmail.com";
		return email.matches(characters);
}

public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of emails to be validated:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
			System.out.println("Enter the Email Address to validate");
			String email=sc.next();
			System.out.println("\nIs the Email address valid :"+ Validate(email));		
}
}
}