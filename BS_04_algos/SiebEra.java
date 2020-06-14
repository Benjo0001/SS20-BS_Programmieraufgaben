public class SiebEra {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("\n");
        System.out.println("Gefundene Primzahlen: "+ SiebAlgo(n));
        System.out.println("\n");
    }

    static int SiebAlgo(int n){
        boolean[] numbers = new boolean[n+1];
        boolean validPrim = false;
        numbers[0] = false;
        numbers[1] = false;
        numbers[2] = true;
        int c = 1;
        
        System.out.println("\n");
        // int i = 2;
        for(int i = 3; i <= n; i++){
            if(i%2 == 0){
                // filter all "ungeraden" numbers
                continue;
            }else{
                for(int j = 2; j < numbers.length; j++ ){
                    if(i % j == 0){
                        validPrim = false;
                        // break;
                    }else{
                        validPrim = true;    
                    }
                }
                if(validPrim){
                    numbers[i] = true;
                    System.out.print(i + " ");
                    c++;
                    validPrim = false;
                }
            } 

        }
        return c;
    }
}   



// if(numbers[i] != null){
//     if(numbers[i] % primNumber == 0)
//     validPrim = false;
//     break;
// }else{
//     validPrim = true;
// }