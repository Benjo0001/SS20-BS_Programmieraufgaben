public class ThreadsTest
{
 public static void main(String[] args)
 {
     for(int i = 0; i<=100; i++){
 
    
   Runnable r1 = new Threads();
   new Thread(r1).start();
}
  
 
   
 }
}
