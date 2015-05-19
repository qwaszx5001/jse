package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng; 
	
	/*메소드를 여기에 정의하셔서 메소드의 객체화를 해주세요*/
	
	public int tot() {
		return kor+eng;
	}
	
	public double avg() { 
		return tot()/2d;
	}
	
	public static void main(String[] args) {
	
	AverageB hulk = new AverageB();
	
	hulk.name = "헐크";
	hulk.kor = 50;
	hulk.eng = 46;
			

System.out.println("==="+hulk.name+"의 성적표===");
System.out.println("국어 : " + hulk.kor + "점");
System.out.println("영어 : " + hulk.eng + "점");
System.out.println("총점 : " + hulk.tot() +"점");
System.out.println("평균 : " + hulk.avg() +"점");
System.out.println();
	}
}