package assisted_practice;

class ExceptionHandling extends Exception{
		   String str1;
		   ExceptionHandling(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			   
			return ("Exception Occurred: "+str1) ;
		   }

public static class MYHandling {
	public static void main(String[] args){
		
			try{
				System.out.println("Starting of try block");
				                                                     
				
				throw new ExceptionHandling("This is the error Message");// explicitly throwing an error
			}
			catch(ExceptionHandling e){
				System.out.println(" \n printed in Catch Block") ;
				System.out.println(e) ;
			}
		}


}
}
