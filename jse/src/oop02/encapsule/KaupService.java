package oop02.encapsule;

import java.util.Scanner;

import cmm03.flow.No07_Kaup;

public class KaupService {

	public static void main(String[] args) {
		
		KaupVo vo = new KaupVo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();	
		// System.out.println("������ " + weight); ������ ���� üũ�ҷ��� �־�����
		vo.setHeight(height);
		vo.setWeight(weight);
		vo.setIdx(weight, height);
		vo.setMsg(" ");
		System.out.println(vo.toString());
		System.out.println("�Ϸ�");
	}

}
