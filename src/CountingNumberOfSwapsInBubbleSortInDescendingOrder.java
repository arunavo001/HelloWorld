import java.util.Scanner;
public class CountingNumberOfSwapsInBubbleSortInDescendingOrder
{
    static int totalBubbleSortSwaps(int [] array,int M)
    {
        int size= array.length;
        int var=0;
        int totalSwaps=0;
        for(int i=0;i<M;i++)
        {
            for(int j=1;j<(size-i);j++)
            {
                if(array[j-1]< array[j])
                {
                    var=array[j-1];
                    array[j-1]=array[j];
                    array[j]=var;
                    totalSwaps++;
                }
            }
        }
        return totalSwaps;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of swaps you want to perform : ");
        int M = sc.nextInt();
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements which you want to insert : ");
        for (int i = 0; i < size; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("After doing bubble sort total number of swaps are : "+totalBubbleSortSwaps(array,M));
    }
}