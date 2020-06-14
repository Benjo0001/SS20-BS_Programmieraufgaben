/**
 * BS_04_Ü_algo
 */
public class BS_04_Ü_algo {

    static int DoSomething(int n){
        if(n == 1){
            return n-1;
        }else{
            if ((n/2 )*2 == n) {
                return 1 + DoSomething(n-1);
                
            }else{
                return DoSomething(n-1);
            }
        }
    }
    // --> wenn Zahl == 1, gebe 0 zurück
    // --> wenn Zahl gerade ist, teile Durch 2
    // --> wenn Zahl ungerade ist, verringere um eins und teile dann durch 2

    // algo without recursion
    static int DoSomething_2(int n){
        
        if(n == 1){
            return 0;
        }else if(n%2 == 0){
            return n/2;
        }else{
            return (n-1)/2;
        }
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("Ergebnis: "+ DoSomething_2(a));
    }
}