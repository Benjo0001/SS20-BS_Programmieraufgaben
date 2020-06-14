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

public class DateShifter_v2
 {
    public static void main(String[] args) {
        ShiftIt(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
    }

    public static int getDaysOfMonth2(int month){
        switch (month) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
            return 0;
        }
    }

    public static int getAllDayOfYear(int m){
        int sum = 0;
        while(m>0){
            sum = sum + getDaysOfMonth2(m); 
            m--;
        }
        return sum;
    }

    public static int[] getDateOfTimeStamp(int timeStamp){
        int[] dateArray= new int[3];
        dateArray[0] = 1; // year
        dateArray[1] = 1; // month
        dateArray[2] = 0; // day

        while(timeStamp > 365){
            timeStamp -= 365;
            dateArray[0]++;
        }

        for (int i = 1; i <= 12; i++) {
            if(getDaysOfMonth2(i) >= timeStamp){
                dateArray[2] = timeStamp;
                break;
            }
            else{
                timeStamp -= getDaysOfMonth2(i);
                dateArray[1]++;
            }  
        }
        return dateArray;
    }

    public static void ShiftIt(int year, int month, int day, int shiftDays){
    
        //create timeStamp
        int timeStamp = (year-1) * 365 + getAllDayOfYear(month-1)+ day;
        // System.out.println("TimeStamp: "+timeStamp);

        timeStamp = timeStamp + shiftDays;

        int[] newDate = getDateOfTimeStamp(timeStamp);

        // output
        if(shiftDays > 1000)
            System.out.println("Lieber Anwender sie dürfen nur Werte bis 1000 eingeben, die Anwendung funktioniert trotzdem");
        System.out.println("Ihr Datum: " +year+ "-"+month+"-"+day 
        + " wurde geschoben um "+ shiftDays + " Tage verschoben");
        System.out.println("generiertes Datum: "+ newDate[0]+"-"+newDate[1]+"-"+newDate[2]);
        System.out.println("\n");
        System.out.println("Test");

    }
}


