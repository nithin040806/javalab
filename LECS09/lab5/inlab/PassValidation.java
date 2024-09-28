import java.util.Scanner;
import java.util.StringTokenizer;
class Password
{
boolean Checker(String x)
{
char ch;
boolean checkupal=false;
boolean checklowal=false;
boolean checknum=false;
boolean checkchar=false;
for(int i=0;i<x.length();i++)
{
ch=x.charAt(i);
if(ch>='0'&&ch<='9'){
checknum=true;
}
else if(ch>='A'&&ch<='Z'){
checkupal=true;
}
else if(ch>='a'&&ch<='z'){
checklowal=true;
}
else if(ch=='$' || ch=='#' || ch=='@'){
checkchar=true;
}
if(checknum&&checkupal&&checklowal&&checkchar){
return true;
}
}
return false;
}
}
class PassValidation
{
public static void main(String args[])
{
Password obj=new Password();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the stream of Passwords:");
String pw=sc.nextLine();
System.out.println("");
StringTokenizer token=new StringTokenizer(pw,",");
while(token.hasMoreTokens())
{
String s=token.nextToken();
int len=s.length();
if(len>=6&&len<=12)
{
if(obj.Checker(s))
System.out.println(s+" is a valid password");
else
System.out.println(s+" invalid!!");
}
else
System.out.println(s+" invalid!!");
}
}
}