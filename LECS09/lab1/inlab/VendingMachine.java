import java.util.Scanner; 
 public class VendingMachine { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
int gumCount = 0; 
int chocolateCount = 0; 
int popcornCount = 0;
 int juiceCount = 0; 
boolean running = true; 
do{ 
System.out.println("Select an option:"); 
System.out.println("[1] Get gum"); 
System.out.println("[2] Get chocolate"); 
System.out.println("[3] Get popcorn"); 
System.out.println("[4] Get juice"); 
System.out.println("[5] Display total sold so far"); 
System.out.println("[6] Quit"); 
int choice = sc.nextInt(); 
switch (choice) { 
case 1: gumCount++; 
System.out.println("Here is your gum");
 	break; 
case 2: chocolateCount++;
 	System.out.println("Here is your chocolate"); 
break; 
case 3: popcornCount++; 
System.out.println("Here is your popcorn"); 
break; 
case 4: juiceCount++; 
System.out.println("Here is your juice"); 
break; 
case 5: // Display the total items sold System.out.println(gumCount + " items of gum sold"); 
System.out.println(chocolateCount + " items of chocolate sold"); 
System.out.println(popcornCount + " items of popcorn sold"); 
System.out.println(juiceCount + " items of juice sold"); 
break; 
case 6: running = false; System.out.println("Quitting the program..."); 
break; 
           	default: System.out.println("Error"); 
} 
} while (running) ; 
   } 
} 
