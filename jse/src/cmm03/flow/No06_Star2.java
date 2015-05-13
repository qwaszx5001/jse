package cmm03.flow;

/*
¡Ú¡Ú¡Ú¡Ú¡Ú
¡Ú¡Ú¡Ú¡Ú
¡Ú¡Ú¡Ú
¡Ú¡Ú
¡Ú
*/

public class No06_Star2 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("¡Ú");
			}
			System.out.println();
		}
	}
}
