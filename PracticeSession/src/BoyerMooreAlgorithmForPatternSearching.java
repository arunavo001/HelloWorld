public class BoyerMooreAlgorithmForPatternSearching
{
    static int NO_OF_CHARS=256;
    static int max(int b)
    {
        return Math.max(1, b);
    }
    static void badCharHeuristic(char []str, int size, int[] badChar)
    {
        int i;
        for (i=0;i<NO_OF_CHARS;i++)
            badChar[i]=-1;
        for (i=0;i<size;i++)
            badChar[str[i]]=i;
    }
    static void search(char []txt, char []pat)
    {
        int m=pat.length;
        int n=txt.length;
        int[] badChar =new int[NO_OF_CHARS];
        badCharHeuristic(pat,m,badChar);
        int s=0;
        while (s<=(n-m))
        {
            int j=m-1;
            while (j>=0 && pat[j]==txt[s+j])
                j--;
            if (j<0)
            {
                System.out.println("Patterns occur at shift = "+s);
                s+=(s+m<n)?m-badChar[txt[s+m]]:1;
            }
            else
            {
                s+=max(j-badChar[txt[s+j]]);
            }
        }
    }
    public static void main(String[] args)
    {
        char []txt="ABAAABCD".toCharArray();
        char []pat="ABC".toCharArray();
        search(txt,pat);
    }
}