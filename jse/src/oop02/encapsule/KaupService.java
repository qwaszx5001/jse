package oop02.encapsule;

import java.util.Scanner;

import cmm03.flow.No07_Kaup;

public class KaupService {

	public static void main(String[] args) {
		
		KaupVo vo = new KaupVo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();	
		// System.out.println("몸무게 " + weight); 몸무게 에러 체크할려고 넣었던거
		vo.setHeight(height);
		vo.setWeight(weight);
		vo.setIdx(weight, height);
		vo.setMsg(" ");
		System.out.println(vo.toString());
		System.out.println("완료");
	}

}
