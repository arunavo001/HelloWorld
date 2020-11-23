import java.util.Arrays;
import java.util.Scanner;
public class UniqueBirthdayGiftProblem {
    public static int differentArrays(int n, int l) {
        int[] arr1 = new int[2000];
        int[] arr2 = new int[2000];
        for (int i = 1; i <= n; i++) {
            arr1[i] = 1;
        }

        for (int i = 1; i < l; i++) {
            Arrays.fill(arr2, 0);
            for (int j = 1; j <= n; j++) {
                for (int k = j; k <= n; k += j) {
                    arr2[k] += arr1[j];
                    if (arr2[k] >= 10000) {
                        arr2[k] -= 10000;
                    }
                }
            }
            for (int j = 1; j <= n; j++) {
                arr1[j] = arr2[j];
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = (ans + arr1[i]) % 10000;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int k;
        k = scan.nextInt();
        int result;
        result = differentArrays(n, k);
        System.out.print(result);
        return;
    }
}