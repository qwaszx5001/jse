package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {

	public static void main(String[] args) {
//		System.out.println("��� ������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int avg = 0; // = scanner.nextInt(); // nextInt Ű���� Ŀ�� ������ ��Ƽ� ��ĵ
		String result = "";
		
		do {
			System.out.println("����� �Է��ϼ���");
			avg = scanner.nextInt();
		} while(avg < 0 || avg > 100);
		
		if(avg >= 70) {
			result = "�հ�" ;
		}else {
			result = "�����" ;
		}
		// ��������� ���� �� ���� ���ϱ�
		
		char grade = 'F';
		/* if�� �Է½�		
		if(avg >= 90) {grade= 'A';}
		else if(avg >= 80) {grade= 'B';}
		else if(avg >= 70) {grade= 'C';}
		else if(avg >= 60) {grade= 'D';}
		else {grade='F';}
 		*/		
		// �� if else�� Switch�� �ٲٽÿ�	
		
		switch(avg/10) {
		
		case 10 :
		case 9 : grade= 'A'; break;
		case 8 : grade= 'B'; break;
		case 7 : grade= 'C'; break;
		case 6 : grade= 'D'; break;
		//default : grade= 'F';
		// flg �÷� �˾ƺ���
		// �̻��� �� ���� ���� ��ȿ�� üũ
		
		}
		
		System.out.println("���ϴ� "+result+"�̸�, ������"+grade+"�Դϴ�.");
		
	}

} 
