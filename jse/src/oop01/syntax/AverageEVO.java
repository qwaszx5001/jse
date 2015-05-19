package oop01.syntax;

/*
public class AverageEVO {
	public AverageEVO() {}
} 개발자들에게 매너있는 행동 기본생성자 디폴트를 하나 만들어준다
*/

public class AverageEVO {
	
	private String name;
	private int kor;
	private int eng;
	
	public AverageEVO(){} // 기본생성자
	
	public AverageEVO(String name, int kor, int eng) { // 보이드 리턴값 넣지않은 생성자
		this.name=name;
		this.kor = kor;
		this.eng = eng;	
	}
	public int tot() {
		return kor+eng;
	}
	public double avg() { 
		return tot()/2d;
	}
}