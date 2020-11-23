public class EfficientSearch
{
    static int search(int arr[], int n, int x)
    {
        int i = 0;
        while (i <= n-1)
        {
            if (arr[i] == x)
                return i;
            i += Math.abs(arr[i]-x);
        }
        return -1;
    }
    public static void main (String[] args)
    {
        int arr[] = {10, 11, 10, 9, 10, 11, 10, 9};
        int n = arr.length;
        int x = 25;

        System.out.println(search(arr, n, x));
    }
}
