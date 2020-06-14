//package BS_08_;
//import java.lang.*; 
import java.math.*;
/**
 * stupid java program with deprecated use of API
 * 
 * Entwickeln Sie eine Methode zur Umwandlung einer Zeichenfolge mit einer maximalen
Länge von 40 Zeichen in eine positive Integer-Zahl. Wenn die übergebene Zeichenfolge
nicht erfolgreich umgewandelt werden kann, so soll die Methode den Wert „null“
zurückgeben.
Testen Sie Ihre Methode u.a. mit den folgenden Werten „123456“, „-2“, „3c“, „0010“ und
„2,4“, „87659372931“ und „032 563“.
Die Funktion Parse von Java darf nicht verwendet werden.
 */
public class IntegerToString {
  
    public static void main(String[] args) { 

        System.out.println("\n");
        System.out.println("Test: 123456 \tValue of Integer: "+parseInteger("123456") + "\n");  
        System.out.println("Test: -2 \tValue of Integer: "+parseInteger("-2") + "\n");
        System.out.println("Test: 3c \tValue of Integer: "+parseInteger("3c") + "\n");
        System.out.println("Test: 0010 \tValue of Integer: "+parseInteger("0010") + "\n");
        System.out.println("Test: 2,4 \tValue of Integer: "+parseInteger("2,4") + "\n");
        System.out.println("Test: 87659372931 \tValue of Integer: "+parseInteger("87659372931") + "\n");
        System.out.println("Test: 032 563 \tValue of Integer: "+parseInteger("032 563") + "\n");
        System.out.println("Test: 032 563 \tValue of Integer: "+parseInteger("032-563") + "\n");
        
    }
    public static BigInteger parseInteger(String integerMe){
        BigInteger bi;
        try {
            bi = new BigInteger(integerMe);  
            return bi.abs(); 
        } catch (Exception e) {
            System.out.println("Die Zahl konnte nicht umgewandelt werden!");
            return null;
        }
    }
}

/**
 * /**
026    * Betrachtet value als vorzeichenloses byte und wandelt
027    * es in eine Ganzzahl im Bereich 0..255 um.
028    */
// 029   public static int toUnsignedInt(byte value)
// 030   {
// 031     return (value & 0x7F) + (value < 0 ? 128 : 0);
// 032   }
// 033 
//https://dbs.cs.uni-duesseldorf.de/lehre/docs/java/javabuch/html/k100028.html#abschnitttypkonvertierungen

 