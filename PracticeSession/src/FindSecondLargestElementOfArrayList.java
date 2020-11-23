import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElementOfArrayList
{
    public static void secondLargest(int[] arr)
    {
        int firstLargest;
        int secondLargest;
        firstLargest = Math.max(arr[0], arr[1]);
        secondLargest=arr[1];
        for(int i=2;i<arr.length;i++)
        {
            if (arr[i]>firstLargest)
            {
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            else if (arr[i]<firstLargest && arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }
        }
        System.out.println("Input array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Second largest element is : ");
        System.out.println(secondLargest);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements which you want to insert into the array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        secondLargest(arr);
    }
}