import java.util.*;  
class Family {     
	private double income;     
	 private int size; 
    	public Family(double income, int size) {         
	 	this.income = income;         
		this.size = size; 
    	} 
    	public boolean isPoor(double housingCost, double foodCost) {          
		return (housingCost + foodCost * size) > (0.5 * income); 
    	} 
    	public String toString() { 
        		return "Family [Income: " + income + ", Size: " + size + "]"; 
   	 } 
  	  public static void main(String[] args) {        
		 Scanner scanner = new Scanner(System.in);         
		System.out.print("Enter the number of families: ");  
       		 int k = scanner.nextInt(); 
        		Family[] families = new Family[k]; 
       		 for (int i = 0; i < k; i++) { 
            			System.out.print("Enter income for family " + (i + 1) + ":");            
			 double income = scanner.nextDouble(); 
            			System.out.print("Enter size for family " + (i + 1) + ":"); 
            			int size = scanner.nextInt();
			 families[i] = new Family(income, size); 
       		 } 
       		 System.out.print("Enter average housing cost: ");         
		double housingCost = scanner.nextDouble(); 
        		System.out.print("Enter average food cost per person: ");          
		double foodCost = scanner.nextDouble();         
		System.out.println("Families considered poor:");          
		for (Family family : families) { 
           		 	if (family.isPoor(housingCost, foodCost)) { 
                				System.out.println(family); 
            			} 
        		} 
       		 scanner.close(); 
    	} 
} 
