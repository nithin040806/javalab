import java.util.*; class Book
{
String Name;
String Author;
void setdata(String a,String b)
{
Name=a;
Author=b;
}
void display()
{
System.out.println("Name="+Name); System.out.println("Author="+Author);
}
}
class McgrawHill extends Book
{
int price;
void price(int p)
{
this.price=p;
}
void display()
{
System.out.println("McGrawHill Price="+price);
}
}
class Oxford extends Book
{
int price;
void price(int p)
{
this.price=p;
}
void display()
{
System.out.println("Oxford Price="+price);
}
}
class BookDetails
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); Book ob=new Book();
McgrawHill ob1=new McgrawHill(); Oxford ob2=new Oxford();
System.out.println("Enter Book Name : "); String n=sc.nextLine();
System.out.println("Enter Author Name : "); String a=sc.nextLine();
System.out.println("Enter price of MCGrawHill Book: "); int p1=sc.nextInt();
System.out.println("Enter price of Oxford Book: ");
int p2=sc.nextInt(); System.out.println(); System.out.println("Book Details:"); ob.setdata(n,a);
ob.display(); ob1.price(p1); ob1.display(); ob2.price(p2); ob2.display();
}
}
