import java.util.Scanner;
class Account
{
    String cus_name;
    int account_no;
    Account(String c,int ac_no)
    {
         cus_name=c;
        account_no=ac_no;
    }
    public String toString()
    {
        return "Customer name:"+cus_name+"\n"+"Account number:"+account_no+"\n";
    }
}
class customer
{
    String type;
    String b_name;
    customer(String t,String b)
    {
        type=t;
        b_name=b;
    }
    public String toString()
    {
        return "Account type:"+type+"\n"+"Bank name:"+b_name+"\n";
    }
}
class RBI
{
    int min_balance;
    double r;
    double max_withdrawal;
    double dep_amount;
    int months;
    double with_drawal;
    double interest;
    double total;
     RBI(double dep_amount,int n)
     {
        min_balance=2000;
        r=1.0;
        max_withdrawal=20000;
        this.dep_amount=dep_amount;
        months=n;
    }
    void balance()
    {
        interest=dep_amount*months*r*0.01;
        total=dep_amount+interest;
    }
}
class SBH extends RBI
{
    SBH(double dep_amount,int n,double with_drawal_amount)
    {
        super(dep_amount,n);
    with_drawal=with_drawal_amount;
    }
    void balance()
    {
        interest=dep_amount*months*r*0.01;
        total=dep_amount+interest;
        if(with_drawal==0)
        {
            System.out.println("Balance amount:"+total);
        }
        else if(with_drawal<max_withdrawal && with_drawal<=total)
        {
            System.out.println("Debited amount:"+with_drawal);
            System.out.println("Balance amount:"+(total-with_drawal));
        }
        else
        {
            System.out.println("maintain Minimum balance");
        }
    }
}
class ICICI extends RBI
{
    ICICI(double dep_amount,int n,double with_drawal_amount)
    {
        super(dep_amount,n);
        max_withdrawal=20000;
        r=1.5;
        with_drawal=with_drawal_amount;
    }
    void balance()
    {
        interest=dep_amount*months*r*0.01;
        total=dep_amount+interest;
        if(with_drawal==0)
        {
            System.out.println("Balance amount:"+total);
	    System.out.println("interest:"+interest);
        }
        else if(with_drawal<max_withdrawal && with_drawal<=total)
        {
            System.out.println("Debited amount:"+with_drawal);
	    System.out.println("interest:"+interest);
            System.out.println("Balance amount:"+(total-with_drawal));
        }
        else
        {
            System.out.println("maintain Minimum balance");
        }
    }
}
class PNB extends RBI
{
    PNB(double dep_amount,int n,double with_drawal_amount)
    {
        super(dep_amount,n);
        min_balance=2000;
        r=2.0;
        max_withdrawal=20000;
         with_drawal=with_drawal_amount;
    }
    void balance()
    {
        interest=dep_amount*months*r*0.01;
        total=dep_amount+interest;
        if(with_drawal==0)
        {
            System.out.println("Balance amount:"+total);
        }
        else if(with_drawal<=max_withdrawal)
        {
             System.out.println("Debited amount:"+with_drawal);
             System.out.println("Balance amount:"+(total-with_drawal));
        }
        else
        {
            System.out.println("maintain Minimum balance");
        }
    }
}
class AccountBalance
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Name of the customer:");
         String c_name=sc.next();
         System.out.print("Account number:");
         int a_num=sc.nextInt();
         System.out.print("Account type:");
         String a_type=sc.next();
         System.out.print("Bank_Name=");
         String bank_name=sc.next();
         System.out.print("deposit_amount=");
         double dep_amount=sc.nextDouble();
         System.out.print("No_of_Months=");
         int n=sc.nextInt();
         System.out.print("Withdrawal_amount=");
         double with_drawal_amount=sc.nextDouble();
         switch(bank_name)
        {
            case "SBH":
                SBH sbh=new SBH(dep_amount,n,with_drawal_amount);
                sbh.balance();
                 break;
            case "ICICI":
             ICICI icici=new ICICI(dep_amount,n,with_drawal_amount);
                icici.balance();
                break;
            case "PNB":
                PNB pnb=new PNB(dep_amount,n,with_drawal_amount);
                 pnb.balance();
                 break;
        }
    }
}


