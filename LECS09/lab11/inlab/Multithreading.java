import java.util.*;
import java.io.*;
class  ReadFile1 extends Thread
{
public void run() {
 try(FileInputStream fis = new FileInputStream("personnel.txt"))
{
Scanner sc = new Scanner(fis);
while(sc.hasNextLine())
{
  System.out.println(sc.nextLine());
	try{
	Thread.currentThread().sleep(1000);
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	}
}

}
catch(FileNotFoundException e)
{
System.out.println("file not Found"+e);
}
catch(IOException e)
{
System.out.println(e);
}
}
}
class  ReadFile2 extends Thread
{
public void run() {
 try(FileInputStream fis1 = new FileInputStream("AcadamicRecord.txt"))
{
Scanner sc = new Scanner(fis1);
while(sc.hasNextLine())
{
  System.out.println(sc.nextLine());
	try{
	Thread.currentThread().sleep(1000);
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	}


}

}
catch(FileNotFoundException e)
{
System.out.println("file not Found"+e);
}
catch(IOException e)
{
System.out.println(e);
}

}
}
class Multithreading
{
public static void main(String [] args)
{
ReadFile1 t1=new ReadFile1();
ReadFile2 t2=new ReadFile2();
t1.start();
t2.start();
try{
t1.join();
t2.join();
}
catch(Exception e)
{
System.out.println(e);
}
}
}


