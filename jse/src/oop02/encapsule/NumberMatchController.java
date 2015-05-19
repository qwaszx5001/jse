package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchController { // 내부로직안나오는 콘솔 Scanner과 결과 출력기능만 있어야...(메인) 
	public static void main (String[] args) {
		int player;
		Scanner scanner = new Scanner(System.in);
		NumberMatchService service = new NumberMatchService();
		System.out.println("1~2까지의 수를 입력해주세요");
		player = scanner.nextInt();
		service.game(player);
		scanner.close();
	}
}