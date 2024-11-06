import java.util.Scanner;
class Add extends Thread
{
	int a,b;
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":"+"add"+":"+(a+b));
	}
}
class Sub extends Thread
{
	int a,b;
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":"+"sub"+":"+(a-b));
	}
}
class Mul extends Thread
{
	int a,b;
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":"+"mul"+":"+(a*b));
	}
}
class Operations
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a value:");
		int a=sc.nextInt();
		System.out.print("enter b value:");
		int b=sc.nextInt();
		Add add=new Add();
		Sub sub=new Sub();
		Mul mul=new Mul();
		add.a=a;
		add.b=b;
		sub.a=a;
		sub.b=b;
		mul.a=a;
		mul.b=b;
		add.start();
		sub.start();
		mul.start();
	}
}