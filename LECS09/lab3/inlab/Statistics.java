import java.util.Scanner; 
public class Statistics{  
    public static double calculateMean(int[] scores) 
    { 
        double sum = 0; 
        for (int score : scores) 
        { 
            sum += score; 
        } 
        return sum / scores.length; 
    } 
 
    // Method to calculate the standard deviation of an array of scores 
    public static double calculateStandardDeviation(int[] scores, double mean)   {         
	double sumOfSquares = 0; 
        	for (int score : scores)  
       	{ 
           	 	sumOfSquares += Math.pow(score - mean, 2); 
        	} 
        		return Math.sqrt(sumOfSquares / scores.length); 
    } 
 
    // Method to calculate the percentage distribution of scores in specified ranges     
    public static int[] calculateRangeCounts(int[] scores) {        
	 int[] rangeCounts = new int[10]; 
         
       	 for (int score : scores)  
        	{ 
            		if (score < 10) rangeCounts[0]++;             
		else if (score < 20) rangeCounts[1]++;             
		else if (score < 30) rangeCounts[2]++;             
		else if (score < 40) rangeCounts[3]++;             
		else if (score < 50) rangeCounts[4]++;             
		else if (score < 60) rangeCounts[5]++;             
		else if (score < 70) rangeCounts[6]++;             
		else if (score < 80) rangeCounts[7]++;             
		else if (score < 90) rangeCounts[8]++;             
		else rangeCounts[9]++; 
        	} 
         
        	return rangeCounts; 
       } 
 
      public static void printSummary(double mean, double stdDev, int[] rangeCounts, int totalScores) 
     { 
        System.out.printf("Class Mean: %.2f%n", mean); 
        System.out.printf("Standard Deviation: %.2f%n", stdDev); 
        System.out.println("Percentage Distribution:"); 
        String[] ranges = {"< 10", "10-19", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79", "80-89", ">= 90"}; 
        for (int i = 0; i < rangeCounts.length; i++) 
        { 
            	double percentage = (rangeCounts[i] * 100.0) / totalScores;             
	System.out.printf("%s: %.2f%%%n", ranges[i], percentage); 
        } 
    } 
 
    public static void main(String[] args) {         
	Scanner sc = new Scanner(System.in); 
        	System.out.print("Enter the number of students (up to 100): ");         
	int numStudents = sc.nextInt(); 
      	  if (numStudents < 1 || numStudents > 100)  
       	 { 
           		 System.out.println("Number of students must be between 1 and 100.");            
		 return; 
       	 } 
      	  int[] scores = new int[numStudents];        
	 System.out.println("Enter the test scores:");        
	 for (int i = 0; i < numStudents; i++) 
        	{ 
           		 scores[i] = sc.nextInt(); 
       	 } 
        	double mean = calculateMean(scores); 
        	double stdDev = calculateStandardDeviation(scores, mean);        
	 int[] rangeCounts = calculateRangeCounts(scores); 
       	 printSummary(mean, stdDev, rangeCounts, numStudents);         sc.close();    
   } 
}