import java.util.HashSet;
import java.util.Scanner;
public class PairWithGivenSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int targetedSum=sc.nextInt();
        boolean flag=false;
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i< array.length;i++)
        {
            int difference=targetedSum-array[i];
            if (hashSet.contains(difference))
            {
                flag=true;
                break;
            }
            hashSet.add(array[i]);
        }
        if (flag)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}