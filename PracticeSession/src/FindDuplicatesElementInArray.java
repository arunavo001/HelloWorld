import java.util.Scanner;
public class FindDuplicatesElementInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        String[] arr=new String[n];
        System.out.println("Enter the elements which you want to insert in the array :");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if ((arr[i].equals(arr[j])) && (i!=j))
                {
                    System.out.println("The duplicate element is/are : "+arr[j]);
                }
            }
        }
    }
}
