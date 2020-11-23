import java.util.Scanner;
public class MinimizeArrayLengthByRepeatedlyReplacingCoPrimePairsWithOne
{
    static int gcd(int a,int b)
    {
        return b==0?a:gcd(b,a%b);
    }
    static boolean hasCoPrimePair(int []arr,int n)
    {
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (gcd(arr[i],arr[j])==1)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth number ");
        int N=sc.nextInt();
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements which you want to insert into the array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if (hasCoPrimePair(arr,N))
        {
            System.out.print(1+"\n");
        }
        else
        {
            System.out.print("No of pairs will appear : "+n+"\n");
        }
    }
}