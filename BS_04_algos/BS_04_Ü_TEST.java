/**
 * BS_04_Ü_TEST
 */
public class BS_04_Ü_TEST {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        
        // boolean isA = false;
        // if((a/2)*2 == a){
        //     isA = true;
        // }
        // System.out.println("Ergebnis: "+ isA);
        System.out.println("Ergebnis: "+ DoSomething(a));
    }

    static int DoSomething(int n)
    {
    if (n == 1) return n - 1;
    else
    {
    if ((n / 2) * 2 == n) {
    return 1 + DoSomething(n - 1); }
    else
    {
    return DoSomething(n - 1);
    } }
    }
}