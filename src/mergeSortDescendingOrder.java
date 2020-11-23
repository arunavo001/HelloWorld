import java.util.Collections;
import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;
public class mergeSortDescendingOrder
{
    public static void mergeArrays(Integer[] arr1, Integer[] arr2, int n1,
                                   int n2, Integer[] arr3)
    {
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
    public static void main(String ss[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the 1st array");
        int size1 = scanner.nextInt();
        Integer array1[] = new Integer[size1];
        System.out.println("Enter the elements for the 1st array");
        for (int i = 0; i < size1; i++)
        {
            array1[i] = scanner.nextInt();
        }
        int n1 = array1.length;
        System.out.println("Enter the size of the 2nd array");
        int size2 = scanner.nextInt();
        Integer array2[] = new Integer[size2];
        System.out.println("Enter the elements for the 2nd array");
        for (int j = 0; j < size2; j++)
        {
            array2[j] = scanner.nextInt();
        }
        int n2 = array2.length;
        Integer[] arr3 = new Integer[n1 + n2];
        mergeArrays(array1, array2, n1, n2, arr3);
        Arrays.sort(arr3, Collections.reverseOrder());
        for (int i = 0; i < (n1 + n2); i++)
        {
            System.out.println(arr3[i]);
        }
    }
}