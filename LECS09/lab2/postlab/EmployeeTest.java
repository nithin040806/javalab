import java.util.Scanner; 
 
 class Employee {     				
	private String firstName;     		
	private String lastName; 
    	private double monthlySalary; 
 
    	public Employee(String firstName, String lastName, double monthlySalary) 		{         
		this.firstName = firstName;         
		this.lastName = lastName; 
        		this.monthlySalary = monthlySalary; 
    	} 
 
   	public String getFirstName() { 
        		return firstName; 
    	} 
 
    	public String getLastName() { 
        		return lastName; 
    	} 
 
    	public double getMonthlySalary() { 
       		 return monthlySalary; 
   	} 
 
   	 public void applyRaise(double percentage) {         					
		monthlySalary += monthlySalary * percentage / 100;   
	} 

   	 public double getYearlySalary() { 
       	 	return monthlySalary * 12; 
	} 
} 
public class EmployeeTest { 
    public static void main(String[] args) {          		
	Scanner scanner = new Scanner(System.in); 
        	System.out.println("Enter details for Employee 1:");  
       	 Employee employee1 = createEmployee(scanner);  
        	System.out.println("Enter details for Employee 2:");  
        	Employee employee2 = createEmployee(scanner);  
 
        	System.out.println("\nBefore raise:");         
	displayYearlySalary(employee1, 1); 
        	displayYearlySalary(employee2, 2);  
 
        	employee1.applyRaise(10); 
        	employee2.applyRaise(10);  
 
        	System.out.println("\nAfter 10% raise:");         					
	displayYearlySalary(employee1, 1); 
        	displayYearlySalary(employee2, 2);  
 
       	 scanner.close(); 
    } 
 
    private static Employee createEmployee(Scanner scanner) {  
       	System.out.print("First Name: "); 
        	String firstName = scanner.nextLine();  
        	System.out.print("Last Name: ");  
        	String lastName = scanner.nextLine();         			    
	System.out.print("Monthly Salary: ");         
 	double monthlySalary = scanner.nextDouble();                       
	scanner.nextLine();  // Consume the newline character       
    	 return new Employee(firstName, lastName, monthlySalary); 
    } 
 
    private static void displayYearlySalary(Employee employee, int employeeNumber) {        		
	System.out.printf("Employee %d: %s %s has a yearly salary of $%.2f%n",employeeNumber, employee.getFirstName(), employee.getLastName(), employee.getYearlySalary()); 
    } 
} 
