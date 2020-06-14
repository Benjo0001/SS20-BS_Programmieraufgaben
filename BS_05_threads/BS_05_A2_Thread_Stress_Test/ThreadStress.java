// package BS_05_threads.BS_05_A2_Thread_Stress_Test;

public class ThreadStress {
    public static void main(String[] args) {

        //FinisherThread f = new FinisherThread(10000); //input of milliseconds to finish

        for (int i = 0; i < 100000000; i++) {
            new CustomThread();
        } 
    }
}