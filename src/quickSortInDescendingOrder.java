import java.util.Arrays;
import java.util.Scanner;
public class quickSortInDescendingOrder {
    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);
            merge(numbers, first, mid, last);
        }
        return numbers;
    }

    private static int[] merge(int[] numbers, int i, int m, int j) {
        int l = i; //inital index of first subarray
        int r = m + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] t = new int[numbers.length];
        while (l <= m && r <= j) {
            if (numbers[l] >= numbers[r]) {
                t[k] = numbers[l];
                k++;
                l++;
            } else {
                t[k] = numbers[r];
                k++;
                r++;
            }
        }
        while (l <= m) {
            t[k] = numbers[l];
            k++;
            l++;
        }
        while (r <= j) {
            t[k] = numbers[r];
            k++;
            r++;
        }
        l = i;
        k = 0;
        while (l <= j) {
            numbers[l] = t[k];
            l++;
            k++;
        }
        return numbers;
    }

    public static void main(String args[]) {
        int randomNumbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
