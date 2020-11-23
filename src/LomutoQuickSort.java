import java.io.PrintWriter;
import java.util.Scanner;
public class LomutoQuickSort
{
    public static int res;
    public static int[] a;
    public static int N=200005;
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int partition(int lo,int hi)
    {
        int pivot=a[hi];
        int i=lo;
        for (int j=lo;j<hi;j++)
        {
            if (a[j]<pivot)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        int temp=a[i];
        a[i]=a[hi];
        a[hi]=temp;
        return i;
    }
    public static void quickSort(int lo,int hi)
    {
        res+=hi-lo+1;
        if (lo<hi)
        {
            int p=partition(lo,hi);
            quickSort(lo,p-1);
            quickSort(p+1,hi);
        }
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
        quickSort(0,n-1);
        out.println(res);
    }
}