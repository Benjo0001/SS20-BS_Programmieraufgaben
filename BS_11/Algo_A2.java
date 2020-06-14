public class Algo_A2 {
    public static void main(String[] args) {

        int[] testA = {1,2,3,17,23,4,9,11,4,13, 33, 2};
        
        System.out.println(Algo(testA, 11));
    }

       /**
     Eingabe: k1, k2, ..., kc∈{0, 1, 2, ...}
        a := 0;
        b := 1;
        WHILE b ≤ c DO
        IF kb≥ a THEN
        a := kb;
        d := b;
        END IF;
        b := b + 1;
        END WHILE;
        Ausgabe: d
     */

    // Der Algorithmus geht alle Elemente der Menge kc durch
    // und sucht die (Index-)Stelle, an der das größte Element in der Menge kc steht

    public static int Algo(int[] array, int target){
        int a = 0;
        int b = 0;
        int d = 0;

        while(b<array.length){
            if (array[b] >= a ){
                a = array[b];
                d = b+1;
            }
            b++;
        }
        return d;
    }
 
}