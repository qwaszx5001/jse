package oop01.syntax;

public class AverageA {

	String name;
	int kor;
	int eng;
	
	
	public static void main(String[] args) {
	
		int tot;
		double avg;
		
		// tot, avg 지역변수를 선언하시고
		// 아래와 같이 출력되도록 해주세요.

		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		
		hulk.name = "헐크";
		hulk.kor = 70;
		hulk.eng = 100;
		tot = hulk.kor + hulk.eng;
		avg = tot/2d;  
				
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : " + hulk.kor + "점");
		System.out.println("영어 : " + hulk.eng + "점");
		System.out.println("총점 : " + tot +"점");
		System.out.println("평균 : " + avg +"점");
		System.out.println();
		
		iron.name = "아이언맨";
		iron.kor = 100;
		iron.eng = 100;
		tot = iron.kor + iron.eng;
		avg = tot/2d;
				
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 : " + iron.kor + "점");
		System.out.println("영어 : " + iron.eng + "점");
		System.out.println("총점 : " + tot +"점");
		System.out.println("평균 : " + avg +"점");
		System.out.println();
		
		thor.name = "토르";
		thor.kor = 45;
		thor.eng = 25;
		tot = thor.kor + thor.eng;
		avg = tot/2d;
				
		System.out.println("==="+thor.name+"의 성적표===");
		System.out.println("국어 : " + thor.kor + "점");
		System.out.println("영어 : " + thor.eng + "점");
		System.out.println("총점 : " + tot +"점");
		System.out.println("평균 : " + avg +"점");
		System.out.println();
	
		
	}

}
