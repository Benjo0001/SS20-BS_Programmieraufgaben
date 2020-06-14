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

public class ScreenSizeCalc {

    public static double calculateScreenSize169(double c_43){
        // Höhe = a, Breite b
        /**
         Vorgehen:
            gegeben: 
            c, Verhältnis ( a zu b ) -> alpha_43 und beta

                1. Formel: tan alpha_43 = Gegenkathete / Ankatete 
                    -> nach alpha_43 umstellen
                    -> Wir erhalten Alpha

                2. Formel: cos alpha_43 = Ankathete / Hypotenuse
                    -> nach Ankathete (b) umstellen
                    -> wir erhalten b

                3. Satz des Pythagoras oder Sinussatz anwenden
                -> um a zu bestimmen
                • a^2 + b^2 = c^2 umstellen 
         */
        final double alpha_43, alpha_169;
        double c_169;
        double a;
        // not necessary ((IMPORTANT STEPT: converting values to degree)) 
        // alpha_43 = Math.toDegrees(Math.atan( ((double)3.0/4.0) ));
        // alpha_169 = Math.toDegrees(Math.atan( ((double)9.0/16.0) ));

        // ATTENTION if using opertions: don't forget the .0 if calculation with double
        // otherwise it will be automatically a int operation
        alpha_43 = Math.atan( (3.0/4.0) );
        // or like
        alpha_169 =Math.atan( ((double)9/16) );

        // not necessary ((IMPORTANT STEPT: converting values to radians before using sin)) 
        // a = Math.sin(Math.toRadians(alpha_43)) * c_43;
        a = Math.sin(alpha_43) * c_43;
        System.out.println("Höhe des Bildschirm-Bilds:  " + a);

        // c_169 = a / Math.sin( Math.toRadians(alpha_169));
        c_169 = a / Math.sin( alpha_169);
        
        return c_169;
    }

    
    public static void outputScreenSize(String s){
        double c_43;
        try {
            c_43 = Double.parseDouble(s); 
        } catch (Exception e) {
            System.out.println("Falsche Eingabe Bildschirmdiagonale");
            return;
        }

        System.out.println("Bildschirmdiagonale von 4:3 -> " +c_43 +"cm auf einen 16:9 -> "+( Math.round(calculateScreenSize169(c_43) *100.0)/100.0 ));
        
       
    }
   public static void main(String[] args) {

    /** 
    IMPORTANT JAVA API 
    https://docs.oracle.com/javase/6/docs/api/java/lang/Math.html#atan(double)

    Math.toRadians ->  Math.tan 
    Math.atan --> Math.toDegrees
     */
    System.out.println("\nScreensizeCalculator");
    System.out.println("\nScreensizeCalculator");
    if(args.length >0){
        outputScreenSize(args[0]);
    }else{
        System.out.println("Kein Übergabe");
    } 

    
    // System.out.println(Math.toDegrees(Math.atan(16/9)));
    // System.out.println(""+Math.atan(30));
    // System.out.println(Math.atan(45));
    // System.out.println( Math.toDegrees( Math.atan( ((double)3/4 ) )));
    // System.out.println( Math.atan( ((double)3/4 ) ));
    // System.out.println( Math.sin(0.6435011087932844));
    //System.out.println(Math.atan(1));
    // System.out.println(Math.toRadians(10));
    // System.out.println(Math.toRadians(1));
    // IMPORTANT STEPT: converting values to radians  (Math.toRadians(x))
    //System.out.println(Math.tan(Math.toRadians(30)));
    System.out.println("\n");
}
}