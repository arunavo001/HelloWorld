import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class PrintLongestBitonicSubSequenceProblem
{
    static void printRes(Vector<Integer> res)
    {
        Enumeration enu=res.elements();
        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement()+" ");
        }
    }
    static void printLBS(int []arr,int N)
    {
        int []lis=new int[N];
        int []lds=new int[N];
        for (int i=0;i<N;i++)
        {
            lis[i]=lds[i]=1;
        }
        for (int i=0;i<N;i++)
        {
            for (int j=0;j<i;j++)
            {
                if (arr[j]<arr[i])
                {
                    if (lis[i]<lis[j]+1)
                        lis[i]=lis[j]+1;
                }
            }
        }
        for (int i=N-1;i>=0;i--)
        {
            for (int j=N-1;j>i;j--)
            {
                if (arr[j]<arr[i])
                {
                    if (lds[i]<lds[j]+1)
                        lds[i]=lds[j]+1;
                }
            }
        }
        int MaxVal=arr[0],inx=0;
        for (int i=0;i<N;i++)
        {
            if (MaxVal<lis[i]+lds[i]-1)
            {
                MaxVal=lis[i]+lds[i]-1;
                inx=i;
            }
        }
        int ct1=lis[inx];
        Vector<Integer> res=new Vector<>();
        for (int i=inx;i>=0 && ct1>0;i--)
        {
            if (lis[i]==ct1)
            {
                res.add(arr[i]);
                ct1--;
            }
        }
        Collections.reverse(res);
        int ct2=lds[inx]-1;
        for (int i=inx;i<N && ct2>0;i++)
        {
            if (lds[i]==ct2)
            {
                res.add(arr[i]);
                ct2--;
            }
        }
        printRes(res);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements which you want to insert into the array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int N= arr.length;
        System.out.println("The Longest Bitonic Subsequence is : ");
        printLBS(arr,N);
    }
}