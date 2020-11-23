import java.io.PrintWriter;
import java.util.Scanner;
public class MinimumSubArray
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    public static int N=200005;
    public static int[] arr=new int[N];
    public static int[] par=new int[N];
    public static long MAX(int x,int y)
    {
        if (x==y)
            return arr[x];
        int mid=(x+y)>>1,mx=0;
        long sum=0,ans=0;
        for (int i=mid+1;i<=y;i++)
        {
            if (mx<arr[i])
                mx=arr[i];
            par[i]=mx;
            sum+=mx;
        }
        mx=0;
        int pnt=mid+1;
        for (int i=mid;i>=x;i--)
        {
            if (mx<arr[i])
                mx=arr[i];
            while (pnt<=y && par[pnt]<=mx)
            {
                sum-=par[pnt++];
            }
            ans+=sum+ (long) (pnt - mid - 1) * mx;
        }
        return MAX(x,mid)+MAX(mid+1,y)+ans;
    }
    public static void main(String[] args)
    {
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mod=1000000007;
        out.println(MAX(1,n)%mod);
    }
}