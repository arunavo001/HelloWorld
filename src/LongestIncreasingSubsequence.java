import java.util.Scanner;
public class LongestIncreasingSubsequence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements which you want to insert in the array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The longest increasing subsequence of the unsorted array is : "+longestIncreasingSubsequence(arr));
    }
    private static int longestIncreasingSubsequence(int[] arr)
    {
        int n=arr.length;
        int[] lis=new int[n];
        for(int i=0;i<n;i++)
        {
            lis[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && lis[i]<lis[j]+1)
                {
                    lis[i]=lis[j]+1;
                }
            }
        }
        int maxLen=0;
        for(int i=0;i<n;i++)
        {
            if(maxLen<lis[i])
            {
                maxLen=lis[i];
            }
        }
        return maxLen;
    }
}
