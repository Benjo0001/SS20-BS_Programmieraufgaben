/*
 * BS_03_A3_euklidAlgo
 * 
 * https://www.lernhelfer.de/schuelerlexikon/mathematik/artikel/euklidischer-algorithmus#
 * 
 * 
Man teilt die größere durch die kleinere Zahl.
Geht die Division auf, ist der Divisor der ggT.
Geht die Division nicht auf, bleibt ein Rest. Dieser Rest ist der neue Divisor. Der alte Divisor wird zum Dividenden. Nun setzt man das Verfahren fort.
Nach endlich vielen Schritten erhält man den ggT.
In manchen Fällen ist dies die Zahl 1, dann sind die Ausgangszahlen teilerfremd.
 */
public class BS_03_A3_ggT {

    static int ggTAlgo(int a, int b){
        // if no GGT function returns 0
        int ggT;
        int cache;

        //sort numbers & check if equal
        if(b>a){
            cache = a;
            a = b;
            b = cache;
        }else if(a == b){
            return a;
        }

        cache =0;
        //euklid algorithm
        if(b!=1){
            ggT = b;
            cache++;
            System.out.println("cache"+cache);
            while (b != 1 ){
                if(a % ggT == 0){
                    return ggT; //hier kommt 1 raus
                }else{
                    System.out.println("cache"+cache);
                    a = a/ggT;
                    System.out.println("cache"+cache);
                    ggT = a%ggT;
                    System.out.println("cache"+cache);
                }
            }
            return 0; 
        }else{
            // if input is 1 you get 1
            return 1;
        }
    }

    static int ggTAlgo_2(int a, int b){
        if(b == 0){
            return a;
        }
        return ggTAlgo_2(b, a%b);
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int ggT = ggTAlgo_2(a, b);


        if(ggT != 0 && ggT != 1){
            System.out.println("Der ggT ist: " + ggT);
        }else if (ggT == 1){
            System.out.println("Der ggT ist 1 da Sie 1 übergeben haben");
        }else{
            System.out.println("Es gibt keinen ggT");
        }   
    }
    
}