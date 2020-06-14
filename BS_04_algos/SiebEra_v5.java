import java.util.Arrays;

class SiebEra_v5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("\nAnzahl Primzahlen: "+getPrimes(n) +"\n");
    }

    public static int getPrimes(int max) {
        boolean[] primes = new boolean[max + 1];
        Arrays.fill(primes, true);
        int c=0;
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < primes.length; i++) {
            // if already set to false: continue;
            if (!primes[i]){
                continue;
            }
            
            System.out.print(i+" " );
            c++;

            for (int j = 2 * i; j < primes.length; j += i) {
                primes[j] = false;
            }
        }
        return c;
    }
}