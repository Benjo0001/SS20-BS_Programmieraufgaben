//package BS_09;
/**
Aufgabe 3:
Entwickeln Sie einen Algorithmus, um die folgende Aufgabe zu lösen!
Bei TV-Geräten hat vor einiger Zeit ein Formatwechsel stattgefunden. Alte TV-Geräte hatten
eine Bildröhre mit dem Format 4:3. Die neuen Flachbildschirme verwenden in der Regel das
Format 16:9. Wie groß muss die Bildschirmdiagonale eines neuen TV-Gerätes sein, um die
gleiche Bildschirmhöhe eines alten Röhrenfernsehers mit der eingegebenen
Bildschirmdiagonale zu erreichen?
Testen Sie Ihre Lösung anhand eines Konsolenprogramms, in welchem der Benutzer beliebige
alte Bildschirmdiagonalen (in Zentimetern; Beispiel „51cm“) eingeben kann.
 */

import java.lang.Math;

public class ScreenSizeCalc_clean {

    public static double calculateScreenSize169(double c_43){
        final double alpha_43, alpha_169, c_169, a;
        alpha_43 = Math.atan( (3.0/4.0) );
        alpha_169 =Math.atan( (9.0/16.0) );

        a = Math.sin(alpha_43) * c_43;
        System.out.println("Höhe des Bildschirm-Bildes:  " + a);
        
        return a / Math.sin( alpha_169);
    }

    
    public static void outputScreenSize(String s){
        double c_43;
        try {
            c_43 = Double.parseDouble(s); 
        } catch (Exception e) {
            System.out.println("Falsche Eingabe Bildschirmdiagonale");
            return;
        }
        System.out.println("Bildschirmdiagonale von 4:3 -> " +c_43 +"cm auf einen 16:9 -> "+( Math.round(calculateScreenSize169(c_43) *100.0)/100.0 ) +"cm");      
    }
   public static void main(String[] args) {

    System.out.println("\nScreensizeCalculator");
    System.out.println("\nScreensizeCalculator");
    if(args.length >0){
        outputScreenSize(args[0]);
    }else{
        System.out.println("Kein Übergabe");
    } 
    
    System.out.println("\n");
}
}