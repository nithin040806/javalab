import java.util.*;
class Guess
{
	final String guesscode="53840";
	String guessing_code;
	int no_correct,sum;
	void validate(String s)
	{
		guessing_code=s;
		int c=0;
		int d=0;
		sum=0;
		while(c<guessing_code.length() && d<guesscode.length())
		{

			if(guessing_code.charAt(c)==guesscode.charAt(d))
			{
				no_correct+=1;
				sum+=Integer.parseInt(guessing_code.charAt(c)+"");
			}
			c=c+1;
			d=d+1;
		}
		System.out.println(no_correct+"and"+sum);
	}
}
class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=5;
		int c=0;
		while(true)
		{
			try
			{
				if(c<count)
				{
					Guess guess=new Guess();
					System.out.println("enter code to quess");
					String s=sc.next();
					guess.validate(s);
				}
				else
				{
					throw new ArithmeticException();
				}
				c=c+1;
			}
			catch(ArithmeticException e)
			{
				System.out.println("your try's are over");
				break;
			}
		}
	}
}