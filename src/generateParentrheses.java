public class generateParentrheses
{
    public static void main(String[] args)
    {
        int n=3;
        char[] str=new char[2*n];
        backtrack(str,0,n,0,0);
    }
    private static void backtrack(char[] str,int pos, int n, int open,int close) {
        if (close == n)
        {
            for (char c : str)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        else
        {
            if(open>close)
            {
                str[pos]=')';
                backtrack(str,pos+1,n,open,close+1);
            }
            if(open<n)
            {
                str[pos]='(';
                backtrack(str,pos+1,n,open+1,close);
            }
        }
    }
}
