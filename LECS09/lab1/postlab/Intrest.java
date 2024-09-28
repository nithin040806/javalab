import java.util.Scanner;
public class Intrest
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the amount to be deposit:");
	    double balance=sc.nextDouble();
	    double interest=0,interest_amount=0;
	    int i=0;
	    while(i<12)
	    {
	        if(balance<=110000)
	        {
	            interest=0.01;
	            interest_amount=balance*interest;
	        }
	        else if(balance>110000 && balance<=125000)
	        {
	            interest=0.015;
	            interest_amount=balance*interest;
	        }
	        else if(balance>=125000)
	        {
	            interest=0.02;
	            interest_amount=balance*interest;
	        }
	        balance=balance+1000+interest_amount;
	        System.out.println("month:"+(i+1)+"\n"+"interest rate:"+ interest+"\n"+"amount of interest:"+interest_amount+"\n"+"new balance:"+balance);
	        i++;
	    }
	}
}