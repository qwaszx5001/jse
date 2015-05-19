package oop01.syntax;
/*
 Data : 
 Author : 
 Desc : static ����
 */

public class CardVO {
	private String kind; //ī���� ����
	private int number; //ī���� ����
	static int width = 100; // ī���� ��
	static int height = 250; // ī���� ����
public CardVO(String kind, int number) {
	this.kind = kind;
	this.number = number;
	}

	@Override
	public String toString() { //����Ʈ���� �������̵� ���� �򰥸��ϱ� ��Ʈ�� �����̽� ����
		return this.kind +" "+ this.number; // ���ϰ��� �ϳ��� ��
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}
	
	
}

