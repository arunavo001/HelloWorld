import java.util.Scanner;
public class MaxSumInSlidingWindow
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements which you want to insert in the array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the length of window : ");
        int window=sc.nextInt();
        System.out.println("Maximum sum in sliding window is : "+maxSum(arr,window));
    }
    private static int maxSum(int[] arr, int window)
    {
        int start=0;
        int end=window-1;
        int maxSum=0;
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            sum+=arr[i];
        }
        while (end< arr.length-1)
        {
            start++;
            end++;
            sum=sum-arr[start-1]+arr[end];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
