package oop01.encapsule;

public class NumberMatchVO { //���� �ɺ��� ���ͼ��� ��...
	
	int player, com;
	int input;
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if(player <1 || player >5){
			System.out.println("1���� 5������ ������ �Է��ؾ� �մϴ�.");
		}else{
			this.player = player;
		}
	}
	public int getCom() {
		return com;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public void setCom() {
		this.com = (int) ((Math.random()*2)+1);
	}
	public void setCom(int com){
		this.com = com;
	}

}