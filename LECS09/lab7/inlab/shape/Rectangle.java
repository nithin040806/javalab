package shape;
public class Rectangle
{
	double height,width;
	public Rectangle(double h,double w)
	{
		height=h;
		width=w;
	}
	public void area()
	{
		System.out.println("Area of Rectangle:"+(height*width));
	}
}