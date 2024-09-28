import placements.*;
import java.util.*;
class PlacementCount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of years:");
		int a=sc.nextInt();
		NumberOfPlacements obj[]=new NumberOfPlacements[a];
		try
		{
			for(int i=0;i<a;i++)
			{
				obj[i]=new NumberOfPlacements();
				obj[i].read_data();
			}
			int count=0;
			for(int i=0;i<a;i++)
			{
				count=count+obj[i].noplacements;
			}
			System.out.println("Total number of placements:"+count);
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid input");
		} 
	}
}