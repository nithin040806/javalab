
import java.util.Scanner; 
class LeftRotate 
{ 
	 public static void main(String [] args) 
	 { 
	 	  	 	int i; 
	 	 Scanner sc =new Scanner(System.in); 
	 	 System.out.println("enter the size of array"); 
	 	 int size=sc.nextInt(); 
	 	 int []a= new int[size]; 
 
 
	 	 System.out.println("enter  elements in array"); 
	 	 for(i=0;i<size;i++) 
	 	 { 
	 	  	a[i]=sc.nextInt(); 
	 	 } 
 		 System.out.println("enter no of digits shifted");  	 int shift=sc.nextInt(); 
	 	 System.out.println("the elements before  shifting :"); 
	 	 for(int k=0;k<a.length;k++) 
	 	 { 
	 	  	System.out.print(a[k]+" "); 
	 	 } 
 
	 	 for(i=0;i<shift;i++) 
 		 { 	int t=a[0];  	  	
			for(int j=0;j<size-1;j++) 
	 	  	{ 
 	  	 	 
	 	  	 	a[j]=a[j+1]; 
 	  	 	 
	 	  	} 
	 	  	a[size-1]=t; 
	 	 } 
	 	 System.out.println("the elements after shifting :"); 
	 	 for(i=0;i<size;i++) 
	 	 { 
	 	  	System.out.print(a[i]+" "); 
	 	 } 
	 	} 
} 
