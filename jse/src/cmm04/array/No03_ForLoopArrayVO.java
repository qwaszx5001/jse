package cmm04.array;

public class No03_ForLoopArrayVO {
	
	private int a,b,c,d,e;
	
	public int getA() {
		return a;
	}
	public void setA(int dada) {	// dada는 객체지향의 은닉화 이때만 쓰고 사라짐
		this.a = dada;				// this.a => private int a 
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {  		// 이름을 같게해서 햇갈리지 않게하는것
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	
	
	void output(int a, int b, int c, int d, int e) { 
		
		setA(a);
		setB(b);
		setC(c);
		setD(d);
		setE(e);
		
		int [] arr = {getA(),getB(),getC(),getD(),getE()};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];	
		}
		System.out.println("1부터 5까지의 합은 : " + sum);
	}
}
