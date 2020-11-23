import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the key which you want to search inside array");
        int k=sc.nextInt();
        System.out.println(LinearSearch(arr,k));
    }
    public static int LinearSearch(int[] arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] == key)
            {
                System.out.println("Matching found and the matching number is :" + arr[i]);
            }
        }
        return 0;
    }
}
