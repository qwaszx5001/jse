package cmm03.flow;
import java.util.Scanner;

public class No07_Kaup {
	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	
	No07_Kaup() {// 생성자, No07_Kaup() 카우프 인덱스 this(0,0)에서 자동완성 불러오기
		this(0,0); // 제약을 두는 코딩, 후에 오류가 나지않도록 하기위함
	}

	public No07_Kaup(double i, double j) { // 되도록 이름을 맞춰준다 height
		this.height = i; //지역 파라미터에 나온 것 지역 변수로 집어넣겠다
		this.weight = j;
		this.idx = (int) ((weight/(height*height))*10000);
		//카우프 지수 구하는 방법
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
		if(idx>30){msg = "비만";}
		else if(idx>24){ msg = "과체중"; }
		else if(idx>20){ msg = "정상"; }
		else if(idx>15){ msg = "저체중"; }
		else if(idx>13){ msg = "마름"; }
		else if(idx>10){ msg = "영양실조"; }
		else { msg = "소모증"; }
		return msg;
	}

	@Override //
	public String toString() { // 알트 + 쉬프트 + S 후에 to string 스트링 빼고 자동생성
		return "카우프 지수 [ 키 = " + height + "cm, 몸무게 = 20" + weight + "kg, 카우프 지수 = "
				+ getMsg() + "]";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		
		No07_Kaup kp = new No07_Kaup(height, weight);
		System.out.println(kp.toString());
		
		System.out.println("완료");
		
	}	// 객체지향 나와서 하신분꺼 공유하자
	
}
