import java.util.Arrays;
public class nthSortestElement
{
    public static int Smallest(int[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args)
    {
        int arr[] = new int[] { 12, 3, 5, 7, 19,2,6 };
        int k = 4;
        System.out.print("K'th smallest element is " + Smallest(arr, k));
    }
}
