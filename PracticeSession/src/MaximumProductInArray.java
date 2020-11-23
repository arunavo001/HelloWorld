import java.util.Scanner;

public class MaximumProductInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int []array=new int[size];
        System.out.println("Enter the array elements which you want to insert into the array :");
        for (int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int answer=maxProduct(array);
        System.out.println("The maximum product of two largest number into the array is :"+maxProduct(array));
    }
    static int maxProduct(int []array)
    {
        int n=array.length;
        int maxProductOfNumber=0;
        int i,j;
        if(n<2)
        {
            System.out.println("No such element exist");
            return 0;
        }
        int a=array[0];
        int b=array[1];
        for(i=0;i<n;i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (array[i]*array[j]>a*b)
                {
                    a=array[i];
                    b=array[j];
                }
            }
            maxProductOfNumber=a*b;
        }
        return maxProductOfNumber;
    }
}
