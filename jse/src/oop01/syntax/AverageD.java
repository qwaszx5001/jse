package oop01.syntax;

public class AverageD {

	public static void main(String[] args) {
		
		AverageService service = new AverageService(); //°´Ã¼
		
		String name = "ÇæÅ©";
		int kor = 60;
		int eng = 20;
		
		service.haha(name, kor, eng);
				
		System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : " + kor + "Á¡");
		System.out.println("¿µ¾î : " + eng + "Á¡");
		System.out.println("ÃÑÁ¡ : " + service.tot() +"Á¡");
		System.out.println("Æò±Õ : " + service.avg() +"Á¡");
		System.out.println();
	}

}
