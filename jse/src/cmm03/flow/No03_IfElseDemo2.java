package cmm03.flow;

public class No03_IfElseDemo2 {
	public static void main(String[] args) {
		int kor = 90, eng = 85, sum = 0;
		double avg;
		String msg = "메세지";
		sum = kor + eng;
		avg = sum/2;
		
		/* 조건에 따라 if 처리
		 * 평균이 100점이면 보너스 지급
		 * 평균이 70이상이면 시험 합격
		 * 평균이 70미만이면 제시험을 보세요.
		 */
		
		if(avg == 100 ) {
			msg = "보너스 지급";
		} else if(avg >= 70) {
			msg = "시험합격";
		} else {
			msg = "제시험을 보세요";
		}
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + sum);
		System.out.println(msg);
	}
}
