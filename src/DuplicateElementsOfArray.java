import java.util.Scanner;
public class DuplicateElementsOfArray
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=s.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements which you want to provide insert in your array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        DuplicateElementsOfArray obj=new DuplicateElementsOfArray();
        obj.printDuplicates(arr);
    }
    private void printDuplicates(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println("Duplicates elements of the array are: "+arr[i]);
            }
            count=0;
        }
    }
}
