public class BS_04_Ü_SiebEratosthenes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Gefundene Primzahlen: "+ SiebAlgo(n));
        System.out.println("\n");
    }

    static int SiebAlgo(int n){
        boolean[] numbers = new boolean[n];
        numbers[0] = false;
        numbers[1] = true;

        System.out.println("\n");

        for(int i = 3; i <= n; i++){
            if(i%2 == 0){
                // filter all "ungeraden" numbers
                continue;
            }else{
                if(numerbs[j] == true){
                    numerbs[i] == true
                }
                boolean validPrim = false;
                // for(int primNumber : primArray){
                    
                //     if(primNumber != 0){
                //         if(primArray[i] % primNumber == 0)
                //         validPrim = false;
                //         break;
                //     }else{
                //         validPrim = true;
                //     }
                // }
                for(int j = 0; j < primArray[].length(); j++ ){
                    if(primArray[i] != null){
                            if(primArray[i] % primNumber == 0)
                            validPrim = false;
                            break;
                        }else{
                            validPrim = true;
                        }
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


// if(primArray[i] != null){
//     if(primArray[i] % primNumber == 0)
//     validPrim = false;
//     break;
// }else{
//     validPrim = true;
// }