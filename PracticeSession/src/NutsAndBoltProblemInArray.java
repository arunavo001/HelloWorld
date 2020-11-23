import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new NutsAndBoltProblemInArray().matchPairs(nuts, bolts);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
class NutsAndBoltProblemInArray{
    void matchPairs(char[] nuts, char[] bolts) {
        char[] com = {'!', '#', '$', '%', '&', '*', '@', '^', '~'};
        int index = 0, index2 = 0;
        for (char c : com) {
            for (int j = 0; j < nuts.length; j++) {
                if (c == nuts[j]) {
                    char temp = nuts[index];
                    nuts[index] = nuts[j];
                    nuts[j] = temp;
                    index++;
                }
                if (c == bolts[j]) {
                    char temp = bolts[index2];
                    bolts[index2] = bolts[j];
                    bolts[j] = temp;
                    index2++;
                }
            }
        }
    }
}