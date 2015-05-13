package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {

	public static void main(String[] args) {
//		System.out.println("평균 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int avg = 0; // = scanner.nextInt(); // nextInt 키보드 커서 다음에 잡아서 스캔
		String result = "";
		
		do {
			System.out.println("평균을 입력하세요");
			avg = scanner.nextInt();
		} while(avg < 0 || avg > 100);
		
		if(avg >= 70) {
			result = "합격" ;
		}else {
			result = "재시험" ;
		}
		// 평균점수에 따라서 비교 학점 구하기
		
		char grade = 'F';
		/* if로 입력시		
		if(avg >= 90) {grade= 'A';}
		else if(avg >= 80) {grade= 'B';}
		else if(avg >= 70) {grade= 'C';}
		else if(avg >= 60) {grade= 'D';}
		else {grade='F';}
 		*/		
		// 위 if else를 Switch로 바꾸시오	
		
		switch(avg/10) {
		
		case 10 :
		case 9 : grade= 'A'; break;
		case 8 : grade= 'B'; break;
		case 7 : grade= 'C'; break;
		case 6 : grade= 'D'; break;
		//default : grade= 'F';
		// flg 플랙 알아보기
		// 이상한 값 넣지 말고 유효성 체크
		
		}
		
		System.out.println("귀하는 "+result+"이며, 학점은"+grade+"입니다.");
		
	}

} 
