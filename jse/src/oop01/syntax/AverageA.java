package oop01.syntax;

public class AverageA {

	String name;
	int kor;
	int eng;
	
	
	public static void main(String[] args) {
	
		int tot;
		double avg;
		
		// tot, avg ���������� �����Ͻð�
		// �Ʒ��� ���� ��µǵ��� ���ּ���.

		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA thor = new AverageA();
		
		hulk.name = "��ũ";
		hulk.kor = 70;
		hulk.eng = 100;
		tot = hulk.kor + hulk.eng;
		avg = tot/2d;  
				
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� : " + hulk.kor + "��");
		System.out.println("���� : " + hulk.eng + "��");
		System.out.println("���� : " + tot +"��");
		System.out.println("��� : " + avg +"��");
		System.out.println();
		
		iron.name = "���̾��";
		iron.kor = 100;
		iron.eng = 100;
		tot = iron.kor + iron.eng;
		avg = tot/2d;
				
		System.out.println("==="+iron.name+"�� ����ǥ===");
		System.out.println("���� : " + iron.kor + "��");
		System.out.println("���� : " + iron.eng + "��");
		System.out.println("���� : " + tot +"��");
		System.out.println("��� : " + avg +"��");
		System.out.println();
		
		thor.name = "�丣";
		thor.kor = 45;
		thor.eng = 25;
		tot = thor.kor + thor.eng;
		avg = tot/2d;
				
		System.out.println("==="+thor.name+"�� ����ǥ===");
		System.out.println("���� : " + thor.kor + "��");
		System.out.println("���� : " + thor.eng + "��");
		System.out.println("���� : " + tot +"��");
		System.out.println("��� : " + avg +"��");
		System.out.println();
	
		
	}

}
