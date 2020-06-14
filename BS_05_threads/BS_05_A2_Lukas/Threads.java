public class Threads implements Runnable
{
 public void run()
 {
   for (int i = 0; i<=100; i++)
    {
        Thread t=Thread.currentThread();
       System.out.println("Name = " + t.getName());
       System.out.println("Id = " + t.getId());
       System.out.println("Priorität = " + t.getPriority());
       System.out.println("Zustand = " + t.getState());
   }
 }
}
