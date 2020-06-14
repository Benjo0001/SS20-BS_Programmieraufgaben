/**
 * This is a class about a big common division
 * 
 Schreiben Sie eine Konsolenanwendung zur Bestimmung
 des größten gemeinsamen Teilers zweier vom Nutzer 
 eingegebener Ganzzahlen unter Verwendung des Euklidischen Algorithmus. 
 */
class BS_03_Ü_ggT_v2{

    // 2 variants for ggt algorith
    // our group prefered this one, with recursion
    static int ggT_recu(int a, int b){
        if(b == 0)return a;
        return ggT_recu(b, a%b);
    }

    static int ggT_oldschool(int a, int b){
        int cache;
        while(b!=0){
            cache=a%b;
            a = b;
            b = cache;
        }
        return a;
    }

    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        if(b>a){
            int cache = a;
            a = b;
            b = cache;
        }

        int request = ggT_recu(a, b);
        // check for 
        if(request >1){
            System.out.println("Der GGT ist: " + ggT_recu(a, b));
        }else{
            System.out.println("Es gibt keinen GGT");
        }
    }
}