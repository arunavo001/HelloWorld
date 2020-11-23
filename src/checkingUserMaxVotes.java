import java.util.Scanner;

public class checkingUserMaxVotes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements you want to provide in the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The index of max votes in the given list of array is : "+calculateMaxVotes(arr));
    }
    static int calculateMaxVotes(int[] maxIntVotes)
    {
        int temp=0;
        int result=0;
        int len=maxIntVotes.length;
        for(int i=0;i<len;i++)
        {
            if(maxIntVotes[i]>temp)
            {
                temp=maxIntVotes[i];
                result=i;
            }
        }
        return result;
    }
}
