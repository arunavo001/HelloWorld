import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SumOfMedianTraversal
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int n=200005;
    static ArrayList<ArrayList<Integer>> g=new ArrayList<>();
    public static ArrayList<Integer> a=new ArrayList<>();
    public static ArrayList<Integer> b=new ArrayList<>();
    public static ArrayList<Integer> c=new ArrayList<>();
    public static void preOrder(int v)
    {
        a.add(v);
        for(int i=0;i<g.get(v).size();i++)
        {
            preOrder(g.get(v).get(i));
        }
    }
    static void postOrder(int v)
    {
        for(int i=0;i<g.get(v).size();i++)
        {
            postOrder(g.get(v).get(i));
        }
        c.add(v);
    }
    static void inOrder(int v)
    {
        if (g.get(v).size() >= 1)
        {
            inOrder(g.get(v).get(0));
        }
        b.add(v);
        if (g.get(v).size() >= 2)
        {
            inOrder(g.get(v).get(1));
        }
    }
    public static void main(String[] args)
    {
        b=new ArrayList<>();
        c=new ArrayList<>();
        System.out.println("Enter how many numbers of element you want to insert into the array list : ");
        int n=sc.nextInt();
        n++;
        for(int i=0;i<n;i++)
        {
            g.add(new ArrayList<>());
        }
        System.out.println("Enter the numbers of element which describes the parent of previous element : ");
        for(int i=1;i<n;i++)
        {
            int x=sc.nextInt();
            g.get(x).add(i);
        }
        for(int i=0;i<n;i++)
        {
            Collections.sort(g.get(i));
        }
        preOrder(0);
        inOrder(0);
        postOrder(0);
        long res=0;
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> d=new ArrayList<>();
            d.add(a.get(i));
            d.add(b.get(i));
            d.add(c.get(i));
            Collections.sort(d);
            res+=d.get(1);
        }
        int mod=1000000007;
        out.println("After calculation the sum of thr median traversal would be : "+res%mod);
    }
}