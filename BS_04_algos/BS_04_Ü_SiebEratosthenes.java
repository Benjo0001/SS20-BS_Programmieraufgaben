import java.util.ArrayList;
public class BS_04_Ü_SiebEratosthenes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Gefundene Primzahlen: "+ SiebAlgo(n));
        System.out.println("\n");
    }

    static int SiebAlgo(int n){
        ArrayList<Integer> primArray = new ArrayList<Integer>();
        primArray.add(2);
        System.out.println("\n");

        for(int i = 3; i <= n; i++){
            if(i%2 == 0){
                // filter all "ungeraden" numbers
                continue;
            }else{
                boolean validPrim = false;
                for(int primNumber : primArray){
                    if(i % primNumber == 0){
                        validPrim = false;
                        break;
                    }else{
                        validPrim = true;
                    }
                }

                if(validPrim){
                    primArray.add(i);
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("\n");
        return primArray.size(); 
    }   
}