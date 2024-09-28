package shape;
public class Square
{
	double height,width;
	public Square(double h,double w)
	{
		height=h;
		width=w;
	}
	public void area()
	{
		if(height==width)
		{
			System.out.println("Area of square:"+(height*width));
		}
		else
		{
			System.out.println("Area of square: Invalid input");
		}
	}
}