import restaurant.*;
import java.util.*;
class BillCalc
{
	public static void main(String[] args)
	{
		Menu m=new Menu();
		m.menu();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of idly want to buy:");
		int i=sc.nextInt();
		System.out.println("Enter number of Samosa want to buy:");
		int s=sc.nextInt();
		System.out.println("Enter number of Icecream want to buy:");
		int ic=sc.nextInt();
		Bill b=new Bill();
		b.calcBill(i,s,ic);
	}
}