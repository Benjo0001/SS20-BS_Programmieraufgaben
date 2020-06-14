package BS_05_threads.Bsp1;

public class DateCommand implements Runnable
{
  @Override public void run()
  {
    for ( int i = 0; i < 20; i++ )
      System.out.println( new java.util.Date() );
  }
}