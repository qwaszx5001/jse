package oop01.syntax;

public class AverageC {
	
	public static void main(String[] args) {

		AverageVO vo = new AverageVO(); //객체
		
		vo.setName("토르");
		vo.setKor(100);
		vo.setEng(20);
				
		System.out.println("==="+vo.getName()+"의 성적표===");
		System.out.println("국어 : " + vo.getKor() + "점");
		System.out.println("영어 : " + vo.getEng() + "점");
		System.out.println("총점 : " + vo.tot() +"점");
		System.out.println("평균 : " + vo.avg() +"점");
		System.out.println();
	}
}