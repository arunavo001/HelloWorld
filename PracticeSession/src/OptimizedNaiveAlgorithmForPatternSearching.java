import java.util.Scanner;
public class OptimizedNaiveAlgorithmForPatternSearching
{
    static void search(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();
        int i = 0;
        while (i <= N - M)
        {
            int j;
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            if (j == M)
            {
                System.out.println("Pattern found at index " + i);
                i = i + M;
            }
            else if (j == 0)
                i = i + 1;
            else
                i = i + j;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the 1st String variable : ");
        String txt = sc.nextLine();
        System.out.println("Enter the value of the 2nd string variable : ");
        String pat = sc.nextLine();
        search(pat, txt);
    }
}