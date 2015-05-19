package oop01.syntax;

/*

static 변수
-정적변수(변하지 않는 주소값을 할당하기 때문에 정적이라고 한다) 
-클래스가 JVM 상으로 로딩시에 메모리 할당을 한다.
-해시코드(HashCode) 의 출력
-객체의 해치코드는 JVM 의 해시알고리즘에 의해 피키지 명과 클래스 영어 조합되어 해시코드가 산출된다.
-String 은 객체변수의 값이 같은 경우 즉 같은 문자열을 가지고 있으며 해시코드를 공유한다.
	String str1 = "헐크";
	String str2 = "헐크";
	str1.hashCode() = str2.hashCode();
	hashCode(주소값)

static 사용을 고려해야 할 상황
-맴변중 모든 인스턴스에 공통적으로 사용해야 하는 것에 붙여사용.
-인스턴스 변수를 사용하지 않고, 클래스에서 바로 접근하려 할 시.

*/

public class No06_StaticSyntax {
	public static void main(String[] avgs) {
		String hulk = "헐크";
		String hulk2 = new String("헐크"); // 자주쓰는 String이기 때문에 유일한 참조변수 불멸의 객체 사라지지 않는다
		
	}
}
