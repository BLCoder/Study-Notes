package Inheritance_Hierarchy;

public class Trapezoid extends Quadrilateral {
	public int SideA;
	public int SideB;
	public int MainHeight;
	public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4,int y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		SideA=LengthA();
		SideB=LengthB();
		MainHeight=Height();
	}
	public int getArea(){
		//System.out.println(((SideB+SideA)/2)*MainHeight);
		return ((((SideA+SideB)/2)*MainHeight));
	}

	
}
