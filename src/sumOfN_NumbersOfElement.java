import java.util.Scanner;

public class sumOfN_NumbersOfElement
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("The value of n natural number is : "+sum(n));
    }
    public static  int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sum(n-1);
    }
}
