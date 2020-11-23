public class WildCardPatternMatchingProblem
{
    static boolean strMatch(char[]txt,char[]pat,int n,int m)
    {
        if (m==0)
            return (n==0);
        int i=0,j=0,index_txt=-1,index_pat=-1;
        while (i<n)
        {
            if (j<m && txt[i]==pat[j])
            {
                i++;
                j++;
            }
            else if (j<m && pat[j]=='?')
            {
                i++;
                j++;
            }
            else if (j<m && pat[j]=='*')
            {
                index_txt=i;
                index_pat=j;
                j++;
            }
            else if (index_pat!=-1)
            {
                j=index_pat+1;
                i=index_txt+1;
                index_txt++;
            }
            else
            {
                return false;
            }
        }
        while (j<m && pat[j]=='*')
        {
            j++;
        }
        return j == m;
    }
    public static void main(String[] args)
    {
        char[] str="baaabab".toCharArray();
        char[] pattern="*****ba*****ab".toCharArray();
        if (strMatch(str,pattern, str.length,pattern.length))
            System.out.println("Yes");
        else
            System.out.println("No");
        char []pattern2="a*****ab".toCharArray();
        if (strMatch(str,pattern2, str.length, pattern2.length))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}