package cmm04.array;
import java.util.Scanner;

public class No03_ForLoopArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("다섯가지 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
	No03_ForLoopArrayVO vo = new No03_ForLoopArrayVO();

	vo.output(a,b,c,d,e);


	}

}
