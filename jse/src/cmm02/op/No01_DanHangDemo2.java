package cmm02.op;

public class No01_DanHangDemo2 {


	
	public static void main(String[] args) {
		
		// �������� ���� ���� �о�� �� �����Ѵ�(������ �̷���� ������ +1)
		int i = 5;
		int j = 0;
		j = i++;  // i���� j�� ���� �� �ڿ� ������ ������ ; �� ������ i+1 �� �Ѵ�.
		System.out.println("j = i++ �� ���");
		System.out.println("=============");
		System.out.println("i�� �� : "+i++);
		System.out.println("i�� �� : "+i);
		System.out.println("j�� �� : "+j);
		System.out.println();
		
		// �������� 1�� ���� ������Ű�� �����Ѵ�(������ �̷�� ���� ���� +1)	
		int x = 5;
		int y = 0;
		y = ++x; // x���� +1 ���� ���� y�� ������Ų x���� �����Ѵ�.
		System.out.println("y = ++x �� ���");
		System.out.println("=============");
		System.out.println("x�� �� : "+x);
		System.out.println("x�� �� : "+ ++x);
		System.out.println("y�� �� : "+y);
		System.out.println();

		//�ʱ�ȭ, �Ҵ翡 ���ؼ� ���ذ� �Ǿ������� ���ذ��ȴ�

	}   //�̷� ������ �ε������� �����ϰ� �Ǵ� �����̱⵵�ϴ�

}
