import java.util.Scanner;
public class FindMinNumberOfCoinsUsingRecursiveApproach
{
    static int minCoin(int[] coins,int m,int v)
    {
        if(v==0)
            return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            if(coins[i]<=v)
            {
                int sub_res=minCoin(coins,m,v-coins[i]);
                if(sub_res!=res && sub_res+1<res)
                {
                    res=sub_res+1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int [] coins=new int[size];
        System.out.println("Enter the elements pof the coins which you want to provide into the array : ");
        for(int i=0;i<size;i++)
        {
            coins[i]=sc.nextInt();
        }
        int m=coins.length;
        System.out.println("Enter the actual amount for which you want to give the change : ");
        int v=sc.nextInt();
        System.out.println("Tne minimal number of coins for the amount "+v+" is : "+minCoin(coins,m,v));
    }
}
