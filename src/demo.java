import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int minSwaps = minSwapsToGetPermutedArray(arr, temp, n);
        if (minSwaps == -1)
            System.out.println("Not Possible");
        else
            System.out.println(minSwaps);
    }

    // Method to find minimum number of swaps required to sort the array
    static int minSwapsToGetPermutedArray(int[] arr, int[] temp, int n) {
        // Checking if any element is more than 2 positions away from its index
        for (int i = 0; i < n; i++)
            if (arr[i] - 1 - i > 2)
                return -1;
        return findNumberOfInversions(arr, temp, 0, n - 1);
    }

    // Finding number of inversions in the given array
    static int findNumberOfInversions(int[] arr, int[] temp, int l, int r) {
        int mid, numberOfInversions = 0;
        if (l < r) {
            mid = (l + r) / 2;
            // Finding number of inversions in left half
            numberOfInversions = findNumberOfInversions(arr, temp, l, mid);
            // Finding number of inversions in right half
            numberOfInversions += findNumberOfInversions(arr, temp, mid + 1, r);
            int i = l, j = mid + 1, k = l;
            while ((j <= r) && (i <= mid)) {
                if (arr[i] <= arr[j])
                    temp[k++] = arr[i++];
                else {
                    // It results in an inversion
                    temp[k++] = arr[j++];
                    numberOfInversions += (mid + 1 - i);
                }
            }
            // Copying the left over elements of left subArray
            while (i <= mid)
                temp[k++] = arr[i++];
            // Copying the left over elements of right subArray
            while (j <= r)
                temp[k++] = arr[j++];
            for (i = l; i <= r; i++)
                arr[i] = temp[i];
        }
        return numberOfInversions;
    }
}
