package cmm03.flow;

public class No08_NuberMatchVO { //뒤에 vo 라고 되어있으면 게터 셋터 입력 
	int player, com, count;
	public int game(int com, int player) {
		int result;
		if(getPlayer() == getCom()){
			System.out.println(getPlayer() + "정답 !!");
			result = 1;
		} else{
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 " + getCom()+"입니다");
			result = 0;
			}
		return result;
	}// 알트 + 쉬프트 + S > R 게터셋터 만들기 바로가기
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if(player < 1 || player > 5) {
			System.out.println(" 1부터 5까지의 실수만 입력해야 합니다.");
			
		}else {
			this.player = player;
		}
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		this.com = (int) ((Math.random()*5)+1);
	}	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}// 겟은 불러오는 놈이기 때문에 손안됨 쓰는놈인 셋만 손댄다고 생각하자 
