package cmm04.array;

public class No04_MultDimArrayDemo {

	public static void main(String[] args) {
		String[][] names = {
				{"Mr.","Mrs.","Ms."},
				{"Smith","John"}
		};
		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][1]);
		System.out.println(names[0][1] + names[1][1]);
		System.out.println(names[1][0] + names[0][1]);
		System.out.println(names[1][1] + names[0][2] + names[1][0]);
		
		/* Mr.Smith
		 * Ms.John ���� ��� ��Ű����
		 */
	}
}
