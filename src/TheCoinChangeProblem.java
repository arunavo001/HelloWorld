import java.util.Arrays;
import java.util.Scanner;
public class TheCoinChangeProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] coins=new int[size];
        System.out.println("Enter the value of coins which you want to insert : ");
        for(int i=0;i<size;i++)
        {
            coins[i]=sc.nextInt();
        }
        System.out.println("Enter the amount which you want ti initialize : ");
        int amount=sc.nextInt();
        System.out.println("No of ways is possible to change the provided amount into partition of coins : "+waysOfFindingCoinChange(coins,amount));
    }
    private static int waysOfFindingCoinChange(int[] coins, int amount)
    {
        int T[]=new int[amount+1];
        int n=coins.length;
        Arrays.fill(T,0);
        T[0]=1;
        for(int i=0;i<n;i++)
        {
            for(int amt=coins[i];amt<=amount;amt++)
            {
                T[amt]=T[amt]+T[amt-coins[i]];
            }
        }
        return T[amount];
    }
}
