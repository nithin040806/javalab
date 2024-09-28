import java.util.*;
class MakeString
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter main string:");
		String str=sc.next();
		System.out.println("entre the substring:");
		String sub_str=sc.next();
		int a=str.indexOf(sub_str);
		if(a!=-1)
		{
			System.out.println("The prev and next character of the given sub string");
			System.out.print(str.charAt(str.indexOf(sub_str)-1));
			System.out.println(str.charAt(str.indexOf(sub_str)+sub_str.length()));
		}
		else
		{
			System.out.println("not foud the sub string in the main string");
		}
	}
}