//package BS-10;

/**
 * ALgorithmus aus Aufgabe 3
BEGIN
Eingabe: k1, ..., kn, k;
found := FALSE;
WHILE NOT found AND „nicht alle Elemente betrachtet“ DO
„nimm nächstes Element ki“;
found := (ki = k)
END (* WHILE *);
IF found THEN
Ausgabe: i
ELSE
Ausgabe: n + 1
END (* IF *)
END
 */

// Aufgabe 4:
// Füllen Sie ein Feld mit den Zahlen von 0 bis 1.000.000 in aufsteigender Reihenfolge.
// Wenden Sie nachfolgend den Algorithmus aus Aufgabe 3 mit einer Zufallszahl zwischen 0 und
// 1.000.000 als Wert der Variablen k an.
// Wiederholen Sie dies mit neuen Zufallszahlen jeweils 1.000, 10.000, 100.000, 500.000, 1 Million
// und 10 Millionen Mal. Messen Sie dabei die jeweils für alle Wiederholungen benötigte
// Gesamtzeit in Millisekunden. (Passen Sie die Anzahl der Wiederholungen ggf. auf ein Ihrer
// Hardware entsprechendes Maß an.)
// Vergleichen Sie die erzielten Werte mittels einer Tabellenkalkulation tabellarisch und in einem
// Diagramm. Welchen Verlauf können Sie beobachten? Warum?
// Die Zeit können Sie in Java u.a. wie folgt messen:
// long startTime = System.currentTimeMillis();
// // do something that takes some time
// long stopTime = System.currentTimeMillis();
// // calculate the elapsed milliseconds
// long elapsedTime = stopTime - startTime;

// 1) Erstellen Sie ein Array mit 1 Mio Zahlen und füllen Sie es mit Zufallszahlen. (nur einmal am Anfang ((noch keine Zeitmessung))
// 2) 2. For-Schleife, welche x-mal durch läuft (1000, 10.000, 100.000 … ) durchläuft und nach einer vorher erstellten Zufallszahl sucht in dem Array -> wichtig: es soll genau der Algorithmus aus Aufgabe 3 genutzt werden
// 3) Ausgabe der Durchlaufzeit
// 4) Diagramm (Excel oder Python) dazu erstellen 
//import static java.lang.Math.*;

public class RdmNumAlgo_v2 {
   public static void main(String[] args) {
    int n;

    // 1) Erstellen Sie ein Array mit 1 Mio Zahlen und füllen Sie es mit Zufallszahlen. (nur einmal am Anfang ((noch keine Zeitmessung))
    int[] oneMioRndArray = new int[1000000];

    for (int i = 0; i < oneMioRndArray.length; i++) {
        oneMioRndArray[i] = (int)(Math.random() * ((1000000) + 1));
        // System.out.printf("%7d | ", oneMioRndArray[i]);
        // if(i%10==0){
        //     System.out.println();
        // }
    }
    
    // 2) 2. For-Schleife, welche x-mal durch läuft (1000, 10.000, 100.000 … ) durchläuft und nach einer vorher erstellten Zufallszahl sucht in dem Array -> wichtig: es soll genau der Algorithmus aus Aufgabe 3 genutzt werden
    
    // Laufzeit mit Ausgabe aller Werte
    // long elapsedTime_1 =runNTIMES(1000, oneMioRndArray);
    // long elapsedTime_2 =runNTIMES(10000, oneMioRndArray);
    // long elapsedTime_3 =runNTIMES(100000, oneMioRndArray);
    // //long elapsedTime_4 =runNTIMES(1000000, oneMioRndArray);
    // System.out.println("\nFür "+1000+" Durchläufe wurden "+ elapsedTime_1 + " ms gebraucht.");
    // System.out.println("Für "+10000+" Durchläufe wurden "+ elapsedTime_2 + " ms gebraucht.");
    // System.out.println("Für "+100000+" Durchläufe wurden "+ elapsedTime_3 + " ms gebraucht.");
    //System.out.println("Für "+1000000+" Durchläufe wurden "+ elapsedTime_4 + " ms gebraucht.");


    // Test durchlaufzeit ohne print Ausgabe jedes Durchlaufes
    long elapsedTime_1 =runNTIMES_withOutPrint(1000, oneMioRndArray);
    System.out.println("\nFür "+1000+" Durchläufe wurden "+ elapsedTime_1 + " ms gebraucht.");

    long elapsedTime_2 =runNTIMES_withOutPrint(10000, oneMioRndArray);
    System.out.println("Für "+10000+" Durchläufe wurden "+ elapsedTime_2 + " ms gebraucht.");
    
    long elapsedTime_3 =runNTIMES_withOutPrint(100000, oneMioRndArray); 
    System.out.println("Für "+100000+" Durchläufe wurden "+ elapsedTime_3 + " ms gebraucht.");
    
    long elapsedTime_4 =runNTIMES_withOutPrint(1000000, oneMioRndArray);
    System.out.println("Für "+1000000+" Durchläufe wurden "+ elapsedTime_4 + " ms gebraucht.");
    
    
    // count founds
    // System.out.println("Für "+1000+" Durchläufe wurden "+ runNTIMES_withFoundCount(1000, oneMioRndArray) + " ms gebraucht.");
    // System.out.println("Für "+10000+" Durchläufe wurden "+ runNTIMES_withFoundCount(10000, oneMioRndArray) + " ms gebraucht.");
    
   } 

