package oop01.syntax;

public class CardMain {

	public static void main(String[] args) {
		
		
			System.out.println("ī�� ���� : " + CardVO.height); // ����Ʈ
			System.out.println("ī�� �ʺ� : " + CardVO.width); // ���� �ǹ����� �̷��� �о��
			
			// �ν��Ͻ� �����ϼż� �Ʒ� ���ó�� ��µǵ��� ���ּ���
			
			CardVO pl = new CardVO("��Ʈ", 3);
			CardVO cm = new CardVO("�����̽�", 5);
			
			
			System.out.println("�÷��̾�� "+pl.toString()+" �̰�");
			System.out.println("��ǻ�ʹ� "+cm.toString()+" ��"+"��ǻ�Ͱ� �̰���ϴ�.");
			// heart, spade
			
			System.out.println("");
			
			System.out.println("�÷��̾�� "+pl.getKind()+pl.getNumber()+" �̰�");
			System.out.println("��ǻ�ʹ� "+cm.getKind()+cm.getNumber()+" ��"+"��ǻ�Ͱ� �̰���ϴ�.");
	}

}
