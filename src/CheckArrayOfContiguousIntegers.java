import java.util.HashSet;
import java.util.Scanner;
public class CheckArrayOfContiguousIntegers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        if (n==0)
        {
            System.out.println("false");
            return;
        }
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<n;i++)
            hashSet.add(array[i]);
        int currentElement=array[0];
        while (hashSet.contains(currentElement))
        {
            count++;
            currentElement--;
        }
        currentElement=array[0]+1;
        while (hashSet.contains(currentElement))
        {
            count++;
            currentElement++;
        }
        if (count==(hashSet.size()))
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}