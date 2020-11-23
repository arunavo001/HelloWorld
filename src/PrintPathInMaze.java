import java.util.Scanner;
public class PrintPathInMaze
{
    public static boolean isValid(int x, int y, int[][] inputMatrix, int n, int[][] solMatrix)
    {
        if (x >= 0 && x < n && y >= 0 && y < n && inputMatrix[x][y] == 0 && solMatrix[x][y] == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean findPath(int x, int y, int[][] inputMatrix, int n, int[][] solMatrix)
    {
        if (x == n - 1 && y == n - 1)
        {
            solMatrix[x][y] = 1;
            return true;
        }
        else
            {
            solMatrix[x][y] = 1;
            if (isValid(x, y + 1, inputMatrix, n, solMatrix))
            {
                if (findPath(x, y + 1, inputMatrix, n, solMatrix))
                {
                    return true;
                }
            }
            if (isValid(x + 1, y, inputMatrix, n, solMatrix))
            {
                if (findPath(x + 1, y, inputMatrix, n, solMatrix))
                {
                    return true;
                }
            }
            solMatrix[x][y] = 0;
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] inputMatrix = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                inputMatrix[i][j] = in.nextInt();
            }
        }
        int[][] solMatrix = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                solMatrix[i][j] = 3;
            }
        }
        if (findPath(0, 0, inputMatrix, n, solMatrix))
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (solMatrix[i][j] == 1)
                    {
                        System.out.print("Y ");
                    }
                    else
                    {
                        System.out.print("N ");
                    }
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("No Path");
        }
    }
}