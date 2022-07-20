package arithmetic_calculator;

public class TypeCasting {

	public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting"); // widening (automatically it will convert to other data type)
		char a='C';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=d;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting"); //explicit conversion narrowing we are explicitly specifying to narrow the data type
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
		float f = 4;
		int i = (int)f;
		
		System.out.println("Value of f: "+f);
		System.out.println("Value of i: "+i);
		
		int chr = 67;
		char Z = (char)chr;
		System.out.println("Value of chr: "+chr);
		System.out.println("Value of z: "+ Z);	
	}
}
