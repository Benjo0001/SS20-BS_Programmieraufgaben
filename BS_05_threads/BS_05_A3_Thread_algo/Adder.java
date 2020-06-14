// package BS_05_threads;

public class Adder implements Runnable {
    public int a = 0;
    public void run() {
        for(int i = 0; i < 1000000; i++) {
            // lese a | addiere +1 | schreibe a
            a = a + 1;
        }
    }public static void main(String[] args) throws Exception {
        Adder value = new Adder();
        Thread t1 = new Thread(value);
        Thread t2 = new Thread(value);
       
        t1.start();
        t2.start();
        t1.join();
        t2.join();
       
        System.out.println("Expected a = 2000000, " +
        " but a = " + value.a);
    }
 }
 