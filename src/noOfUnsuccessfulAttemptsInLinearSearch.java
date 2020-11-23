import java.util.Scanner;
public class noOfUnsuccessfulAttemptsInLinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the all array elements which you want to insert");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key value which you want to search");
        int key=sc.nextInt();
        System.out.println("After doing linear search the no of unsuccessful attempts are : "+unSuccessfulAttempts(arr,key));
    }
    static int unSuccessfulAttempts(int arr[],int key)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return count;
            }
            count++;
        }
        return count;
    }
}
