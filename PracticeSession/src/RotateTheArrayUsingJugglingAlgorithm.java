import java.util.Scanner;
public class RotateTheArrayUsingJugglingAlgorithm
{
    void leftRotate(int[] arr, int d, int n)
    {
        d=d%n;
        int i,j,k,temp;
        int g_c_d=gcd(d,n);
        for (i=0;i<g_c_d;i++)
        {
            temp=arr[i];
            j=i;
            while (true)
            {
                k=j+d;
                if (k>=n)
                {
                    k=k-n;
                }
                if (k==i)
                    break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }
    void printArray(int[] arr, int size)
    {
        int i;
        for (i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    int gcd(int a,int b)
    {
        if (b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static void main(String[] args)
    {
        RotateTheArrayUsingJugglingAlgorithm obj=new RotateTheArrayUsingJugglingAlgorithm();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Entre tghe elements which you want to inset into the array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value in which direction you want to rotate your array : ");
        int d=sc.nextInt();
        obj.leftRotate(arr,d,n);
        obj.printArray(arr,n);
    }
}