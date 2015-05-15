import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*각각 받은 돈, 총액, 세금,잔돈을 의미하는 정수 변수를 선언합니다.*/
		int received,price,tax,change;  //int 자료의 형태
		/*입력을 위한 인스턴스 input을 생성합니다.*/
		Scanner input = new Scanner(System.in);
		/*받은 돈과 총액을 각각 입력받습니다.*/
		System.out.print("받은 돈 : ");
		received = input.nextInt();
		System.out.print("상품의 총액 : ");
		price = input.nextInt();
		/*10% 계산을 곱하기 0.1 대신에 정수로 통일, 나누기 10으로 계산합니다.*/
		tax = price / 10;
		/*받은 돈 - 가격으로 잔돈 변수에 대입합니다.*/
		change = received - price;
		/*계산 결과를 출력합니다.*/
		System.out.println("부가세 : "+tax);
		System.out.println("잔돈 : "+change);
	}
}