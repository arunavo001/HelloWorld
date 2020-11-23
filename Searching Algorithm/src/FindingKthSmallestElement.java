import java.util.Random;
import java.util.Scanner;
public class FindingKthSmallestElement
{
    static int kthSmallest(int[] arr, int l, int r, int k)
    {
        // If k is smaller than number of elements in array
        if (k > 0 && k <= r - l + 1)
        {
            // partitioning the array along the pivot
            int pos = randomPartition(arr, l, r);
            // check if current element gives you the kth smallest element
            if (pos-l == k-1)
                return arr[pos];
            // else recurse for the left and right half accordingly
            if (pos-l > k-1)
                return kthSmallest(arr, l, pos-1, k);
            return kthSmallest(arr, pos+1, r, k-pos+l-1);
        }
        return Integer.MAX_VALUE;
    }
    static int partition(int[] arr, int l, int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++)
        {
            if (arr[j] <= x)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[r];
        arr[r] = arr[i];
        arr[i] = temp;
        return i;
    }
    // Function to partition the array along the random pivot
    static int randomPartition(int[] arr, int l, int r)
    {
        Random rand = new Random();
        int n = r-l+1;
        int pivot = rand.nextInt(n);
        int temp = arr[r];
        arr[r] = arr[l+pivot];
        arr[l+pivot] = temp;

        return partition(arr, l, r);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of testcases : ");
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.println("Enter the size of the array : ");
            int n=sc.nextInt();
            int[] arr =new int[n];
            System.out.println("Enter the number of elements which you want to insert in the array : ");
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println("Enter the kth element value :");
            int k=sc.nextInt();
            System.out.println("The kth smallest element in the array is : "+kthSmallest(arr,0,n-1,k));
        }
    }
}