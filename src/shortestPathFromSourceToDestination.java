import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class shortestPathFromSourceToDestination
{
    static int noOfRows, noOfCols;
    static class indices
    {
        int x;
        int y;
    }
    static class QueueEntry
    {
        indices indices;
        int distance;
    }
    static boolean isSafe(int row, int column)
    {
        if (row >= 0 && row < noOfRows && column >= 0 && column < noOfCols)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int NeighbourRow[] = {-1, 0, 0, 1};
    static int NeighbourCol[] = {0, -1, 1, 0};
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        noOfRows = in.nextInt();
        noOfCols = in.nextInt();
        int inputMatrix[][] = new int[noOfRows][noOfCols];
        for (int i = 0; i < noOfRows; i++)
        {
            for (int j = 0; j < noOfCols; j++)
            {
                inputMatrix[i][j] = in.nextInt();
            }
        }
        indices srcIndex = new indices();
        srcIndex.x = in.nextInt();
        srcIndex.y = in.nextInt();
        indices destIndex = new indices();
        destIndex.x = in.nextInt();
        destIndex.y = in.nextInt();
        boolean visitedArr[][] = new boolean[noOfRows][noOfCols];
        for (int i = 0; i < noOfRows; i++)
        {
            for (int j = 0; j < noOfCols; j++)
            {
                visitedArr[i][j] = false;
            }
        }
        visitedArr[srcIndex.x][srcIndex.y] = true;
        Queue<QueueEntry> queue = new LinkedList<>();
        QueueEntry tempNode = new QueueEntry();
        tempNode.indices = srcIndex;
        tempNode.distance = 0;
        queue.add(tempNode);
        while (!queue.isEmpty())
        {
            QueueEntry curr = queue.peek();
            indices currIndex = curr.indices;
            if (currIndex.x == destIndex.x && currIndex.y == destIndex.y)
            {
                System.out.println(curr.distance);
                return;
            }
            queue.poll();
            for (int i = 0; i < 4; i++)
            {
                int row = currIndex.x + NeighbourRow[i];
                int column = currIndex.y + NeighbourCol[i];
                if (isSafe(row, column) && inputMatrix[row][column] == 0 && !visitedArr[row][column])
                {
                    visitedArr[row][column] = true;
                    QueueEntry adjacentCell = new QueueEntry();
                    indices pnt = new indices();
                    pnt.x = row;
                    pnt.y = column;
                    adjacentCell.indices = pnt;
                    adjacentCell.distance = curr.distance + 1;
                    queue.add(adjacentCell);
                }
            }
        }
        System.out.println("No Shortest Distance");
    }
}
