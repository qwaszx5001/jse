package oop01.syntax;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	public Rectangle() {
		origin = new Point(0,0);
	}
	public Rectangle(Point p) {
		origin = p;
	}
	public Rectangle(int w, int h) { // Rectangle 이 사라지면 new Point(0,0); 사라진다
		origin = new Point(0,0);
		width = w;
		height = h;
	}
	public Rectangle(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}
	// a method for moving the rectangle
	public void move(int x, int y) {origin.x = x; origin.y = y; 
		// 원래 위치 origin 이라 할때 파라미터 위초로 옮기는 기능을 코드화 시켜주세요
	}
	// a method for computing the area of the rectangle
	public int getArea() {
		return this.height * this.width;
	}

}
