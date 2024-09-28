import java.util.*;
class CodeChecking
{
	String name;
	int len;
	void Create()
	{
		System.out.println("Enter the Code name:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		len=0;
		while(true)
		{
			try
			{
				int a=name.charAt(len);
				if(a!=-1)
				{
					len=len+1;
				}
			}
			catch(Exception e)
			{
				break;
			}
		}
		Boolean a=check(name);
		if(a==false)
		{
			System.out.println("invalid code name:");
			Create();
		}
	}
	boolean check(String s)
	{
	if(len>6 && ((s.charAt(len-1)=='x')  || (s.charAt(len-1)=='X')) && (s.startsWith("Agent") ||s.startsWith("agent")))
	{
		return true;
	}
	else
	{
	return false;
	}
	}
	
}
class CodeName
{
	public static void main(String []args)
	{
		CodeChecking obj=new CodeChecking();
		obj.Create();
		System.out.println("re enter the code name:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.equals(obj.name))
		{
			System.out.println("code name conformed");
		}
		else
		{
			System.out.println("code name mis matched");
		}
		
	}
}