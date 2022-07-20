package arithmetic_calculator;

/*public class Methods {
	
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		Methods b=new Methods();
		int ans= b.multipynumbers(40,5);
		
		System.out.println("Multipilcation is :"+ans);
		}
}*/


	//call by value
public class Methods {

	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		Methods d = new Methods();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}
	}


/*
	//method overloading
	public class overloadMethod {
		
	public void area(int b,int h)
	    {
	         System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int r) 
	    {
	         System.out.println("Area of Circle : "+(3.14*r*r));
	    }

	    public static void main(String args[])
	   {

	overloadMethod obj=new overloadMethod();
	       obj.area(10,12);
	       obj.area(5);  
	   }
	}

}*/
