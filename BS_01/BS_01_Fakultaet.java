class BS_01_Fakultaet {

	static int FacBuilder(int x){
		if(x>1){
			// dann multipliziere X * X-1
			return x * FacBuilder(x-1);
		}else{
			// return x
			return x;
		}
	}

	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);

		System.out.println("Das Ergebnis der Fakultät: "+FacBuilder(x));

	}
}