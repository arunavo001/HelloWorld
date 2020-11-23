import java.util.Scanner;
public class GoodPairsProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of testcases which you want to perform : ");
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.println("Enter the size of the array : ");
            int n=sc.nextInt();
            int[]arr=new int[n];
            System.out.println("Enter the elements which you want to insert in the array : ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i]!=arr[j])
                    {
                        count++;
                    }
                }
            }
            System.out.println("The Good pairs would be : "+count/2);
        }
    }
}