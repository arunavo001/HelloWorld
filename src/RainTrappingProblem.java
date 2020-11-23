import java.util.Scanner;
public class RainTrappingProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] highest=new int[size];
        System.out.println("Enter the elements which you want to insert in the array : ");
        for(int i=0;i<size;i++)
        {
            highest[i]=sc.nextInt();
        }
        System.out.println("The maximum trapped water we can store is : "+maxTrappedWater(highest));
    }
    private static int maxTrappedWater(int[] highest)
    {
        int n= highest.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int water=0;
        left[0]=highest[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],highest[i]);
        }
        right[n-1]=highest[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],highest[i]);
        }
        for(int i=0;i<n;i++)
        {
            water+=Math.min(left[i],right[i])-highest[i];
        }
        return water;
    }
}
