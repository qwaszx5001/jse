package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchController { // ���η����ȳ����� �ܼ� Scanner�� ��� ��±�ɸ� �־��...(����) 
	public static void main (String[] args) {
		int player;
		Scanner scanner = new Scanner(System.in);
		NumberMatchService service = new NumberMatchService();
		System.out.println("1~2������ ���� �Է����ּ���");
		player = scanner.nextInt();
		service.game(player);
		scanner.close();
	}
}