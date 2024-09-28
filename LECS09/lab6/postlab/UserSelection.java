import java.util.*;
interface EmployeeDetails
{
    void enterData();
    void displayData();
    void exit();
    void menu();
}
class UserSelection implements  EmployeeDetails
{
    String name;
    int id;
    int salary;
    boolean choice=true;
    public void enterData()
    {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter EmployeeName:");
        String s=sc.nextLine();
        System.out.println("enter EmployeeId:");
        String s1=sc.nextLine();
        int a=Integer.parseInt(s1);
        System.out.println("enter EmployeeSalary:");
        String s2=sc.nextLine();
        int b=Integer.parseInt(s2);
        name=s;
        id=a;
        salary=b;
        choice=true;
        }
        catch(Exception e)
        {
            System.out.println("\"invalid number of arguments\"");
        }
    }
    public void displayData()
    {
        System.out.println("Employee Name:"+name+"\n"+"Employee Id:"+id+"\n"+"Employee Salary:"+salary+"\n");
    }
    public void exit()
    {
        choice=false;
    }
    public void menu()
    {
        Scanner sc=new Scanner(System.in);
            while(choice)
            {
                System.out.println("\n"+"1.Enter Data"+"\n"+"2.Display Data"+"\n"+"3.exit"+"\n");
                System.out.println("Enter your choice:");
                int c=sc.nextInt();
                switch(c)
                {
                    case 1:enterData();
                    break;
                    case 2:displayData();
                    break;
                    case 3:exit();
                    break;
                    default:System.out.println("Invalid choice");
                }
            }
    }
    public static void main(String[] args) {
        EmployeeDetails emp=new UserSelection();
        emp.menu();
    }
}