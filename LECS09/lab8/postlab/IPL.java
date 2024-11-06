import java.util.*; class IPL_Cricket
{
public int played_matches; public int won;
public int loss;
public void played_matches(int x)
{
played_matches=x;
}
public void win(int w)
{
won=w;
}
public void loss(int l)
{
loss=l;
}
}
class Hyd_Sunrisers extends IPL_Cricket
{
public void display()
{
if((won+loss)<=played_matches)
{
System.out.println("Hyd_Sunrisers Summary :"); System.out.println("Played Matches : "+played_matches); System.out.println("Won : "+won); System.out.println("Loss : "+loss);
}
else
System.out.println("Invalid wins and loss");
}
}
class Chennai_SuperKings extends IPL_Cricket
{
public void display()
{
if((won+loss)<=played_matches)
{
System.out.println("Chennai_SuperKings Summary :"); System.out.println("Played Matches : "+played_matches); System.out.println("Won : "+won); System.out.println("Loss : "+loss);
}
else
System.out.println("Invalid wins and loss");
}
}
class IPL
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); Hyd_Sunrisers ob1=new Hyd_Sunrisers();
Chennai_SuperKings ob2=new Chennai_SuperKings(); System.out.print("Enter matches,wins,loss of SRH : "); int x=sc.nextInt();
int a=sc.nextInt(); int b=sc.nextInt();
System.out.print("Enter matches,wins,loss of CSK : "); int y=sc.nextInt();
int p=sc.nextInt(); int q=sc.nextInt(); ob1.played_matches(x); ob1.win(a);
ob1.loss(b); ob1.display(); ob2.played_matches(y); ob2.win(p);
ob2.loss(q); ob2.display();
}
}
