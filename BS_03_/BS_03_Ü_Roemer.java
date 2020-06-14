/**
 * This is a class about Römer & numbers..
Schreiben Sie einen Algorithmus der für eine als Text eingegebene römische Zahl (kleiner gleich MCMXCIX, mit Substraktionsregel)
 die korrespondierende Dezimalzahl ermittelt. 
Sie können davon ausgehen, dass die eingegebene römische Zahl syntaktisch korrekt ist. 

 */
class BS_03_Ü_Roemer {
    static int convertThisRoemer(String rom){
        char[] romChar;
        romChar = rom.toCharArray();
        int n1 = 0;
        int n2 = 0;
        int result = 0;
        int j;
        int i = 0;

        for (j = 0; j < romChar.length; j++) {
            if (romChar[j] == 'I') {
                n2 = 1;
            } else if (romChar[j] == 'V') {
                n2 = 5;
            } else if (romChar[j] == 'X') {
                n2 = 10;
            } else if (romChar[j] == 'L') {
                n2 = 50;
            } else if (romChar[j] == 'C') {
                n2 = 100;
            } else if (romChar[j] == 'D') {
                n2 = 500;
            } else if (romChar[j] == 'M') {
                n2 = 1000;
            }
            if (j < romChar.length - 1) {
                i = j + 1;

                if (romChar[i] == 'I') {
                        n1 = 1;
                } else if (romChar[i] == 'V') {
                        n1 = 5;
                } else if (romChar[i] == 'X') {
                        n1 = 10;
                } else if (romChar[i] == 'L') {
                        n1 = 50;
                } else if (romChar[i] == 'C') {
                        n1 = 100;
                } else if (romChar[i] == 'D') {
                        n1 = 500;
                } else if (romChar[i] == 'M') {
                        n1 = 1000;
                }
            }
            if (n2 < n1) {
                result -= n2;
            } else {
                result += n2;
            }
        }
        return result;
       }    

    public static void main(String[] args) {

        try {
            System.out.println(convertThisRoemer(args[0]));
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
        }
    }
}