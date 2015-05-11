package cmm01.var;
/*
 * Upcasting (�ַ� Upcasting�� �������� �� ���� �޶� �Ʒ��Ͱ���)
 * = ��ȯ(Conversion)
 * = promotion
 * = ������(implict) �ڵ���ȯ
 * : �ڹٰ� �����ϴ� �ڵ���ȯ���� �������� ����
 *	������ Ÿ���� ǥ�������� �����ʿ��� ���������� ��ȯ �ɶ��� �����ϴ�.
 */
public class No02_CastingDemo {
	private void mein() {
		
		byte varByte = 1;
		int varInt = 123;
		double varDou = 123.456d;
		
		int upByte = (int)varByte;  
		//(int)�����ص� �������� �ʾ�, �����ص� �Ǵ°� �׳� �����ع����� ����ϰ�
		double upInt = varInt;
		
		/*Down-Casting (���� ĳ���� �Ѵ��ϸ� �ٿ�ĳ���ø� ����)
		 * = ĳ����(Casting)
		 * ���� ����ȯ
		 * : ���α׷����� ��������� �����ϴ� Ÿ�Ժ�ȯ.
		 * ��Һ�ȯ�� �Ǵ� ���� �ݵ�� ��������� ĳ�����Ͽ��� ��.
		 * ����!!! ������ �ս��� �߻��� �� �ִ�.
		 */
		
		float varFlo = 123.456f;
		int downFlo = (int) varFlo;	// (int)
		System.out.println("�ٿ�ĳ���� ����� : " + downFlo);
	}
}
