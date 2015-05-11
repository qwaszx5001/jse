package cmm01.var;
/*
 * Upcasting (주로 Upcasting이 쓰이지만 용어가 각자 달라서 아래와같다)
 * = 변환(Conversion)
 * = promotion
 * = 묵시적(implict) 자동변환
 * : 자바가 제공하는 자동변환으로 묵시적인 동작
 *	데이터 타입의 표현범위가 작은쪽에서 많은쪽으로 변환 될때만 가능하다.
 */
public class No02_CastingDemo {
	private void mein() {
		
		byte varByte = 1;
		int varInt = 123;
		double varDou = 123.456d;
		
		int upByte = (int)varByte;  
		//(int)생략해도 에러나지 않아, 생략해도 되는건 그냥 생략해버려라 깔끔하게
		double upInt = varInt;
		
		/*Down-Casting (보통 캐스팅 한다하면 다운캐스팅만 말함)
		 * = 캐스팅(Casting)
		 * 강제 형변환
		 * : 프로그램에서 명시적으로 지정하는 타입변환.
		 * 축소변환이 되는 경우는 반드시 명시적으로 캐스팅하여야 함.
		 * 주의!!! 데이터 손실이 발생할 수 있다.
		 */
		
		float varFlo = 123.456f;
		int downFlo = (int) varFlo;	// (int)
		System.out.println("다운캐스팅 결과값 : " + downFlo);
	}
}
