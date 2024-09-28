import java.util.*;
interface Test
{
void square(long num);
}
class Arithemetic implements Test
{
public void square(long num)
{
System.out.println(num*num);
}
}
class ToTestInt
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
long n=sc.nextLong();
Test num=new Arithemetic();
num.square(n);
}
}