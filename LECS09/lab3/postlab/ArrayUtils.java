         import java.util.Scanner; 
public class ArrayUtils { 
    	public static int maxInRange(int[] array, int lowIndex, int highIndex) {        
		 if (lowIndex == highIndex) { 
           		 	return array[lowIndex]; 
                 		}  
       	 int midIndex = (lowIndex + highIndex) / 2;         
	 int maxLeft = maxInRange(array, lowIndex, midIndex);        
	 int maxRight = maxInRange(array, midIndex + 1, highIndex);          
	return Math.max(maxLeft, maxRight); 
    	} 
	public static int max(int[] array) { 
       		 if (array == null || array.length == 0) { 
           			 throw new IllegalArgumentException("Array cannot be null or empty"); 
       		 } 
       		 return maxInRange(array, 0, array.length - 1); 
   		 } 
     	public static void main(String[] args) {         
		Scanner scanner = new Scanner(System.in); 
         		System.out.print("Enter the number of elements in the array: ");        
		 int n = scanner.nextInt();         
		 int[] array = new int[n]; 
         		System.out.println("Enter the elements of the array:");        
		 for (int i = 0; i < n; i++) {             
			array[i] = scanner.nextInt(); 
		}       
 		 try { 
            			int maxValue = max(array); 
            			System.out.println("The maximum value in the array is: " + maxValue); 
        		} catch (IllegalArgumentException e) { 
            			System.out.println(e.getMessage()); 
        		} 
	     	scanner.close(); 
   	 } 
} 
