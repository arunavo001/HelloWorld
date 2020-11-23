import java.util.Scanner;
public class noOfUnsuccessfulAttemptsInBinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements which you want to insert");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key which you want to search");
        int key=sc.nextInt();
        noOfUnsuccessfulAttemptsInBinarySearch obj=new noOfUnsuccessfulAttemptsInBinarySearch();
        System.out.println("No of unsuccessful attempts after doing binary search is : "+obj.unsuccessfulAttemptsInBS(arr,key));
    }
    static int unsuccessfulAttemptsInBS(int arr[],int key)
    {
        int left=0;
        int right=arr.length-1;
        int count=0;
        while(left<=right)
        {
            int mid=(right-1)/2;
            if(arr[mid]==key)
            {
                return count;
            }
            count++;
            if(key>arr[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return count;
    }
}
