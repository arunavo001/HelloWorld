import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
public class BuyTicketProblem
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int N=200005;
    public static int[]a=new int[N];
    public static int[]b=new int[N];
    public static class Pair implements Comparable<Pair>
    {
        public Integer first;
        public Integer second;
        Pair(Integer first,Integer second)
        {
            this.first=first;
            this.second=second;
        }
        public int compareTo(Pair o)
        {
            if (!first.equals(o.first))
            {
                if (first>o.first)return 1;
                return -1;
            }
            if (!second.equals(o.second))
            {
                return 1;
            }
            return 0;
        }
    }
    public static void main(String[] args)
    {
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a,0,n);
        int mx=2000000007;
        for (int i=0;i<a[0];i++)
        {
            b[i]=mx;
        }
        TreeSet<Pair> s= new TreeSet<>();
        for (int i=0;i<n;i++)
        {
            if (b[a[i]%a[0]]==mx)
            {
                b[a[i]%a[0]]=a[i];
                s.add(new Pair(a[i],a[i]%a[0]));
            }
        }
        while (!s.isEmpty())
        {
            Pair x=s.pollFirst();
            for (int i=0;i<n;i++)
            {
                assert x != null;
                if (b[(a[i]+x.second)%a[0]]>x.first+a[i])
                {
                    b[(a[i]+x.second)%a[0]]=x.first+a[i];
                    s.add(new Pair(x.first+a[i],(a[i]+x.second)%a[0]));
                }
            }
        }
        int x=sc.nextInt();
        int temp=x;
        for (int i=0;i<a[0];i++)
        {
            if (b[i]<=x)
            {
                temp-=(b[i]-1)/a[0];
            }
            else
            {
                if (i<=(x%a[0]))
                {
                    temp-=((x-1)/a[0]+(i!=0 ? 1:0));
                }
                else
                {
                    temp-=x/a[0];
                }
            }
        }
        out.println(temp);
    }
}