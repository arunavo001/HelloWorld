import java.util.Scanner;
public class WordWrapProblem
{
    static void solveWordWrap(int []arr,int n,int k)
    {
        int i,j;
        int currentLen;
        int cost;
        int []dp=new int[n];
        int []ans=new int[n];
        dp[n-1]=0;
        ans[n-1]=n-1;
        for (i=n-2;i>=0;i--)
        {
            currentLen=-1;
            dp[i]=Integer.MAX_VALUE;
            for (j=i;j<n;j++)
            {
                currentLen+=(arr[j]+1);
                if (currentLen>k)
                    break;
                if (j==n-1)
                    cost=0;
                else
                    cost=(k-currentLen)*(k-currentLen)+dp[j+1];
                if (cost<dp[i])
                {
                    dp[i]=cost;
                    ans[i]=j;
                }
            }
        }
        i=0;
        while (i<n)
        {
            System.out.println((i+1)+" "+(ans[i]+1)+" ");
            i=ans[i]+1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array elements which you want to insert into the array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int length=arr.length;
        System.out.println("Enter the value of the Mth element : ");
        int M=sc.nextInt();
        solveWordWrap(arr,length,M);
    }
}