import java.util.Scanner;
import java.util.LinkedList;
public class detectLoopInUndirectedraph
{
    public int noOfNodes;
    public LinkedList<Integer> adjList[];
    public int noOfEdges;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        detectLoopInUndirectedraph obj = new detectLoopInUndirectedraph();
        obj.noOfNodes = in.nextInt();
        obj.noOfEdges = in.nextInt();
        obj.adjList = new LinkedList[obj.noOfNodes];
        for (int i = 0; i < obj.noOfNodes; ++i)
        {
            obj.adjList[i] = new LinkedList();
        }
        for (int i = 0; i < obj.noOfEdges; ++i)
        {
            int x, y;
            x=in.nextInt();
            y = in.nextInt();
            obj.adjList[x].add(y);
            obj.adjList[y].add(x);
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
        boolean result = false;
        boolean[] visited = new boolean[noOfNodes];
        for (int i = 0; i <noOfNodes ; i++)
        {
            if(visited[i]==false)
            {
                if(isCycleUtil(i, visited, -1))
                {
                    return true;
                }
            }
        }
        return result;
    }
    boolean isCycleUtil(int currVertex, boolean [] visited, int parent)
    {
        visited[currVertex] = true;
        for (int i = 0; i <adjList[currVertex].size() ; i++)
        {
            int vertex = adjList[currVertex].get(i);
            if(vertex!=parent)
            {
                if(visited[vertex])
                {
                    return true;
                }
                else
                {
                    if (isCycleUtil(vertex, visited, currVertex))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
