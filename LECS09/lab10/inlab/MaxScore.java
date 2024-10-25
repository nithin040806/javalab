import java.io.*;
import java.util.*;
class MaxScore
{
	public static void main(String[] args)
	{
		int max=Integer.MIN_VALUE;
		try
		{
			Scanner sc=new Scanner(new File("scores.txt"));
			int c;
			while((c=sc.nextInt())!=-1)
			{
				if(c>max)
				{
					max=c;
				}
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not found");
		}
		catch(NoSuchElementException e)
		{
			if(max==Integer.MIN_VALUE)
			{
				System.out.println("no max element");
			}
			else
			{
				System.out.println("The Highest Score is "+max);
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}