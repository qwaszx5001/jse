package oop01.syntax;

/*
public class AverageEVO {
	public AverageEVO() {}
} �����ڵ鿡�� �ų��ִ� �ൿ �⺻������ ����Ʈ�� �ϳ� ������ش�
*/

public class AverageEVO {
	
	private String name;
	private int kor;
	private int eng;
	
	public AverageEVO(){} // �⺻������
	
	public AverageEVO(String name, int kor, int eng) { // ���̵� ���ϰ� �������� ������
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