package oop01.syntax;

public class AverageD {

	public static void main(String[] args) {
		
		AverageService service = new AverageService(); //��ü
		
		String name = "��ũ";
		int kor = 60;
		int eng = 20;
		
		service.haha(name, kor, eng);
				
		System.out.println("==="+name+"�� ����ǥ===");
		System.out.println("���� : " + kor + "��");
		System.out.println("���� : " + eng + "��");
		System.out.println("���� : " + service.tot() +"��");
		System.out.println("��� : " + service.avg() +"��");
		System.out.println();
	}

}
