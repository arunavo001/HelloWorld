import java.util.Arrays;
import java.util.Scanner;
public class CheckEqualityOfTwoArrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the 1st array : ");
        int n1=sc.nextInt();
        System.out.println("Enter the size of the 2nd array : ");
        int n2=sc.nextInt();
        int[] arr1 =new int[n1];
        int[] arr2 =new int[n2];
        System.out.println("Enter the elements which you want to insert into the 1st array : ");
        for (int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements which you want to insert into the 2nd array : ");
        for (int j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }
        boolean check=true;
        if (arr1.length==arr2.length)
        {
            for (int i=0;i<arr1.length;i++)
            {
                if (arr1[i] != arr2[i]) {
                    check = false;
                    break;
                }
            }
        }
        else
        {
            check=false;
        }
        System.out.println("Input arrays: ");
        System.out.println("First arrays: "+ Arrays.toString(arr1));
        System.out.println("Second arrays: "+ Arrays.toString(arr2));
        if (check)
        {
            System.out.println("Two arrays are equal ");
        }
        else
        {
            System.out.println("Two arrays are not equal ");
        }
    }
}