package cmm04.array;

public class No02_StringArrayDemo {
	public static void main(String[] args) {
		String[] juso = new String[3];
		juso[0] = "����";
		juso[1] = "����";
		juso[2] = "��ȭ��";
		
		System.out.println(juso[0]);
		System.out.println(juso[1]);
		System.out.println(juso[2]);
		
		System.out.println();
		
		int i = 0; // �ʱ�ȭ �� ������ �������� ����Ҷ� �̷������� ���� ���, ������ ����� ����
		for (; i < juso.length; i++) { //������ ���� ������(;) �ΰ��� �� �־���� �Ѵ�
			System.out.print(juso[i]+"\t");	
			// �迭���� �׻� for��(�ݺ���) ����ٴ´�
			
			//�� �� �̻��� ����for���� �� ��, ���������� �������ִ°� ȿ���� - ������ ������ ���°� ����  / ������ �°� �����ڴ� �� �־���� ��
		}
	}
}
