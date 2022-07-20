package quiz_program;

 // using private access specifiers
class priaccessspecifier 
	{ 
	  private void display() // it only used in the class only
	    { 
	       System.out.println("You are using private access specifier"); 
	    } 
	} 

public class PrivateAccessModifiers {

	public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			priaccessspecifier  obj = new priaccessspecifier(); 
	        //trying to access private method of another class 
	        // obj.display(); //  when un comment this it shows error because we specified method as private so for private accessmodifiers we use that method only inthe specified class

		}
	}

