// package BS_05_threads.Multithreads;

public class CustomThread extends Thread {
    String name;
    Integer counter;

    CustomThread(String s, Integer counter){
        this.name = s;
        this.counter = counter;
    }


    // method of this Thread
    public void run(){
        System.out.println("Starte Thread: "+ name);

        synchronized(counter){
            for(int i= 0; i <5; i++){
                try {
                    Thread.sleep(100);
                    System.out.println(counter++);
                    
                } catch (InterruptedException e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Beende Thread: "+ name);
    }
}