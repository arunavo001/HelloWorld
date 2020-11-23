import java.util.Scanner;
public class MaxValueOfKnapsackProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the value : ");
        int size1=sc.nextInt();
        int[]value=new int[size1];
        System.out.println("Enter the values which you want to insert : ");
        for(int i=0;i<size1;i++)
        {
            value[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the weights : ");
        int size2=sc.nextInt();
        int[]weights=new int[size2];
        System.out.println("Enter the weights which you want to insert : ");
        for(int j=0;j<size2;j++)
        {
            weights[j]=sc.nextInt();
        }
        System.out.println("Enter the total capacity : ");
        int capacity=sc.nextInt();
        System.out.println("The max value of the Knapsack problem is : "+knapsackCapacity(value,weights,capacity));
    }
    private static int knapsackCapacity(int[] value, int[] weigths, int capacity)
    {
        int n=value.length;
        int T[][]=new int[n+1][capacity+1];
        for(int i=0;i<=n;i++)
        {
            for(int w=0;w<=capacity;w++)
            {
                if(i==0 || w==0)
                {
                    T[i][w]=0;
                }
                else
                {
                    if(weigths[i-1]<=w)
                    {
                        T[i][w]=Math.max(value[i-1]+T[i-1][w-weigths[i-1]],T[i-1][w]);
                    }
                    else
                    {
                        T[i][w]=T[i-1][w];
                    }
                }
            }
        }
        return T[n][capacity];
    }
}
