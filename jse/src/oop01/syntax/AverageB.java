package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng; 
	
	/*�޼ҵ带 ���⿡ �����ϼż� �޼ҵ��� ��üȭ�� ���ּ���*/
	
	public int tot() {
		return kor+eng;
	}
	
	public double avg() { 
		return tot()/2d;
	}
	
	public static void main(String[] args) {
	
	AverageB hulk = new AverageB();
	
	hulk.name = "��ũ";
	hulk.kor = 50;
	hulk.eng = 46;
			

System.out.println("==="+hulk.name+"�� ����ǥ===");
System.out.println("���� : " + hulk.kor + "��");
System.out.println("���� : " + hulk.eng + "��");
System.out.println("���� : " + hulk.tot() +"��");
System.out.println("��� : " + hulk.avg() +"��");
System.out.println();
	}
}