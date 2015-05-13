package cmm03.flow;

import java.util.Scanner;

class No08_NumberMatch {
	public static void main (String[] args) {
		No08_NuberMatchVO vo = new No08_NuberMatchVO();
		System.out.println("총 3회만 입력가능합니다.");
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("1부터 5까지 점수만 입력해주세요");
			int result = 0;
			
			try{ 		// try{}catch(){} 시도를 해서 에러를 잡아라
				int input = scanner.nextInt();
				vo.setPlayer(input);
			}catch(Exception e){
				System.out.println("문자는 안됩니다.");
			}
			
			if(vo.getPlayer()==0){
				System.out.println("다시 입력해 주십시오");
			}else {
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}
			if(result == 1) {
				System.out.println("맞췄습니다." + "게임을 종료합니다.");
				break;
				
			}else if(i == 2) {
				System.out.println("3회 모두 참여하였습니다."
				+"\n게임에서 패배했습니다."
				+"\n게임을 종료합니다.");
				break;
			}
		}
	}
}