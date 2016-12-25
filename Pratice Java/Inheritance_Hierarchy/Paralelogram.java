package Inheritance_Hierarchy;

public class Paralelogram extends Trapezoid{
	public int Side;
	public int Height;
	public Paralelogram(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(x1, y1, x2, y2, x3, y3,0,0);
		Side=LengthA();
		Height=Height();
	}

	public int getArea(){
		return Side*Height;
	}

}
