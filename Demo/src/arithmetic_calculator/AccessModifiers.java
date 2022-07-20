package arithmetic_calculator;

class defAccessSpecifier  // Class is having Default access modifier
{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

public class AccessModifiers {

		public static void main(String[] args) {
			System.out.println("Dafault Access Specifier");
			defAccessSpecifier obj = new defAccessSpecifier(); 
			// default access modifier is nothing but we can use this 
			 //type of class methods or variables can be accessed in the specific package only  	        
			obj.display();       

		}
	}

