package cmm03.flow;

import java.util.Scanner;

class No08_NumberMatch {
	public static void main (String[] args) {
		No08_NuberMatchVO vo = new No08_NuberMatchVO();
		System.out.println("�� 3ȸ�� �Է°����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("1���� 5���� ������ �Է����ּ���");
			int result = 0;
			
			try{ 		// try{}catch(){} �õ��� �ؼ� ������ ��ƶ�
				int input = scanner.nextInt();
				vo.setPlayer(input);
			}catch(Exception e){
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
			
			if(vo.getPlayer()==0){
				System.out.println("�ٽ� �Է��� �ֽʽÿ�");
			}else {
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}
			if(result == 1) {
				System.out.println("������ϴ�." + "������ �����մϴ�.");
				break;
				
			}else if(i == 2) {
				System.out.println("3ȸ ��� �����Ͽ����ϴ�."
				+"\n���ӿ��� �й��߽��ϴ�."
				+"\n������ �����մϴ�.");
				break;
			}
		}
	}
}