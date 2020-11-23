import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class BuyItemProblem
{
    public static Scanner sc=new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(System.out,true);
    static ArrayList<Integer> costs,weights;
    public static void main(String[] args)
    {
        System.out.println("Enter how many number of elements you want to provide for costs :");
        int n=sc.nextInt();
        costs=new ArrayList<>();
        weights=new ArrayList<>();
        System.out.println("Enter the elements you want to insert for the cost :");
        for(int i=0;i<n;i++)
        {
            costs.add(sc.nextInt());
        }
        System.out.println("Enter the elements you want to insert for the weights : ");
        for(int i=0;i<n;i++)
        {
            weights.add(sc.nextInt());
        }
        System.out.println("Enter the value of the total available money :");
        int c=sc.nextInt();
        long res=0;
        for(int i=0;i<(1<<n);i++)
        {
            long cost=0,weight=0;
            for(int j=0;j<n;j++)
            {
                if(((i>>j) & 1)==1)
                {
                    cost+=costs.get(j);
                    weight+=weights.get(j);
                }
            }
            if(cost<=c && weight > res)
            {
                res=weight;
            }
        }
        int mod=1000000007;
        out.println("The maximum total amount of weight you'll get : "+res%mod);
    }
}