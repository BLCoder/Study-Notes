package Inheritance_Hierarchy;

public class Rectangle extends Paralelogram{
	public int SideA;
	public int SideC;
	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(x1, y1, x2, y2, x3, y3);
		SideA=LengthA();
		SideC=LengthC();
	}
	@Override
	public int getArea(){
		return (SideA*SideC);
	}

	
}
