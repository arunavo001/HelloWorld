import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class CalculateTimeProblem
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int n=200005;
    static class node
    {
        node[] child;
        int cur;
        node(int x)
        {
            child=new node[2];
            child[0]=child[1]=null;
            cur=x;
        }
    }
    static int mod = 1000000007;
    static ArrayList<ArrayList<Integer>>a= new ArrayList<>();
    static node[] b=new node[n];
    static long res=0;
    static void add(node cur,int x)
    {
        res++;
        int item=0;
        if(x> cur.cur)
        {
            item=1;
        }
        if(cur.child[item]==null)
        {
            cur.child[item]=new node(x);
        }
        else
        {
            add(cur.child[item],x);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the hashtable : ");
        int p=sc.nextInt();
        System.out.println("Enter the maximum size of the linked list in the bucket : ");
        int k=sc.nextInt();
        System.out.println("Enter how many numbers you want to insert in the hashmap : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(new ArrayList<>());
            b[i]=new node(0);
        }
        System.out.println("Enter the elements which you want to insert in the hashmap : ");
        while (n-->0)
        {
            int x=sc.nextInt();
            if(a.get(x%p).size()==k)
            {
                for(int i=0;i<k;i++)
                {
                    add(b[x%p],a.get(x%p).get(i));
                }
            }
            a.get(x%p).add(x);
            if(a.get(x%p).size()<=k)
            {
                res+=a.get(x%p).size();
            }
            else
            {
                add(b[x%p],x);
            }
        }
        assert (res<mod);
        out.println("The time it will take to insert all the elements would be : "+res);
    }
}