import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;
public class KruskalFindset
{
    public static Scanner sc=new Scanner(System.in);
    public static PriorityQueue<Integer> b2=new PriorityQueue<Integer>(1,(a,b)->b-a);
    public static Queue<Integer> c2=new LinkedList<>();
    public static ArrayList<Integer>b,c;
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int n=200005;
    public static class Pair implements Comparable<Pair>
    {
        public int first,second,third;
        Pair(int first,int second,int third)
        {
            this.first=first;
            this.second=second;
            this.third=third;
        }
        public int compareTo(Pair o)
        {
            if(first!=o.first)
            {
                if(first>o.first)
                {
                    return 1;
                }
                return -1;
            }
            if(second!=o.second)
            {
                if(second>o.second)
                {
                    return 1;
                }
                return -1;
            }
            if(third!=o.third)
            {
                if(third>o.third)
                {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        public String toString()
        {
            return "("+first+","+second+","+third+")";
        }
    }
    static int[] par=new int[n];
    static int[] sz=new int[n];
    static void uni(int x,int y)
    {
        if(sz[x]<sz[y])
        {
            int temp=x;
            x=y;
            y=temp;
        }
        sz[x]+=sz[y];
        par[y]=x;
    }
    static int res=0;
    static int find(int x)
    {
        res++;
        if(x!=par[x])
        {
            par[x]=find(par[x]);
        }
        return par[x];
    }
    public static void main(String[] args)
    {
        int n=sc.nextInt();
        int m=sc.nextInt();
        m/=3;
        ArrayList<Pair> a=new ArrayList<Pair>();
        for(int i=0;i<m;i++)
        {
            int w,u,v;
            u=sc.nextInt();
            v=sc.nextInt();
            w=sc.nextInt();
            Pair p=new Pair(w,u,v);
            if(p.second>p.third)
            {
                int temp=p.second;
                p.second=p.third;
                p.third=temp;
            }
            a.add(p);
        }
        Collections.sort(a);
        for(int i=0;i<n;i++)
        {
            sz[i]=1;
            par[i]=i;
        }
        for(int i=0;i<m;i++)
        {
            int x=find(a.get(i).second);
            int y=find(a.get(i).third);
            if(x!=y)
            {
                uni(x,y);
            }
        }
        out.println(res);
    }
}