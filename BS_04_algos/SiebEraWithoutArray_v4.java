public class SiebEraWithoutArray_v4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("\n");
        System.out.println("Gefundene Primzahlen: "+ SiebAlgo(n) +" im Bereich " + n);
        System.out.println("\n");
    }

    static int SiebAlgo(int n){
        int counter = 0;
        int i = 2;
        boolean Prim = true;

        while(i<n){
            if(i%2 !=0 || i == 2){
                for(int j = 2; j < i-1; j++){
                    if(i%j == 0){
                        Prim = false;
                        break;
                    }
                }

                if(Prim){
                    // System.out.println(i);
                    counter++;
                }else{
                    Prim = true;
                }
            }
            i++;
        }
        return counter;
    }
}   



// if(numbers[i] != null){
//     if(numbers[i] % primNumber == 0)
//     validPrim = false;
//     break;
// }else{
//     validPrim = true;
// }