import java.util.*;
import java.util.LinkedList;
public class detectLoopInDirectedGraph
{
    public int noOfNodes;
    public int noOfEdges;
    public static LinkedList<Integer>adjacencyList[];
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        detectLoopInDirectedGraph obj = new detectLoopInDirectedGraph();
        obj.noOfNodes = in.nextInt();
        obj.noOfEdges = in.nextInt();
        obj.adjacencyList = new LinkedList[obj.noOfNodes];
        for (int i = 0; i < obj.noOfNodes; ++i)
        {
            obj.adjacencyList[i] = new LinkedList();
        }
        for (int i = 0; i < obj.noOfEdges; ++i)
        {
            obj.adjacencyList[in.nextInt()].add(in.nextInt());
        }
        if(obj.isCycle())
        {
            System.out.println("Yes Graph has cycle");
        }
        else
        {
            System.out.println("No Graph has no cycle");
        }
    }
    public boolean isCycle()
    {
        boolean visited[] = new boolean[noOfNodes];
        boolean recursiveArr[] = new boolean[noOfNodes];
        for (int i = 0; i < noOfNodes; i++)
        {
            if (isCycleUtil(i, visited, recursiveArr))
                return true;
        }
        return false;
    }
    public boolean isCycleUtil(int i, boolean[] visited, boolean[] recursiveArr)
    {
        visited[i] = true;
        recursiveArr[i] = true;
        for (int j = 0; j < adjacencyList[i].size(); j++)
        {
            int adjVertex = adjacencyList[i].get(j);
            if (!visited[adjVertex] && isCycleUtil(adjVertex, visited, recursiveArr))
            {
                return true;
            }
            else if (recursiveArr[adjVertex])
                return true;
        }
        recursiveArr[i] = false;
        return false;
    }
}
