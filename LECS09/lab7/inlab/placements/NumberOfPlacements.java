package placements;
import java.util.*;
public class NumberOfPlacements
{
	public int year,noplacements;
	public void read_data() throws NumberFormatException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		year=Integer.parseInt(sc.nextLine());
		System.out.println("Enter no of palcements:");
		noplacements=Integer.parseInt(sc.nextLine());
	}
}