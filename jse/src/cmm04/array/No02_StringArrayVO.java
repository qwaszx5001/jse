package cmm04.array;

public class No02_StringArrayVO {
	public void output() { //�ƿ�ǲ �޼ҵ� ����
		
		String[] juso = new String[3];
		
		juso[0] = "����";
		juso[1] = "����";
		juso[2] = "��ȭ��";

		for (int i = 0; i < juso.length; i++) { 
			System.out.print(juso[i]+"\t");	
		}
	}
}
//Ŭ������ ��ü�� ���赵�̴�
//�Լ��� �����̴� �������� ����θ� �̷�����ִ�
//�ڹ��� ��ü���� -> �ڹ��� "�Ӽ��� ���" �̶�� ����