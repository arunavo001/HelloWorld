import java.util.Scanner;
public class MaximumSumAfterRepeatedlyDividingNByDivisor
{
    static double smallestDivisor(int n)
    {
        double mx=Math.sqrt(n);
        for (int i=2;i<=mx;i++)
            if (n%i==0)
                return i;
        return n;
    }
    static double maxSum(int n)
    {
        long res=n;
        while (n>1)
        {
            double div=smallestDivisor(n);
            n/=div;
            res+=n;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the N : ");
        int N= sc.nextInt();
        System.out.println("After dividing the maximum sum would be : "+maxSum(N));
    }
}