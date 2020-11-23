public class TheKnightsTourProblem
{
    static int N=8;
    static boolean isSafe(int x,int y,int [][]sol)
    {
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y]==-1);
    }
    static void printSolution(int [][] sol)
    {
        for (int x=0;x<N;x++)
        {
            for (int y=0;y<N;y++)
                System.out.print(sol[x][y]+" ");
            System.out.println();
        }
    }
    static void solveKT()
    {
        int [][]sol=new int[8][8];
        for (int x=0;x<N;x++)
            for (int y=0;y<N;y++)
                sol[x][y]=-1;
        int[] xMove ={2,1,-1,-2,-2,-1,1,2};
        int[] yMove ={1,2,2,1,-1,-2,-2,-1};
        sol[0][0]=0;
        if (!solveKTUtil(0,0,1,sol,xMove,yMove))
        {
            System.out.println("Solution does not exist");
        }
        else
            printSolution(sol);
    }
    static boolean solveKTUtil(int x,int y,int moveI,int [][]sol,int []xMove,int []yMove)
    {
        int k,next_X,next_Y;
        if (moveI==N*N)
            return true;
        for (k=0;k<8;k++)
        {
            next_X=x+xMove[k];
            next_Y=y+yMove[k];
            if (isSafe(next_X,next_Y,sol))
            {
                sol[next_X][next_Y]=moveI;
                if (solveKTUtil(next_X,next_Y,moveI+1,sol,xMove,yMove))
                    return true;
                else
                    sol[next_X][next_Y]=-1;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        solveKT();
    }
}