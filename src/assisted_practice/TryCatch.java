package assisted_practice;

public class TryCatch {
	
	    public static void main(String args[]) 
	    {
	        int[][] array = new int[3][3];
	        try 
	        {
	            array[4][4] = 3;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	       
	        
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	      
	        }
	    }
	}
