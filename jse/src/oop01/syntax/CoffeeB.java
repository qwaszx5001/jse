package oop01.syntax;

class MilkCoffee { // Coffee 로 하지 않은 이유 같은 클래스 넣을수 없다
	
	/*
	 * 생성자는 인스턴스가 생성될 때 호출되는 "인스턴스 초기화 메서드" 이다. 
	 * */
	int money;
	
	public MilkCoffee() {
		System.out.println("돈을 넣다");
	}  // 생성자(생성자는 메소드*)는 저장위치가 다르기때문에 순서,위치 다 상관없엉 
							

	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money; //맴버변수
	}
	
	public MilkCoffee(int money, boolean exist) {
		this (money);
		System.out.println("구매가능여부 : " + (exist == true ? "커피종류선택" : "커피없음"));
	}
	public MilkCoffee(int money) {
		this();	
		setMoney(0);  //this.setMoney(0); 잘못된 예제
		
		System.out.println(money + "원");
	}
}	
	
	
	/*
	 * package oop01.syntax;

		class MilkCoffee { 
	 * 
		System.out.println("돈을 넣다");
	}
	public MilkCoffee(int money) {
		this ();
		System.out.println(money + "원");
	}
	public MilkCoffee(int money, boolean exist) {
		this (money);
		System.out.println("구매가능여부 : " + (exist == true ? "커피종류선택" : "커피없음"));
	}	
}	
	public class CoffeeB {
	public static void main(String[] args) {
	new MilkCoffee(500,true);		
	}
}

	 */
	
	
public class CoffeeB {
	/*돈을 넣다
	 * 500원
	 * 구매가능 여부 : 커피종류선택, 생성자를 한번만 쓰세요
	 */ 
	public static void main(String[] args) {
		MilkCoffee mc = new MilkCoffee();
		// 인스터스는 변화지 않는 주소값을 가진 참조(레퍼런스) 변수이다.
		// 상황에 따라 다르겠지만 인스터스와 인스터스 변수는 다른놈이라고 정의해놓자 
		
	}
}
