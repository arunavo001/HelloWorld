import java.util.Scanner;
public class PartitionOfArrayIntoKAdjacentGroupForCalculatingMaxAvgSum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements which you want to insert : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of groups you want to make :10");
        int k=sc.nextInt();
        maxAverageSum(arr,n,k);
    }
    static void maxAverageSum(int arr[],int n,int k)
    {
        double prefixSum[]=new double[n+1];
        prefixSum[0]=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                System.out.println("Invalid Input");
                return;
            }
            prefixSum[i+1]=prefixSum[i]+arr[i];
        }
        double dp[]=new double[n];
        for(int i=0;i<n;i++)
        {
            dp[i] = (prefixSum[n] - prefixSum[i]) / (n - i);
        }
        for(int l=0;l<k-1;l++)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = i + 1; j < n; j++)
                {
                    dp[i] = Math.max(dp[i], (prefixSum[j] - prefixSum[i]) / (j - i) + dp[j]);
                }
            }
        }
        System.out.println("The average maximum sum after array partition is : "+(int)dp[0]);
    }
}