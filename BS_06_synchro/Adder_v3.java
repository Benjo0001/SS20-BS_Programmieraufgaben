// package BS_05_threads;

public class Adder_v3 implements Runnable {
    public Integer a = 0;

    Adder_v3(Integer a){
        this.a = a;
    }

    public void run() {
        synchronized(a){

        
        for(int i = 0; i < 1000000; i++) {
            // lese a | addiere +1 | schreibe a
            a = a + 1;
        }}
    }public static void main(String[] args) throws Exception {
        Integer a = 0;
        Adder_v3 value = new Adder_v3(a);
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
 