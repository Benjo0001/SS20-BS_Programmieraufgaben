//package BS_06;// package BS_06_synchro;
/**
 Schreiben Sie eine Klasse FileChangeWatcher mit einem Konstruktor FileChangeWatcher(String filename)und implementieren Sie das Interface Runnable.
 Geben Sie in einem Thread im Abstand von jeweils 4,5 Sekunden in einer Endlosschleife den Dateinamen,
 die Dateigröße und den Zeitpunkt der letzten Änderung auf dem Bildschirm aus.
 Überprüfen Sie zusätzlich bei jedem Schleifendurchlauf, ob die Datei seit der letzten Prüfung geändert wurde.
 Geben Sie eine entsprechende Meldung auf dem Bildschirm aus, wenn die Datei geändert wurde.
 Testen Sie Ihr Programm mit der parallelen Überwachung von zwei Dateien.

 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/**
 * @FileChangeWatcher
 *
 * is supposed to be implemented as a Thread that watches a File
 */
//

public class FileChangeWatcher extends Thread {
    String fullFileName;
    FileChangeWatcher(String filename) {
        fullFileName = filename;
    }

    @Override
    public void run() {

        while(true){

            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }

            Path filePath = Paths.get(fullFileName);
            String fileName = filePath.getFileName().toString();
            String fileDirectory = filePath.getParent().toString();
            long fileSize = 0;
            try {
                fileSize = Files.size(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileTime fileModifiedTime = null;
            try {
                fileModifiedTime = Files.getLastModifiedTime(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String format = "%-17s %s \r\n";
            System.out.printf(format, "given file name:", fullFileName);
            System.out.printf(format, "name:", fileName);
            System.out.printf(format, "directory:", fileDirectory);
            System.out.printf(format, "size:", fileSize + " bytes");
            System.out.printf(format, "last modified:", fileModifiedTime);
            System.out.printf("\n\n");
        }
    }
}