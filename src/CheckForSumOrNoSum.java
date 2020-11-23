import java.util.Scanner;
public class CheckForSumOrNoSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array : ");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.println("enter the elements which you want to insert in the array : ");
        for(int i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the second array : ");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("enter the elements which you want to insert in the second array : ");
        for(int j=0;j<size2;j++)
        {
            arr2[j]=sc.nextInt();
        }
        System.out.println("enter the value of the actual sum : ");
        int x=sc.nextInt();
        System.out.println("After checking the sum the summation possibility is  :"+checkForSum(arr1,x));
        System.out.println("After checking the sum the summation possibility is : "+checkForSum(arr2,x));
    }

    private static boolean checkForSum(int[] arr, int x)
    {
        int i=0;
        int j=arr.length-1;
        while(i!=j)
        {
            if(arr[i]+arr[j]==x)
                return true;
            else if(arr[i]+arr[j]>x)
                j--;
            else if(arr[i]+arr[j]<x)
                i++;
        }
        return false;
    }
}