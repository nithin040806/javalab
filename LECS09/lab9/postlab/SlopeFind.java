import java.util.Scanner;
class Point
{
	int x;
	int y;
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void slope()
	{
		System.out.println("The slope is "+((int)y/x));
	}
}
class SlopeFind
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x1:");
		int x1=sc.nextInt();
		System.out.print("Enter y1:");
		int y1=sc.nextInt();
		System.out.print("Enter x2:");
		int x2=sc.nextInt();
		System.out.print("Enter y2:");
		int y2=sc.nextInt();
		Point p=new Point(Math.abs(x2-x1),Math.abs(y2-y1));
		p.slope();
	}
}