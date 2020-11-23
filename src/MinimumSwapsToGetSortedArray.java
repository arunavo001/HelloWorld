import java.util.Scanner;
public class MinimumSwapsToGetSortedArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[] temp=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int minSwaps=minSwapsToGetPermutedArray(arr,temp,n);
        if (minSwaps==-1)
            System.out.println("Not possible");
        else
            System.out.println(minSwaps);
    }

    private static int minSwapsToGetPermutedArray(int[] arr, int[] temp, int n)
    {
        for (int i=0;i<n;i++)
            if (arr[i]-1-i>2)
                return -1;
        return findNumberOfInversions(arr,temp,0,n-1);
    }
    private static int findNumberOfInversions(int[] arr, int[] temp, int l, int r)
    {
        int mid,numberOfInversions=0;
        if (l<r)
        {
            mid=(l+r)/2;
            numberOfInversions=findNumberOfInversions(arr, temp, l, mid);
            numberOfInversions+=findNumberOfInversions(arr, temp, mid+1, r);
            int i=l,j=mid+1,k=l;
            while ((j<=r) && (i<=mid))
            {
                if (arr[i]<=arr[j])
                    temp[k++]=arr[i++];
                else
                {
                    temp[k++]=arr[j++];
                    numberOfInversions+=mid+1-i;
                }
            }
            while (i<=mid)
            {
                temp[k++]=arr[i++];
            }
            while (j<=r)
            {
                temp[k++]=arr[j++];
            }
            for (i=l;i<=r;i++)
            {
                arr[i]=temp[i];
            }
        }
        return numberOfInversions;
    }
}