// package BS_05_threads.Multithreads;

// https://www.youtube.com/watch?v=q-pUT_XOdro&list=PLNmsVeXQZj7oirQMpjPjrmNx4vcVIGIGY&index=3

public class Main {
    public static void main(String[] args) {
        Integer counter = 0;

        CustomThread t1 = new CustomThread("erster Fred", counter);
        CustomThread t2 = new CustomThread("zweiter Fred", counter);

        t1.start();
        t2.start();
        
        System.out.println("Main CustomThreads test");

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("Programm Ende");

    }
}