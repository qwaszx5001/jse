package oop01.syntax;

public class AverageC {
	
	public static void main(String[] args) {

		AverageVO vo = new AverageVO(); //��ü
		
		vo.setName("�丣");
		vo.setKor(100);
		vo.setEng(20);
				
		System.out.println("==="+vo.getName()+"�� ����ǥ===");
		System.out.println("���� : " + vo.getKor() + "��");
		System.out.println("���� : " + vo.getEng() + "��");
		System.out.println("���� : " + vo.tot() +"��");
		System.out.println("��� : " + vo.avg() +"��");
		System.out.println();
	}
}