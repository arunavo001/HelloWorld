import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class TreeConversionsProblem
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int N=200005;
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
                if (first>o.first)
                {
                    return 1;
                }
                return -1;
            }
            if (!second.equals(o.second))
            {
                if (second>o.second)
                {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
    }
    public static String n;
    public static int mxHeight=0,minHeight=100000;
    public static void solve(int idx, ArrayList<Pair> v)
    {
        int mx=0;
        int fg=0;
        for (Pair value : v) {
            mx = Math.max(mx, value.first);
            if (value.second != 0) {
                fg = 1;
            }
        }
        if (fg==0 ||idx==n.length())
        {
            mxHeight=Math.max(mxHeight,mx);
            minHeight=Math.min(minHeight,mx);
        }
        if (idx<n.length())
        {
            for (int i=0;i<v.size();i++)
            {
                if (v.get(i).second!=0)
                {
                    ArrayList<Pair>v1= new ArrayList<>();
                    for (Pair pair : v) {
                        v1.add(new Pair(pair.first, pair.second));
                    }
                    v1.get(i).second--;
                    v1.add(new Pair(v.get(i).first+1,n.charAt(idx)-'0'));
                    solve(idx+1,v1);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        n=sc.nextLine();
        ArrayList<Pair> v= new ArrayList<>();
        v.add(new Pair(0,n.charAt(0)-'0'));
        solve(1,v);
        out.println(mxHeight-minHeight);
    }
}