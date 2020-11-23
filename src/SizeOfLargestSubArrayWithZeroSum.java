import java.util.HashMap;
import java.util.Scanner;
public class SizeOfLargestSubArrayWithZeroSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array =new int[n];
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int sum,maxSize;
        sum=0;
        maxSize=0;
        for (int i=0;i<n;i++)
        {
            sum+=array[i];
            if (sum==0)
            {
                maxSize=i+1;
            }
            Integer prevSum= hashMap.get(sum);
            if (prevSum!=null)
            {
                maxSize=Math.max(i-prevSum,maxSize);
            }
            else
            {
                hashMap.put(sum,i);
            }
        }
        System.out.println(maxSize);
    }
}