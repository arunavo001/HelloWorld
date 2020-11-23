import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class primsUpdate
{
    public static Scanner sc = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out, true);
    public static int N = 200005;
    static ArrayList<ArrayList<Pair>> g = new ArrayList<ArrayList<Pair>>();
    static int mod = 1000000007;
    static int[] c = new int[N];
    static int[] done = new int[N];
    public static class Pair implements Comparable<Pair>
    {
        public Integer first;
        public Integer second;
        Pair(Integer first, Integer second)
        {
            this.first = first;
            this.second = second;
        }
        public int compareTo(Pair o)
        {
            if (first != o.first)
            {
                if (first > o.first)
                {
                    return -1;
                }
                return 1;
            }
            if (second != o.second)
            {
                if (second > o.second)
                {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        m /= 3;
        for (int i = 0; i < n; i++)
        {
            g.add(new ArrayList<Pair>());
        }
        for (int i = 0; i < m; i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.get(u).add(new Pair(v, w));
            g.get(v).add(new Pair(u, w));
        }
        for (int i = 0; i < n; i++)
        {
            c[i] = mod;
        }
        TreeSet<Pair> a = new TreeSet<Pair>();
        for (int i = 0; i < n; i++)
        {
            a.add(new Pair(c[i], i));
        }
        int res = 0;
        while (a.size() > 0)
        {
            Pair x = a.pollFirst();
            done[x.second] = 1;
            for (int i = 0; i < g.get(x.second).size(); i++)
            {
                if ((done[g.get(x.second).get(i).first] == 0) && c[g.get(x.second).get(i).first] > g.get(x.second).get(i).second)
                {
                    a.remove(new Pair(c[g.get(x.second).get(i).first], g.get(x.second).get(i).first));
                    c[g.get(x.second).get(i).first] = g.get(x.second).get(i).second;
                    a.add(new Pair(c[g.get(x.second).get(i).first], g.get(x.second).get(i).first));
                    res++;
                }
            }
        }
        out.println(res);
    }
}