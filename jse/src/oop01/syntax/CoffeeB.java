package oop01.syntax;

class MilkCoffee { // Coffee �� ���� ���� ���� ���� Ŭ���� ������ ����
	
	/*
	 * �����ڴ� �ν��Ͻ��� ������ �� ȣ��Ǵ� "�ν��Ͻ� �ʱ�ȭ �޼���" �̴�. 
	 * */
	int money;
	
	public MilkCoffee() {
		System.out.println("���� �ִ�");
	}  // ������(�����ڴ� �޼ҵ�*)�� ������ġ�� �ٸ��⶧���� ����,��ġ �� ������� 
							

	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money; //�ɹ�����
	}
	
	public MilkCoffee(int money, boolean exist) {
		this (money);
		System.out.println("���Ű��ɿ��� : " + (exist == true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}
	public MilkCoffee(int money) {
		this();	
		setMoney(0);  //this.setMoney(0); �߸��� ����
		
		System.out.println(money + "��");
	}
}	
	
	
	/*
	 * package oop01.syntax;

		class MilkCoffee { 
	 * 
		System.out.println("���� �ִ�");
	}
	public MilkCoffee(int money) {
		this ();
		System.out.println(money + "��");
	}
	public MilkCoffee(int money, boolean exist) {
		this (money);
		System.out.println("���Ű��ɿ��� : " + (exist == true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}	
}	
	public class CoffeeB {
	public static void main(String[] args) {
	new MilkCoffee(500,true);		
	}
}

	 */
	
	
public class CoffeeB {
	/*���� �ִ�
	 * 500��
	 * ���Ű��� ���� : Ŀ����������, �����ڸ� �ѹ��� ������
	 */ 
	public static void main(String[] args) {
		MilkCoffee mc = new MilkCoffee();
		// �ν��ͽ��� ��ȭ�� �ʴ� �ּҰ��� ���� ����(���۷���) �����̴�.
		// ��Ȳ�� ���� �ٸ������� �ν��ͽ��� �ν��ͽ� ������ �ٸ����̶�� �����س��� 
		
	}
}
