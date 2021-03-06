public class palindromepartition {
    static int minPalPartion(String str) {
        // Get the length of the string
        int n = str.length();
        int[][] C = new int[n][n];
        boolean[][] P = new boolean[n][n];

        int i, j, k, L; // different looping variables

        // Every substring of length 1 is a palindrome
        for (i = 0; i < n; i++) {
            P[i][i] = true;
            C[i][i] = 0;
        }
        for (L = 2; L <= n; L++) {
            for (i = 0; i < n - L + 1; i++) {
                j = i + L - 1; // Set ending index
                if (L == 2)
                    P[i][j] = (str.charAt(i) == str.charAt(j));
                else
                    P[i][j] = (str.charAt(i) == str.charAt(j)) && P[i + 1][j - 1];

                // IF str[i..j] is palindrome, then
                // C[i][j] is 0
                if (P[i][j] == true)
                    C[i][j] = 0;
                else {
                    C[i][j] = Integer.MAX_VALUE;
                    for (k = i; k <= j - 1; k++)
                        C[i][j] = Integer.min(C[i][j],
                                C[i][k] + C[k + 1][j] + 1);
                }
            }
        }
        return C[0][n - 1];
    }

    // Driver program to test above function
    public static void main(String args[]) {
        String str = "ababbbabbababa";
        System.out.println("Min cuts needed for "
                + "Palindrome Partitioning is " + minPalPartion(str));
    }
}