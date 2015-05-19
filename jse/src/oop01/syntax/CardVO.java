package oop01.syntax;
/*
 Data : 
 Author : 
 Desc : static 예제
 */

public class CardVO {
	private String kind; //카드위 무늬
	private int number; //카드의 숫자
	static int width = 100; // 카드의 폭
	static int height = 250; // 카드의 높이
public CardVO(String kind, int number) {
	this.kind = kind;
	this.number = number;
	}

	@Override
	public String toString() { //투스트링은 오버라이드 고고씽 헷갈리니까 컨트롤 스페이스 ㄱㄱ
		return this.kind +" "+ this.number; // 리턴값은 하나만 ㅇ
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}
	
	
}

