 import java.io.*;  
 class Invoice { 
	 BufferedReader 	br 	= 	new 	BufferedReader(new InputStreamReader(System.in)); 
 String part_num; String part_des;  int no_of_items;  double price_of_items;  double amount; 
 Invoice()  { 
  	part_num="100";   	part_des="charger";   	no_of_items=0;   	price_of_items=1000; 
 } 
 public String get_part_num() throws IOException 
 { 
	  	System.out.println("Enter the part name"); 
  	part_num=br.readLine();   	return part_num; 
 } 
 public String get_part_des() throws IOException 
 { 
	  	System.out.println("Enter the part description"); 
  	part_des=br.readLine();   	return part_des; 
 } 
 public int get_no_of_items() throws IOException 
 { 
  	System.out.println("Enter the Number of items");   	
	no_of_items=Integer.parseInt(br.readLine()); 
	  	return no_of_items; 
 } 
 public double get_price_of_items() throws IOException 
 { 
  	System.out.println("Enter the Price of item");   	
	price_of_items=Double.parseDouble(br.readLine()); 
	  	return price_of_items; 
 } 
 public String set_part_num(String num) 
 { 
  	part_num=num;   	
	return part_num; 
 } 
 public String set_part_des(String des) 
 { 
  	part_des=des;   	
	return part_des; 
 } 
 public int set_no_of_items(int numitems)  { 
  	no_of_items=numitems;   	
	return no_of_items; 
 } 
 public double set_price_of_items(double price) 
 { 
	  	price_of_items=price; 
		return price_of_items; 
 } 
 public double getInvoiceAmount() 
 { 
	  	amount=price_of_items*no_of_items; 
		amount=(amount>0)?amount:0; 
		return amount; 
 } 
 public void displayInfo() 
 { 
	  	System.out.println("Part Number:"+part_num+"\nPart Description:"+part_des+"\nNo_of_items:"+no_of_items+"\nPrice of Items:"+price_of_items);   	
		System.out.println("Amount:"+amount); System.out.println();  } 
} 
 
class InvoiceTest 
{ 
 public static void main(String[] arg)throws IOException 
 { 
  	BufferedReader 	br=new 	BufferedReader(new InputStreamReader(System.in));   	
	Invoice 	inv1=new 	Invoice(); 	
	inv1.get_part_num(); 	
	inv1.get_part_des(); 
	inv1.get_no_of_items(); 
	inv1.get_price_of_items();   	
	inv1.getInvoiceAmount(); 
  	System.out.println(" ");   
	inv1.displayInfo(); 
 } 
} 
