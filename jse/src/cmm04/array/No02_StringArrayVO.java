package cmm04.array;

public class No02_StringArrayVO {
	public void output() { //아웃풋 메소드 생성
		
		String[] juso = new String[3];
		
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";

		for (int i = 0; i < juso.length; i++) { 
			System.out.print(juso[i]+"\t");	
		}
	}
}
//클래스는 객체의 설계도이다
//함수만 움직이는 절차지향 한통로만 이루어져있다
//자바의 객체지향 -> 자바의 "속성과 기능" 이라고 하자