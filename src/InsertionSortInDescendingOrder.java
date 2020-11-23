import java.util.Scanner;
public class InsertionSortInDescendingOrder
{
    public static void insertionSortDescending(int array[])
    {
        int n=array.length;
        for(int j=1;j<n;j++)
        {
            int key=array[j];
            int i=j-1;
            while ((i>-1) && (array[i]<key))
            {
                array[i+1]=array[i];
                i--;
            }
            array[i+1]=key;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements which you want to insert in the array : ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        insertionSortDescending(array);
        System.out.println("The result after doing insertion sort in descending order is : ");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
}