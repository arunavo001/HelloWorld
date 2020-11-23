import java.util.Scanner;
public class LinearSearchInReverseOrder
{
    public static void main(String[] args)
    {
        int size;
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        size=in.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements which you want to insert in the array: ");
        for(i=0;i<size;i++)
        {
            array[i]=in.nextInt();
        }
        System.out.println("Enter the key through which you want to compare : ");
        int key=in.nextInt();
        in.close();
        int result=0;
        for(i=0;i<size;i++)
        {
            if(array[i]==key)
            {
                result=(size-1)-i;
            }
        }
        if(result>=0)
        {
            System.out.println("The result after searching in reverse order is : "+result);
        }
    }
}