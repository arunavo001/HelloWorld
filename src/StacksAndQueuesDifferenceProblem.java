import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;
public class StacksAndQueuesDifferenceProblem
{
    public static Scanner sc=new Scanner(System.in);
    public static Stack<Integer> b2=new Stack<>();
    public static Queue<Integer> c2=new LinkedList<>();
    public static ArrayList<Integer>b,c;
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int n=200005;
    public static void main(String[] args)
    {
        b= new ArrayList<>();
        c= new ArrayList<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            b2.push(x);
            c2.add(x);
        }
        while (!b2.isEmpty())
        {
            b.add(b2.pop());
        }
        while (c2.size()>0)
        {
            c.add(c2.remove());
        }
        long res=0;
        for (int i=0;i<n;i++)
        {
            res+=Math.abs(b.get(i)-c.get(i));
        }
        int mod=1000000007;
        out.println(res%mod);
    }
}