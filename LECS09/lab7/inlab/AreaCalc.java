import shape.*;
import java.util.*;
class AreaCalc
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height:");
		int height=sc.nextInt();
		int width=sc.nextInt();
		Triangle t=new Triangle(height,width);
		Rectangle r=new Rectangle(height,width);
		Square s=new Square(height,width);
		t.area();
		r.area();
		s.area(); 
	}
}