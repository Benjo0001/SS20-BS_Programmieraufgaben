// package BS_05_threads.Multithreads;

public class CustomThread extends Thread {

    CustomThread(){
        start();
    }

    // method of this Thread
    public void run(){
        System.out.println("Start: " + Thread.currentThread().getId());
        // try {
        //     // infinite loop
        //     while(true){
        //         Thread.sleep(10);
        //         System.out.println(Thread.currentThread().getId());
        //     }
        // } catch (InterruptedException e) {
        //     //TODO: handle exception
        //     e.printStackTrace();
        // }
        while(true){
            System.out.println(Thread.currentThread().getId());
        }
        // System.out.println("End: "+Thread.currentThread().getId());
    }
}