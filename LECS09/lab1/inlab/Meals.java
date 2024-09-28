import java.util.Scanner;
public class Meals{
public static void main(String[] args){		
Scanner sc=new Scanner(System.in);
		System.out.println("enter the meals price:");
		double price=sc.nextDouble();
		System.out.println("enter the tax percentage:");
		int tax=sc.nextInt();
		System.out.println("enter the tip percentage:");
		int tip=sc.nextInt();
		double Tax=price*tax/100;
		double Tip=price*tip/100;
		double bill=price+tip+tax;
		int value=(int)bill;
		System.out.println("the total bill:"+bill);
		sc.close();
	}
}
