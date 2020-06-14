// package BS_08_;

/**
 * BankNumberCheck
 Aufgabe 2:
Die folgende Formel wird z.B. von Banken und Kreditkartenfirmen verwendet, um die
Gültigkeit von Kundennummern zu überprüfen:
(d0 + f(d1) + d2 + f(d3) + d4 + f(d5) + d6 + ... ) mod 10 = 0
Die Werte di stehen dabei für einzelnen Ziffern der Kundennummer und f(d) ist die
Quersumme der Ziffern des Ergebnisses von 2*d. Zum Beispiel ist f(7)=5 weil 2*7=14
und 1+4=5 ist. Daher ist die Kundennummer 17327 gültig, weil 1+5+3+4+7=20 und ein
Vielfaches von 10 ist. Implementieren Sie die Funktion f(d) und eine Methode zur
Überprüfung einer Kundennummer. Schreiben Sie ein Programm welches eine
Ganzzahl aus 10 Ziffern als Kommandozeilen-Parameter übergeben bekommt und eine
gültige Kundennummer mit 11 Ziffern auf dem Bildschirm ausgibt. Die ersten 10 Ziffern
sind dabei die übergebene Ganzzahl und die letzte Ziffer ist die Checksumme, um aus
dieser Zahl eine gültige Kundennummer zu machen.
Welche Kundennummer erhalten Sie für die Ganzzahl 3524573248?
3524573247
 */
public class BankNumberCheck {
    public static void main(String[] args) {
        String test1 = "17327";
        System.out.println("Überprüfung der GANZZAHL: "+ test1);
        System.out.println("Für die Nummer existiert " + ( ((Integer.parseInt(checkSumForNumber(test1))%10) == 0) ? "eine korrekt" : "keine korrekte") + " Checksumme: "+checkSumForNumber("17327"));
            
        String test2 = "3524573248";
        System.out.println("\n\nErstelle die Kundennummer für Ganzzahl: "+test2);
        System.out.println("Kundennummer: " + createCustomerNumber(test2) );
    }
    // Kundennummer erstellen aus der übergebenen Ganzzahl
    public static String createCustomerNumber(String gz){
        if(Integer.parseInt(checkSumForNumber(gz))%10 == 0){
            return gz + checkSumForNumber(gz).substring(0, 1);  //nehme von der Checksum nur die 10 Stelle Bsp. die 4 von 40
        }else{
            System.out.println("Es wurde eine nicht valide Ganzzahl für die Kundennummer übergeben, die Kundennummer wurde nicht erstellt");
            return "0";
        }
    }
    // Hilfsfunktion: bilde die Checksumme aus einer Ganzzahl
    public static String checkSumForNumber(String gz ){
        int result = 0;
        for(int i= 0; i < gz.length(); i++){
            if((i)%2 == 0)
                result = result + Character.getNumericValue(gz.charAt(i));
            else
                result = result + f(Character.getNumericValue(gz.charAt(i)));
        }
        return Integer.toString(result);
    }
    // Prüfe die Banknummer auf Richtigkeit
    public static boolean checkBankNumber(String bn){
        String subBN = bn.substring(0, bn.length()-1);  
        String checkSum = checkSumForNumber(subBN);

        if(checkSum.equals(bn.substring(bn.length()-1)))
            if(bn.length()==11)
                return true;
            else
                System.out.println("Die von Ihnen eingegebene Banknummer hat nicht die richtige Länge von 11 Stellen");
        return false;
    }
    // bilde Quersumme aus (int)(2*d)
    public static int f(int d){
        return ((d*2)/10) + (d*2)%10;
    }
}