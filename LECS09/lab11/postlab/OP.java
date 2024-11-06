class Ex extends Thread
{
	public void run()
	{
		try{  
Thread.sleep(1000);  
System.out.println("task");  
}catch(InterruptedException e){  
throw new RuntimeException("Thread interrupted..."+e);  
} 
	}
}
class Op
{
	public static void main(String[] args)
	{
		Ex ob=new Ex();
		ob.start();
		System.out.println(ob.isInterrupted());
	}
}