   public static int runSearchAlgo(int[] oneMioRndArray, int k) {
        int i=0;
        while (i<oneMioRndArray.length) {
            if(oneMioRndArray[i]==k){
                return i;
            }
            i++;
        }
        // gebe die Länge des der Überprüften kn zurück, falls kein k gefunden wurde
        return oneMioRndArray.length+1;
   }

   public static int runSearchAlgo_slow(int[] oneMioRndArray, int k) {
    boolean found = false;
    int i=0;
    while (i<oneMioRndArray.length && found == false) {
        if(oneMioRndArray[i]==k){
            found = true;
        }
        i++;
    }
    if(found){
        return i;
    }else{
        // gebe die Länge des der Überprüften kn zurück, falls kein k gefunden wurde
        return oneMioRndArray.length+1;
    }
}

   public static boolean runSearchAlgo_foundCount(int[] oneMioRndArray, int k) {
        boolean found = false;
        int i=0;
        while (i<oneMioRndArray.length) {
            if(oneMioRndArray[i]== k){
                found = true;
                if(found)
                    return true;
            }
            i++;
        }
        return false;
    }

   public static long runNTIMES(int nTimes, int[] oneMioRndArray){
        int rnd;
        long startTime = System.currentTimeMillis();
            for (int i = 0; i < nTimes; i++) {
            rnd = (int)(Math.random() * ((1000000) + 1));
            System.out.printf("%7d | ", runSearchAlgo_slow(oneMioRndArray, rnd ));
            if(i%10==0){
                System.out.println();
            }
        }
        long stopTime = System.currentTimeMillis();
        
        // calculate the elapsed milliseconds
        long elapsedTime = stopTime - startTime;
        return elapsedTime;
   }


   public static long runNTIMES_withOutPrint(int nTimes, int[] oneMioRndArray){
        int rnd;
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < nTimes; i++) {
            rnd = (int)(Math.random() * ((1000000) + 1));
            runSearchAlgo_slow(oneMioRndArray, rnd);
        }
        long stopTime = System.currentTimeMillis();
        
        // calculate the elapsed milliseconds
        long elapsedTime = stopTime - startTime;
        return elapsedTime;
    }


    public static long runNTIMES_withFoundCount(int nTimes, int[] oneMioRndArray){
        int rnd;
        int counter = 0;
        long startTime = System.currentTimeMillis();
 
        for (int i = 0; i < nTimes; i++) {
            rnd = (int)(Math.random() * ((1000000) + 1));
            // runSearchAlgo_slow(oneMioRndArray, rnd);
            if(runSearchAlgo_foundCount(oneMioRndArray, ((int)(Math.random() * ((1000000) + 1)))) == true){
                counter++;
            }
        }
        System.out.println("\nEs wurden " + counter+" mal ein Wert gefunden von "+nTimes+" Durchläufen");
        long stopTime = System.currentTimeMillis();
        
        // calculate the elapsed milliseconds
        long elapsedTime = stopTime - startTime;
    
        return elapsedTime;
    }
}