import java.util.ArrayList;
import java.util.Arrays;

class Mutant {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Es wurde Primzahlen gefunden: "+getPrimes(n).size() );
    }

    public static ArrayList<Integer> getPrimes(int max) {
        boolean[] klaus = new boolean[max + 1];
        ArrayList<Integer> klausis = new ArrayList<>();
        Arrays.fill(klaus, true);
        for (int i = 0; i < klaus.length; i++) {
            if (!klaus[i]){
                // System.out.println("Check 1:  "+i );
                continue;
            }

            if (i == 0 || i == 1) {
                klaus[i] = false;
                // System.out.println("Check 2:  " + i );
                continue;
            }

            klausis.add(i);

            for (int j = 2 * i; j < klaus.length; j += i) {
                klaus[j] = false;
                // System.out.println("Check 3 " +"i:  " + i +" j: "+j );
            }
        }
        return klausis;
    }
}