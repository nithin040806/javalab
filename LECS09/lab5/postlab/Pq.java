import java.util.Scanner;
public class Pq {
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("enter the string");
String s = scan.nextLine();
int a=s.indexOf("pq"),b=s.indexOf("qp");
if(a!=-1 && b==-1)
{
System.out.println("The string is pq-balanced?:true");
}
else
{
System.out.println("The string is pq-balanced?:false");
}
}
}
