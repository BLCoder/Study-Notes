package Inheritance_Hierarchy;

public class Main {

	public static void main(String[] args){
		Square square=new Square(5, 20, 20, 20);
		System.out.println("Total Area of Square is : "+square.getArea());
		Rectangle rectangle=new Rectangle(5, 20, 20, 20, 5, 30);
		System.out.println("Total Area of Rectangle is : "+rectangle.getArea());
		Paralelogram paralelogram=new Paralelogram(5, 20, 20, 20, 10, 30);
		System.out.println("Total Area of Paralelogram is : "+paralelogram.getArea());
		Trapezoid trapezoid=new Trapezoid(5, 20, 20, 20, 10, 30, 15, 30);
		System.out.println("Total Area of Trapezoid is : "+trapezoid.getArea());
	}

}
