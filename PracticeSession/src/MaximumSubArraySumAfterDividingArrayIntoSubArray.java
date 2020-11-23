import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
class MyComp implements Comparator<Piece>
{
    public int compare(Piece p1,Piece p2)
    {
        if (p2.val!=p1.val)
            return p2.val-p1.val;
        if (p1.start!=p2.start)
            return p2.start-p1.start;
        return 0;
    }
}
class Piece
{
    int start;
    int end;
    int val;
    Piece(int s,int e,int v)
    {
        this.start=s;
        this.end=e;
        this.val=v;
    }
}
public class MaximumSubArraySumAfterDividingArrayIntoSubArray
{
    static void solve(int n, int k, int[] cuts, int[] A)
    {
        int[] sum = new int[n];
        sum[0] = A[0];
        for (int i = 1; i < n; i++)
        {
            sum[i] = sum[i - 1] + A[i];
        }
        TreeSet<Integer> t = new TreeSet<>();
        TreeSet<Piece> pq = new TreeSet<>(new MyComp());
        Piece[] temp = new Piece[n];
        temp[0] = new Piece(0, n - 1, sum[n - 1]);
        pq.add(temp[0]);
        t.add(0);
        for (int i = 0; i < k; i++)
        {
            int curr=t.floor(cuts[i]);
            pq.remove(temp[curr]);
            int end=temp[curr].end;
            temp[curr]=new Piece(curr,cuts[i],sum[cuts[i]]-(curr==0 ? 0:sum[curr-1]));
            pq.add(temp[curr]);
            temp[cuts[i]+1]=new Piece(cuts[i]+1,end,sum[end]-sum[cuts[i]]);
            pq.add(temp[cuts[i]+1]);
            t.add(curr);
            t.add(cuts[i]+1);
            System.out.println("The maximum possible sum would be : "+pq.first().val);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n1=sc.nextInt();
        int[] A =new int[n1];
        System.out.println("Enter the elements which you want to insert into the 1st array : ");
        for (int i=0;i<n1;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the cuts type of array : ");
        int n2=sc.nextInt();
        int[] cuts =new int[n2];
        System.out.println("Enter the number of cuts which you want to insert into the 2nd array : ");
        for (int j=0;j<n2;j++)
        {
            cuts[j]=sc.nextInt();
        }
        solve(n1,n2,cuts,A);
    }
}