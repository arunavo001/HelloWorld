import java.util.Scanner;
abstract class HomeLoan
{
    double amount;
    int time;
    HomeLoan(double amount,int time)
    {
        this.amount=amount;
        this.time=time;
    }
    abstract double simpleInterest();
}
class Bank1 extends HomeLoan
{
    Bank1(double amount,int time)
    {
        super(amount,time);
    }
    private double getRateOfInterest()
    {
        return 7.2;
    }
    double simpleInterest()
    {
        double principle=super.amount;
        int time=super.time;
        if (principle<=0 || time<=0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        double r=getRateOfInterest();
        double simpleInterest=(principle*r*time)/100;
        return simpleInterest+principle;
    }
}
class Bank2 extends  HomeLoan
{
    Bank2(double amount,int time)
    {
        super(amount,time);
    }
    private double getRateOfInterest()
    {
        return 8.1;
    }
    double simpleInterest()
    {
        double principle=super.amount;
        int time=super.time;
        if (principle<=0 || time<=0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        double r=getRateOfInterest();
        double simpleInterest=(principle* r* time)/100;
        return simpleInterest+principle;
    }
}
public class BankLoanProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        int time=sc.nextInt();
        HomeLoan obj1=new Bank1(amount,time);
        HomeLoan obj2=new Bank2(amount,time);
        if (obj1.simpleInterest()<obj2.simpleInterest())
        {
            System.out.println("File for a loan in 1st bank");
            System.out.println(obj1.simpleInterest());
        }
        else
        {
            System.out.println("File for a loan of 2nd bank");
            System.out.println(obj2.simpleInterest());
        }
    }
}