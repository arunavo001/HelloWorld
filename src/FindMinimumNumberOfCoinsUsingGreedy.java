import java.util.Scanner;
import java.util.Vector;
public class FindMinimumNumberOfCoinsUsingGreedy
{
    static int[] denominations={1,2,5,10,20,50,100,500,1000};
    static int n= denominations.length;
    static void findMin(int V)
    {
        Vector<Integer> ans=new Vector<>();
        for(int i=n-1;i>=0;i--)
        {
            while(V>=denominations[i])
            {
                V-=denominations[i];
                ans.add(denominations[i]);
            }
        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(" "+ans.elementAt(i));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the actual amount which yoy want to provide : ");
        int n=sc.nextInt();
        System.out.println("The minimal numbers of coins for the amount "+n+" is : ");
        findMin(n);
    }
}
