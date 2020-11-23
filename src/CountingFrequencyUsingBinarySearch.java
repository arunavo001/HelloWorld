import java.util.Scanner;
public class CountingFrequencyUsingBinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :  ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements which you want to insert : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key which you want to search : ");
        int key=sc.nextInt();
        System.out.println("After doing the binary search the frequency of the key element is : "+count(arr,key,size));
    }
    static int Left(int arr[],int low,int high,int x,int n)
    {
        if(high>=low)
        {
            int mid=(low+high)/2;
            if((mid==0 || x>arr[mid-1]) && x==arr[mid])
            {
                return mid;
            }
            else if(x>arr[mid])
            {
                return Left(arr,mid+1,high,x,n);
            }
            else
            {
                return Left(arr,low,mid-1,x,n);
            }
        }
        return -1;
    }
    static int Right(int arr[],int low,int high,int x,int n)
    {
        if(high>=low)
        {
            int mid=(low+high)/2;
            if((mid==n-1 || x<arr[mid+1]) && arr[mid]==x)
            {
                return mid;
            }
            else if(x<arr[mid])
            {
                return Right(arr,low,mid-1,x,n);
            }
            else
            {
                return Right(arr,mid+1,high,x,n);
            }
        }
        return -1;
    }
    static int count(int arr[],int x,int n)
    {
        int i,j;
        i=Left(arr,0,n-1,x,n);
        if(i==-1)
        {
            return i;
        }
        j=Right(arr,i,n-1,x,n);
        return (j-i+1);
    }
}