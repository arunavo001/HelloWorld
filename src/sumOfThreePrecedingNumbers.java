import java.util.Scanner;
public class sumOfThreePrecedingNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for this calculation : ");
        int n=sc.nextInt();
        System.out.println("Sum of three preceding number is : "+fib(n));
    }
    static int fib(int n)
    {
        int[] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        f[2]=2;
        for(int i=3;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2]+f[i-3];
        }
        return f[n-1];
    }
}
