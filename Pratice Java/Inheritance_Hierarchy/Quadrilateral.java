package Inheritance_Hierarchy;

public abstract class Quadrilateral {
	public int x1;
	public int y1;
	public int x2;
	public int y2;
	public int x3;
	public int y3;
	public int x4;
	public int y4;
	public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3,
			int x4, int y4) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	public int LengthA(){
		return Math.abs(x2-x1);
	}
	public int LengthB(){
		return Math.abs(x4-x3);
	}
	public int LengthC(){
		return Math.abs(y3-y1);
	}
	public int LengthD(){
		return Math.abs(y4-y2);
	}
	public int Height(){
		return Math.abs(y3-y1);
	}
	public abstract int getArea();

}








