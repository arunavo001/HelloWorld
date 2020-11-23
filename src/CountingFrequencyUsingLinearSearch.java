import java.util.Scanner;
public class CountingFrequencyUsingLinearSearch
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
        System.out.println("After doing Linear search the frequency of the key element is : "+counting(arr,size,key));
    }
    static int counting(int arr[],int n,int x)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }
}
