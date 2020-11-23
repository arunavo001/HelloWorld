import java.util.Scanner;

public class calculateThePowerUsingRecursion
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the braces");
        int a=scanner.nextInt();
        System.out.println("Enter the power of that braces");
        int b=scanner.nextInt();
        System.out.println("The power of the number using recursion is :"+power(a,b));
    }
    public static int power(int a, int b)
    {
        if(b==0)
        {
            return 1;
        }
        if(b%2==0)
        {
            return power(a*a, b/2);
        }
        else
        {
            return a * power(a, b - 1);
        }
    }
}
