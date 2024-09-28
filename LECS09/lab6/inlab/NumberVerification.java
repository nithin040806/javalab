import java.util.*;
interface Number
{
boolean iszero();
boolean isPositive();
boolean isNegative();
boolean isodd();
boolean iseven();
boolean isprime();
boolean isarmstrong();
}
class Verification implements Number
{
int num;
Verification(int n)
{
num=n;
}
public boolean iszero()
{
return (num==0);
}
public boolean isPositive()
{
if(num!=0)
return num>0;
return false;
}
public boolean isNegative()
{
if(num!=0)
return num<0;
return false;
}
public boolean isodd()
{
return (num%2)==1;
}
public boolean iseven()
{
if(num!=0)
return (num%2)==0;
return false;
}
public boolean isprime()
{
if(num==0)
{
return false;
}
if(num==1)
{
return false;
}
for(int i=2;i<num;i++)
{
if(num%i==0)
{
return false;
}
}
return true;
}
public boolean isarmstrong()
{
int n=num,sum=0,a;
while(n!=0)
{
a=n%10;
sum=sum+(a*a*a);
n=n/10;
}
if(sum==num)
{
return true;
}
return false;
} 
}
public class NumberVerification
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
StringBuffer str=new StringBuffer();
Number number=new Verification(a);
if(number.iszero())
{
str.append("zero and");
}
if(number.isPositive())
{
str.append(" ");
str.append("positive and");
}
if(number.isNegative())
{
str.append(" ");
str.append("negative and");
}
if(number.isodd())
{
str.append(" ");
str.append("odd and");
}
if(number.iseven())
{
str.append(" ");
str.append(" even and");
}
if(number.isprime())
{
str.append(" ");
str.append(" prime and");
}
if(number.isarmstrong())
{
str.append(" ");
str.append(" armstrong");
}
String s=new String(str);
if(s.endsWith("and"))
{
str.delete(str.length()-3,str.length());
}
System.out.println(str);
}
}