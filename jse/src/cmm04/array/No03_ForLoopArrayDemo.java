package cmm04.array;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		/*int a;
		a = 2;
		int ab = 2; 선언과 초기화를 한꺼번에 함 
		*/ 
		
		int [] arr = {1,2,3,4,5};
		int sum = 0;
		// 1부터 5까지의 합을 구하세요
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			//sum = sum + arr[i];
		}
		
		System.out.println("1부터 5까지의 합은 : " + sum);
	}
}
