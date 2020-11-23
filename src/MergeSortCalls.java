import java.io.PrintWriter;
import java.util.Scanner;
public class MergeSortCalls
{
    public static int res;
    public static int a[];
    public static int N=200005;
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static void mergeSort(int l,int r)
    {
        res++;
        boolean done=true;
        for (int i=l+1;i<r;i++)
        {
            if (a[i]<a[i-1])
            {
                done=false;
                break;
            }
        }
        if (done)
        {
            return;
        }
        int mid=(l+r)/2;
        mergeSort(l,mid);
        mergeSort(mid,r);
    }
    public static void main(String[] args)
    {
        a=new int[N];
        int n=sc.nextInt();
        res=0;
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        mergeSort(0,n);
        out.println(res);

    }
}