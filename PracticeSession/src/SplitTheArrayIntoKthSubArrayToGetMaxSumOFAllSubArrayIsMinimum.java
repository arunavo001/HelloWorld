import java.util.Scanner;
public class SplitTheArrayIntoKthSubArrayToGetMaxSumOFAllSubArrayIsMinimum
{
    static boolean check(int mid, int[] array, int n, int k)
    {
        int count=0;
        int sum=0;
        for (int i=0;i<n;i++)
        {
            if (array[i]>mid)
                return false;
            sum+=array[i];
            if (sum>mid)
            {
                count++;
                sum=array[i];
            }
        }
        count++;
        return count <= k;
    }
    static int solve(int[] array, int n, int k)
    {
        int start=1;
        int end=0;
        for (int i=0;i<n;i++)
        {
            end+=array[i];
        }
        int answer=0;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if (check(mid,array,n,k))
            {
                answer=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] array =new int[n];
        System.out.println("Enter the elements which you want to insert into the array : ");
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int length=array.length;
        System.out.println("Enter the value of kth position : ");
        int k=sc.nextInt();
        System.out.println("The maximum sum of the solution would be : "+solve(array,length,k));
    }
}