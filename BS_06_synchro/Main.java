import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        // FileChangeWatcher fw_t1 = new FileChangeWatcher("/watchMe.txt");
        FileChangeWatcher fw_t1 = new FileChangeWatcher("/Users/ben/TH_Nextcloud/WI-SE_2/06_BS/SS20-BS_Programmieraufgaben/BS_06_synchro/watchMe.txt");
        fw_t1.start();


    }
}