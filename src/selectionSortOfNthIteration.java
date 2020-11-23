import java.util.Scanner;
import java.util.Arrays;
public class selectionSortOfNthIteration
{
    private static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx])
                {
                    minIdx = j;
                }
            int temp = arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
            if(i==1)
            {
                print(arr);
            }
        }
    }
    private static void print(int[] arr)
    {
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{25, 47, 11, 65, 1};
        sort(arr1);
        print(arr1);
       // int[] arr2 = new int[]{14, 83, 25, 47, 9, 77, 1};
        //sort(arr2);
        //print(arr2);
    }
}
