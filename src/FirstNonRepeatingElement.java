import java.util.Scanner;
public class FirstNonRepeatingElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int response=firstNonRepeating(arr,arr.length);
        if(response==Integer.MIN_VALUE)
        {
            System.out.println("ALl elements are repeated");
        }
        else
        {
            System.out.println(response);
        }
    }
    static int firstNonRepeating(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    break;
                }
            }
            if(j==n)
            {
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
}
