import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindTheIntersectionOfTwoArrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the 1st array : ");
        int n1=sc.nextInt();
        System.out.println("Enter the size of the 2nd array : ");
        int n2=sc.nextInt();
        String[] arr1=new String[n1];
        String[] arr2=new String[n2];
        System.out.println("Enter the elements which you want to insert into the 1st array : ");
        for (int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextLine();
        }
        System.out.println("Enter the elements which you want to insert into the 2ns array : ");
        for (int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextLine();
        }
        HashSet<String> hash=new HashSet<>();
        for (String value : arr1) {
            for (String s : arr2) {
                if (value.equals(s)) {
                    hash.add(value);
                }
            }
        }
        System.out.println("First array is : "+ Arrays.toString(arr1));
        System.out.println("Second array is : "+Arrays.toString(arr2));
        System.out.println("Intersect elements b/w two array is "+hash);
    }
}