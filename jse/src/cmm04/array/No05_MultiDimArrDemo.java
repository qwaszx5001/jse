package cmm04.array;

//�ڹ��� ���� 5~10 ����

public class No05_MultiDimArrDemo {
	public static void main(String[] args) {
		int [][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("===========================================");
		
		for(int i = 0; i < score.length; i++ ) {
			int sum = 0;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.print("  " + (i + 1) + "  ");
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print("\t"+score[i][j]+"");
		}
		System.out.println("\t" + sum + "\t" + sum/(float)score[i].length + "\t");
	}		
	System.out.println("===========================================");
	// �Ʒ� �������� ����, ����, ���� ������ ������ �ϼ���
	System.out.println("���� : " + korTotal +"\t"+ engTotal +"\t"+ mathTotal);
	

}
}
