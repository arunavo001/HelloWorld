import java.util.Scanner;
public class SlidingWindowProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements which you want to insert in the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the windows Length : ");
        int windowLength=sc.nextInt();
        System.out.println("The maximum sum of the sliding window is : "+maxSumOfSlideingWindow(arr,windowLength));
    }
    private static int maxSumOfSlideingWindow(int[] arr, int windowLength)
    {
        int start=0;
        int end=windowLength-1;
        int maxLength=0;
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            sum+=arr[i];
        }
        while (end<arr.length-1)
        {
            start++;
            end++;
            sum=sum-arr[start-1]+arr[end];
            maxLength=Math.max(sum,maxLength);
        }
        return maxLength;
    }
}
