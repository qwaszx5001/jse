package cmm02.op;

public class No01_DanHangDemo2 {


	
	public static void main(String[] args) {
		
		// 후위형은 변수 값을 읽어온 후 연산한다(연산이 이루어진 다음에 +1)
		int i = 5;
		int j = 0;
		j = i++;  // i값을 j에 대입 한 뒤에 문장이 끝나는 ; 을 지나면 i+1 을 한다.
		System.out.println("j = i++ 의 결과");
		System.out.println("=============");
		System.out.println("i의 값 : "+i++);
		System.out.println("i의 값 : "+i);
		System.out.println("j의 값 : "+j);
		System.out.println();
		
		// 전위형은 1을 먼저 증가시키고 연산한다(연산이 이루어 지기 전에 +1)	
		int x = 5;
		int y = 0;
		y = ++x; // x값을 +1 해준 다음 y에 증가시킨 x값을 대입한다.
		System.out.println("y = ++x 의 결과");
		System.out.println("=============");
		System.out.println("x의 값 : "+x);
		System.out.println("x의 값 : "+ ++x);
		System.out.println("y의 값 : "+y);
		System.out.println();

		//초기화, 할당에 대해서 이해가 되어있으면 이해가된다

	}   //이런 문제는 로딩때문에 선정하게 되는 문제이기도하다

}
