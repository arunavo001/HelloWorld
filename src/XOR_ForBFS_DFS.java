import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class XOR_ForBFS_DFS
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    static ArrayList<ArrayList<Integer>> g=new ArrayList<>();
    public static ArrayList<Integer> a=new ArrayList<>();
    public static ArrayList<Integer> b=new ArrayList<>();
    static ArrayList<Integer> vis=new ArrayList<>();
    static void dfs(int x)
    {
        vis.set(x,1);
        a.add(x);
        for (int i=0;i<g.get(x).size();i++)
        {
            if(vis.get(g.get(x).get(i))==0)
            {
                dfs(g.get(x).get(i));
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number of nodes :");
        int n=sc.nextInt();
        System.out.println("Enter the size of the elements you want to insert into the array list : ");
        int m=sc.nextInt();
        m/=2;
        for(int i=0;i<n;i++)
        {
            g.add(new ArrayList<>());
        }
        System.out.println("Enter element for each line of element of the m's subsequent lines : ");
        for(int i=0;i<m;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        for(int i=0;i<n;i++)
        {
            Collections.sort(g.get(i));
        }
        for(int i=0;i<n;i++)
        {
            vis.add(0);
        }
        dfs(0);
        for (int i=0;i<n;i++)
        {
            vis.set(i,0);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis.set(0,1);
        while (q.size()>0)
        {
            Integer x=q.remove();
            b.add(x);
            for(int i=0;i<g.get(x).size();i++)
            {
                if(vis.get(g.get(x).get(i))==0)
                {
                    vis.set(g.get(x).get(i),1);
                    q.add(g.get(x).get(i));
                }
            }
        }
        long res=0;
        for(int i=0;i<n;i++)
        {
            res+=a.get(i)^b.get(i);
        }
        int mod=1000000007;
        out.println("Sum of BFS and DFS id : "+res%mod);
    }
}