package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		//int kor = 90; // 선언(Declaration)
		//kor = 90; // 할당(Allocation)
		int kor = 90, eng = 85, sum = 0;
		//같은타입은 이런식으로 동일한 선상에 넣어준다
		sum = kor + eng;

		System.out.print("성적처리\n");
		System.out.println("국어	영어	합계");
		System.out.println(kor+"\t"+eng+"\t"+sum);
		//"\t" tap code
	} 	
}
