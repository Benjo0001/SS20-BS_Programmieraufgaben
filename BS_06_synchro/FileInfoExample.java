/**
 Der folgende Quellcode demonstriert Ihnen, wie Sie in Java für eine gegebene Datei, 
 Informationen über den Dateinamen, die Dateigröße und den Zeitpunkt der letzten Änderung abrufen können. 
**/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime; 
public class FileInfoExample {
public static void main(String[] args) throws IOException { // Verweis auf die zu ueberwachende Datei
String fullFileName = "c:\\temp\\elise.txt"; 
} } 
Path filePath = Paths.get(fullFileName); 
String fileName = filePath.getFileName().toString();
String fileDirectory = filePath.getParent().toString();
long fileSize = Files.size(filePath);
FileTime fileModifiedTime = Files.getLastModifiedTime(filePath); 
String format = "%-17s %s \r\n";
System.out.printf(format, "given file name:", fullFileName); 
System.out.printf(format, "name:", fileName);
System.out.printf(format, "directory:", fileDirectory); 
System.out.printf(format, "size:", fileSize + " bytes"); 
System.out.printf(format, "last modified:", fileModifiedTime); 
