import java.io.PrintWriter;
import java.util.Scanner;
public class NumbersOfPairsProblem
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int n;
    public static int[] tree;
    public static int[] a;
    public static int N=200005;
    public static int read(int x)//Binary indexed tree read
    {
        int ret=0;
        while (x>0)
        {
            ret+=tree[x];
            x-=(x&-x);
        }
        return ret;
    }
    public static void upd(int x)// binary indexed tree of upd
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
        int n=sc.nextInt();
        long res=0;
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            res+=read(a[i]-k);
            upd(a[i]);
        }
        int mod=1000000007;
        out.println(res%mod);
    }
}