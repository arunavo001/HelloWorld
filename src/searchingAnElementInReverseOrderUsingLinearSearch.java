import java.util.Scanner;
public class searchingAnElementInReverseOrderUsingLinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements which you want to provide inside the list of Array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=0;
        System.out.println("Enter the key which you want to search inside the array");
        int key=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]==key)
            {
                result=(size-1)-i;
            }
        }
        if(result>=0)
        {
            System.out.println("After searching the array in reverse order the index position of the given key is : "+result);
        }
    }
}
