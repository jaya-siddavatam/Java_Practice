package quiz_program;

/*import arithmetic_calculator.AccessModifiers.*;

public class Quiz_Programe {
	public static void main(String[] arg) {
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();
	}
}
*/
import arithmetic_calculator.*;

public class Quiz_Programe extends ProtectedAccessModifiers{

	public static void main(String[] args) {
		Quiz_Programe obj = new Quiz_Programe();   
		       obj.display(); // we can access this protected class in another pacakage by extending the protected class in another package  
		}

	}
