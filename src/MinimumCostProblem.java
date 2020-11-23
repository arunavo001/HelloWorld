import java.util.Scanner;

public class MinimumCostProblem
{
    private static int minCost(int cost[][],int m,int n)
    {
        if(n<0 || m<0)
        {
            return Integer.MAX_VALUE;
        }
        else if(m==0 && n==0)
        {
            return cost[m][n];
        }
        else
        {
            return cost[m][n]+min(minCost(cost,m-1,n-1),minCost(cost,m-1,n),minCost(cost,m,n-1));
        }
    }
    private static int min(int x, int y, int z)
    {
        if(x<y)
            return (x<z) ? x:z;
        else
            return (y<z) ? y:z;
    }
    public static void main(String[] args)
    {
        int cost[][]={{1,2,3},{4,8,2},{1,5,3}};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting coordinate : ");
        int xCoordinate=sc.nextInt();
        System.out.println("Enter the ending coordinate : ");
        int yCoordinate=sc.nextInt();
        System.out.println("The minimum cost from start to end coordinate id : "+minCost(cost,xCoordinate,yCoordinate));
    }
}