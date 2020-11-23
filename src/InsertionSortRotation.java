import java.io.PrintWriter;
import java.util.Scanner;
public class InsertionSortRotation
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int n;
    public static int[] tree;
    public static int[] a;
    public static int[] b;
    public static int N=200005;
    public static int read(int x)
    {
        int ret=0;
        while (x>0)
        {
            ret+=tree[x];
            x-=(x&-x);
        }
        return ret;
    }
    public static void upd(int x)
    {
        while (x<N)
        {
            tree[x]++;
            x+=(x&-x);
        }
    }
    public static void main(String[] args)
    {
        tree=new int[N];
        a=new int[N];
        b=new int[N];
        int n=sc.nextInt();
        long cur=0;
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            upd(a[i]);
            cur+=i+1-read(a[i]);
            b[a[i]]++;
        }
        for (int i=1;i<N;i++)
            b[i]+=b[i-1];
        long ov_res=cur;
        for (int i=n-1;i>0;i--)
        {
            cur+=b[a[i]-1];
            cur-=(n-b[a[i]]);
            ov_res=Math.min(ov_res,cur);
        }
        int mod=1000000007;
        out.println(ov_res%mod);
    }
}