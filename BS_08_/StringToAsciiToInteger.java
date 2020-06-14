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
public class StringToAsciiToInteger {
  
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
    public static Integer parseInteger(String integerMe){
        int result = 0;
        // CHARACTER to ASCII CODE
        // 0 == 48
        // 1 == 49
        // 2 == 50
        // 3 == 51
        // 4 == 52
        // 5 == 53
        // 6 == 54
        // 7 == 55
        // 8 == 56
        // 9 == 57
        // : == 58
        for (int i = 0; i < integerMe.length(); i++) {
            if(result>214748364){
                System.out.println("Warnung! Integer Wert wurde überschritten mit Eingabe: "+integerMe);
            }
            if((int)integerMe.charAt(i)>=48 && (int)integerMe.charAt(i)<=57){
                result*=10;
                result+= (int)integerMe.charAt(i)-(int)('0');
            }else{
                return null;
            }
        }
        return result;
    }
}


 