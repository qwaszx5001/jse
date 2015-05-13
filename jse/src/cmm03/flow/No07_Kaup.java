package cmm03.flow;
import java.util.Scanner;

public class No07_Kaup {
	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	
	No07_Kaup() {// ������, No07_Kaup() ī���� �ε��� this(0,0)���� �ڵ��ϼ� �ҷ�����
		this(0,0); // ������ �δ� �ڵ�, �Ŀ� ������ �����ʵ��� �ϱ�����
	}

	public No07_Kaup(double i, double j) { // �ǵ��� �̸��� �����ش� height
		this.height = i; //���� �Ķ���Ϳ� ���� �� ���� ������ ����ְڴ�
		this.weight = j;
		this.idx = (int) ((weight/(height*height))*10000);
		//ī���� ���� ���ϴ� ���
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = scanner.nextDouble();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = scanner.nextDouble();
	}
	
	String getMsg() {
		String msg = "";
		if(idx>30){msg = "��";}
		else if(idx>24){ msg = "��ü��"; }
		else if(idx>20){ msg = "����"; }
		else if(idx>15){ msg = "��ü��"; }
		else if(idx>13){ msg = "����"; }
		else if(idx>10){ msg = "�������"; }
		else { msg = "�Ҹ���"; }
		return msg;
	}

	@Override //
	public String toString() { // ��Ʈ + ����Ʈ + S �Ŀ� to string ��Ʈ�� ���� �ڵ�����
		return "ī���� ���� [ Ű = " + height + "cm, ������ = 20" + weight + "kg, ī���� ���� = "
				+ getMsg() + "]";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
		
		No07_Kaup kp = new No07_Kaup(height, weight);
		System.out.println(kp.toString());
		
		System.out.println("�Ϸ�");
		
	}	// ��ü���� ���ͼ� �Ͻźв� ��������
	
}
