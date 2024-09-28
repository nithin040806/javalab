package shape;
public class Triangle
{
	double height,width;
	public Triangle(double h,double w)
	{
		height=h;
		width=w;
	}
	public void area()
	{
		System.out.println("Area of Traingle:"+(0.5*height*width));
	}
}