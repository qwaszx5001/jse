import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*���� ���� ��, �Ѿ�, ����,�ܵ��� �ǹ��ϴ� ���� ������ �����մϴ�.*/
		int received,price,tax,change;  //int �ڷ��� ����
		/*�Է��� ���� �ν��Ͻ� input�� �����մϴ�.*/
		Scanner input = new Scanner(System.in);
		/*���� ���� �Ѿ��� ���� �Է¹޽��ϴ�.*/
		System.out.print("���� �� : ");
		received = input.nextInt();
		System.out.print("��ǰ�� �Ѿ� : ");
		price = input.nextInt();
		/*10% ����� ���ϱ� 0.1 ��ſ� ������ ����, ������ 10���� ����մϴ�.*/
		tax = price / 10;
		/*���� �� - �������� �ܵ� ������ �����մϴ�.*/
		change = received - price;
		/*��� ����� ����մϴ�.*/
		System.out.println("�ΰ��� : "+tax);
		System.out.println("�ܵ� : "+change);
	}
}