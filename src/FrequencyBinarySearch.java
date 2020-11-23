import java.util.Scanner;
public class FrequencyBinarySearch {
    static int binarySearch(int[] arr, int l,
                            int r, int x) {
        if (r < l)
            return -1;

        int mid = l + (r - l) / 2;

        if (arr[mid] == x)
            return mid;

        if (arr[mid] > x)
            return binarySearch(arr, l,
                    mid - 1, x);

        return binarySearch(arr, mid + 1, r, x);
    }

    static int countOccurrences(int[] arr,
                                int n, int x) {
        int ind = binarySearch(arr, 0,
                n - 1, x);

        // If element is not present
        if (ind == -1)
            return 0;

        // Count elements on left side.
        int count = 1;
        int left = ind - 1;
        while (left >= 0 &&
                arr[left] == x) {
            count++;
            left--;
        }

        // Count elements
        // on right side.
        int right = ind + 1;
        while (right < n &&
                arr[right] == x) {
            count++;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        FrequencyBinarySearch obj = new FrequencyBinarySearch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements which you want to insert : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the key through which you will compare the other elements : ");
        int key = scanner.nextInt();
        System.out.println("The result of the frequency binary search is : "+countOccurrences(array, size, key));
    }
}