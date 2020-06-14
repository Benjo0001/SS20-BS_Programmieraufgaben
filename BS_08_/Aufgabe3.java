package BS_08_;

public class Aufgabe3 {
    /**
     * nur boolean'sche Logic erstellen
     * 
     * Formulieren Sie die logische Bedingung für die Suche nach einem Fahrzeug mit folgenden Voraussetzungen:
     *  Gesucht wird eine Limousine in den Farben Rot oder Grün oder alternativ
     *  dazu ein Van in Blau oder Schwarz (in dieser Farbe aber nur mit Klimaanlage)
     *  oder egal welche Bauform Hauptsache in Weiß.

        Ihnen stehen folgende Boolesche Variablen zur Verfügung: CAR (für Limousine), VAN, RED, GREEN, BLUE, BLACK, WHITE, AC (für Klimaanlage)

     */
    public static boolean Test(){
        boolean CAR, VAN, RED, GREEN, BLUE, BLACK, WHITE, AC;
        if( (CAR  && (RED  || GREEN )) || (VAN && (BLUE || (BLACK && AC) )) || ((CAR || VAN) && WHITE) ){
            return true;
        }else{
            return false;
        }
    }

}