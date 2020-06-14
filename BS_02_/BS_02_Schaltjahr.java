/**
 * Ein Jahr dauert nach dem Sonnenkalender etwas mehr als 365 Tage - nämlich 365 Tage, 5 Stunden, 48 Minuten und 45,25 Sekunden. 
 * Das ist knapp ein Viertel Tag länger als die 365 Tage eines normalen Kalenderjahres. 
 * Um den Unterschied auszugleichen, wird alle 4 Jahre ein zusätzlicher Tag (Schalttag) im Kalenderjahr (der 29. Februar) eingefügt.
 *  Da das aber etwas zu viel ist, verzichtet man alle 100 Jahre auf den Schalttag. 
 * Alle 400 Jahre weicht man von dieser Verzichtregel ab und fügt den Schalttag doch ein.
 * Quelle: https://www.inf-schule.de/programmierung/imperativeprogrammierung/konzepteimp/bedingungen/beispiel_schaltjahre
 * 
 * Schaltjahr Regel:
 * Zahl teilbar durch: ( 4  && !100 ) || 400 
 * BS_02_Schaltjahr
 */
public class BS_02_Schaltjahr {
    static boolean isLeapYear(int y){

        if((y % 4 == 0 && y%100 != 0) || y % 400 == 0 ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("\nSchaltjahrprüfer gestartet");

        try {
            if(isLeapYear(Integer.parseInt(args[0])) ){
                System.out.println("Es handelt sich um ein Schaltjahr");
            }else{
                System.out.println("Es handelt sich nicht um ein Schaltjahr");
            }
        } catch (Exception e) {
            System.out.println("Ihre Eingabe konnte nicht verarbeitet werden");
        }
        System.out.print("\n");
    }
}