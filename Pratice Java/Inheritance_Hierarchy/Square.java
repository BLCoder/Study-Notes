package Inheritance_Hierarchy;

public class Square extends Rectangle{
	public int MainLength;
	public Square(int x1,int y1,int x2,int y2){
		super(x1, y1, x2, y2,0,0);
		MainLength=LengthA();
	}
	@Override
	public int getArea(){
		return (int) Math.pow(MainLength, 2);
	}
}
