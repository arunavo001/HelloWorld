import java.util.Scanner;
public class thirdLargestElementOfTheArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element which you want to provide in the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        thirdMaxInteger(arr);
    }
    static void thirdMaxInteger(int[] arr)
    {
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] < firstMax && arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] < secondMax && arr[i] > thirdMax)
                thirdMax = arr[i];
        }
        if (thirdMax != Integer.MIN_VALUE)
            System.out.println(thirdMax);
        else
            System.out.println("The array doesn't have a third maximum element");
    }
}