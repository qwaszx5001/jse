package cmm04.array;

public class No02_StringArrayDemo {
	public static void main(String[] args) {
		String[] juso = new String[3];
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";
		
		System.out.println(juso[0]);
		System.out.println(juso[1]);
		System.out.println(juso[2]);
		
		System.out.println();
		
		int i = 0; // 초기화 값 포문을 여러가지 써야할때 이런식으로 빼서 사용, 변수는 적어야 좋아
		for (; i < juso.length; i++) { //밖으로 빼도 구분자(;) 두개는 꼭 넣어줘야 한다
			System.out.print(juso[i]+"\t");	
			// 배열에는 항상 for문(반복문) 따라붙는다
			
			//두 개 이상의 다중for문을 쓸 때, 지역변수로 선언해주는게 효율적 - 변수의 갯수는 적는게 좋음  / 문법에 맞게 구분자는 꼭 넣어줘야 함
		}
	}
}
