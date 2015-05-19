package oop01.syntax;

public class CardMain {

	public static void main(String[] args) {
		
		
			System.out.println("카드 높이 : " + CardVO.height); // 하이트
			System.out.println("카드 너비 : " + CardVO.width); // 위드 실무에서 이렇게 읽어용
			
			// 인스턴스 생성하셔서 아래 결과처럼 출력되도록 해주세요
			
			CardVO pl = new CardVO("하트", 3);
			CardVO cm = new CardVO("스페이스", 5);
			
			
			System.out.println("플레이어는 "+pl.toString()+" 이고");
			System.out.println("컴퓨터는 "+cm.toString()+" 라서"+"컴퓨터가 이겼습니다.");
			// heart, spade
			
			System.out.println("");
			
			System.out.println("플레이어는 "+pl.getKind()+pl.getNumber()+" 이고");
			System.out.println("컴퓨터는 "+cm.getKind()+cm.getNumber()+" 라서"+"컴퓨터가 이겼습니다.");
	}

}
