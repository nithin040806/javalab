import java.util.Scanner;
public class SubstringCheck {
public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String s = scan.nextLine();
String sub_str=s.substring(0,2);
if(s.endsWith(sub_str))
{
System.out.println(s.substring(2,s.length()-2));
}
else
{
System.out.println(s);
}
}
}