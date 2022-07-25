package assisted_practice;



/*public class ThreadCreation extends Thread {
	
// using extendig thread class
	 public void run()
 	{
  		System.out.println("Thread1 started running");
  		System.out.println("Thread1 started running");
  		
 	}
	  
 	public static void main( String[] args )
 	{
 		ThreadCreation obj = new  ThreadCreation();
  		obj.start(); // call the run method to execute
  		
 	}

}*/
public class ThreadCreation implements Runnable{
	 
    static int myCount = 0;
    public void run() {
        while(ThreadCreation.myCount <= 15){
            try{
                System.out.println("Expl Thread: "+(++ThreadCreation.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
         	
        ThreadCreation obj = new ThreadCreation();
        Thread t = new Thread(obj);
        t.start();
        while(ThreadCreation.myCount <= 15){
            try{
                System.out.println("Main Thread: "+(++ThreadCreation.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
    }
}