package facisa.p2.br;


class C4 {
	
	public int m;
	private int n;
	protected int o;
	int p;

	public static  void main(String args[]){
		
		C3 c3 = new C3();
	    c3.e = 9;
	    c3.g = 3;
	    c3.h = 4;
	    
	    /*N pode estanciar, diferente pacote
	    C2 c2 = new C2();*/
	    
	    C4 c4 = new C4();
        c4.m = 1;
        c4.n = 2;
        c4.o = 3;
        c4.p = 5;
	    
	}
}
