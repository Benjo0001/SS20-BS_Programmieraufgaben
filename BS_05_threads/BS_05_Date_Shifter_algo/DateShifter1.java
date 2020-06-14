/**
 * Aufgabe 4: Schreiben Sie eine Methode, welche vier ganzzahlige Parameter für
 * die Werte Jahr, Monat, Tag und Differenz übergeben bekommt und das durch die
 * Einzelwerte festgelegte Datum anhand der Differenz verschiebt. Eine
 * Bildschirmausgabe des Ergebnisses ist hinreichend. Überprüfen Sie des
 * Weiteren, ob die Parameterwerte ein gültiges Datum beschreiben. Der Betrag
 * der Differenz darf maximal 1000 (Tage) betragen. Beispiele:
 * VerschiebeDatum(2011,5,1, 2) hat das Ergebnis 03.05.2011
 * VerschiebeDatum(2011,4,10, -12) hat das Ergebnis 29.03.2011
 * VerschiebeDatum(2010,12,24, 20) hat das Ergebnis 13.01.2011
 * VerschiebeDatum(2012,2,20, 10) hat das Ergebnis 01.03.2012 Die entsprechenden
 * Funktionen der Klassenbibliothek von Java (z.B. „plusDays(1)“) dürfen nur zur
 * eigenen Kontrolle verwendet werden
 */

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateShifter1
 {
    public static void main(String[] args) {
        ShiftIt(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Long.parseLong(args[3]));
    }

    public static void ShiftIt(int year, int month, int day, long shiftDays){
        // LocalDate t = LocalDate.now();
        LocalDate myDate = LocalDate.of(year,month,day);
        
        //operation
        long dateUtcStamp = myDate.toEpochDay() - shiftDays;
        LocalDate shiftedDate = LocalDate.ofEpochDay(dateUtcStamp);

        System.out.println();
        System.out.println("Ihr Datum: " + myDate.toString() 
        + " wurde convertiert um "+ shiftDays + " Tage verschoben");
        System.out.println("generiertes Datum: "+ shiftedDate.toString());
        // System.out.println(today.toString() + " today "+ today.toEpochDay());
        System.out.println("\n");
        
    }
}


