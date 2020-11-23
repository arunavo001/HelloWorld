import java.util.Scanner;
public class CountZerosInMatrix
{
    public int countZeros(int[][] arr, int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    res++;
                }
            }
        }
        return res;
    }
}
class countZero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of testcases you want to perform : ");
        int t=sc.nextInt();
        System.out.println("Enter the maximum size of the matrix : ");
        while(t>0)
        {
            int n=sc.nextInt();
            int[][] arr =new int[1000][1000];
            System.out.println("Enter the elements which you want to insert in the matrix : ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("After counting number of zeros is present inside the matrix is : "+ new CountZerosInMatrix().countZeros(arr,n));
            t--;
        }
    }
}