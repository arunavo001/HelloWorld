import java.util.Scanner;
public class FindTransitionPoint
{
    int transitionPoint(int[] arr, int n)
    {
        if (arr[0] == 1)
        {
            return 0;
        }
        // Initialise lower and upper-bounds
        int lb = 0, ub = n - 1;
        // Perform Binary search
        while (lb <= ub)
        {
            // Find mid
            int mid = (lb + ub) / 2;
            // update lower_bound if mid contains 0
            if (arr[mid] == 0) lb = mid + 1;
                // If mid contains 1
            else if (arr[mid] == 1)
            {
                // Check if it is the left most 1
                // Return mid, if yes
                if (arr[mid - 1] == 0) return mid;
                // Else update upper_bound
                ub = mid - 1;
            }
        }
        return -1;
    }
}
class sortedArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of testcases you want to perform : ");
        int T=sc.nextInt();
        while (T>0)
        {
            System.out.println("Enter the size of the array : ");
            int n=sc.nextInt();
            int[] arr =new int[n];
            System.out.println("Enter the array elements which you want to insert in the array : ");
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            FindTransitionPoint obj=new FindTransitionPoint();
            System.out.println("The transition point efficiently is : "+obj.transitionPoint(arr,n));
            T--;
        }
    }
}