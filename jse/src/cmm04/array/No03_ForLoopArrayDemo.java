package cmm04.array;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		/*int a;
		a = 2;
		int ab = 2; ����� �ʱ�ȭ�� �Ѳ����� �� 
		*/ 
		
		int [] arr = {1,2,3,4,5};
		int sum = 0;
		// 1���� 5������ ���� ���ϼ���
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			//sum = sum + arr[i];
		}
		
		System.out.println("1���� 5������ ���� : " + sum);
	}
}
