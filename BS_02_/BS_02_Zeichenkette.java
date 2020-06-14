//Gegeben seien zwei Zeichenketten k = k1k2...km und t = t1t2...tn.
//Geben Sie einen Algorithmus an, der entscheidet, ob die Zeichenkette k in t enthalten 
//ist. Wenn ja, soll die Position des ersten Auftretens ausgegeben werden, wenn nein, soll 0 ausgegeben werden.
//Testen Sie diesen Algorithmus mittels eines Konsolenprogramms. 
//Beispiel: Für t = abrakadabra und k = ka ist die Antwort 5.
//Programmieren Sie selbst und verwenden Sie NICHT die entsprechende Funktion der 
//Klassenbibliothek! 
//Hinweis: Die Länge eines Textes können Sie über die Eigenschaft „Length“ abrufen. 


class BS_02_Zeichenkette {

	static int compareToZeichenKettenDienstAnwendung(String k, String t){

        // prüfe ob k kleiner t ist (wenn nicht tausche)
        if(k.length() > t.length()){
            System.out.println("k ist größer als t, das funktioniert so nicht");

            String cache = k;
            k= t;
            t= cache;
            System.out.println("Meinten Sie: "+k+ " " +t );
        }

        // suche nach der Stelle des ersten Auftretens
        for(int i = 0; i < t.length() ; i++){
            
            if(Character.compare(t.charAt(i), k.charAt(0)) == 0){
                if(k.length()==1){
                    return i+1;
                }
                for(int j = 1; j < k.length() ; j++){
                    if(Character.compare(k.charAt(j), t.charAt(i+j)) == 0){
                        if(j == k.length()-1 ){
                            return i+1;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        return 0;
    }

	public static void main(String[] args){
        int i;
        //Erwartete Startparameter: 2 jeweils zusammenhängende Zeichenketten (k & t) 
        // BSP: java BS_02_Zeichenkette 321a 143a
        
		System.out.println("\nDie ZeichenKettenDienstAnwendung wurde gestartet (Übergabe k , t)");
		i = compareToZeichenKettenDienstAnwendung(args[0], args[1]);
        
        if(i > 0){
            System.out.println("Die Zeichenkette ist enthalten an "+ i+ ". Stelle");    
        }else{
            System.out.println("Die Zeichenkette ist nicht enthalten");    
        }
        System.out.print("\n");    
	}
}