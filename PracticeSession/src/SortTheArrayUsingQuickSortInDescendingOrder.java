import java.util.Arrays;
import java.util.Random;

public class SortTheArrayUsingQuickSortInDescendingOrder
{
    static Random random=new Random();
    public static int[] sort(int[] numbers)
    {
        //sort the numbers using quick sort
        quickSort(numbers,0,numbers.length-1);
        return numbers;
    }
    private static void quickSort(int[] numbers, int first, int last)
    {
        if (first<last)
        {
            // select the pivot point
            int pivotIndex=first+random.nextInt(last-first+1);
            int pivot=numbers[pivotIndex];
            int k=partition(numbers,first,last,pivot);
            // recursively sort the elements to the left of the pivot
            quickSort(numbers,first,k);
            // recursively sort the elements to the right of the pivot
            quickSort(numbers, k+1, last);
        }
    }
    public static int partition(int[] numbers,int first,int last,int pivot)
    {
        int l=first;
        int r=last;
        while (l<=r)
        {
            // In each iteration, we will identify a number
            // from left side which is greater than the pivot
            // value, and also we will identify a number from
            // right side which is less than the pivot value.
            // once the search is done, then we exchange both numbers.
            while (l<=r && numbers[l]>=pivot)
            {
                l++;
            }
            while (l<=r && numbers[r]<pivot)
            {
                r--;
            }
            if (l<=r)
            {
                exchangeNumbers(numbers,l,r);
                // move the index to the next position of the both sides
                l++;
                r--;
            }
        }
        return l-1;
    }
    public static void exchangeNumbers(int[] numbers,int i,int j)
    {
        int temp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=temp;
        // exchange the numbers using XOR, which doesn't require a temp variables
    }
    public static void main(String[] args)
    {
        int[] randomNumbers={2,4,6,8,10,12,14,16,18,20};
        int[] sortedNumbers;
        // selection sort
        sortedNumbers=sort(randomNumbers);
        // print all the numbers in the sorted order by using quick sort
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
