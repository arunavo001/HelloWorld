import java.util.ArrayList;
import java.util.*;
public class adjacencyList
{
    public static void addEdgeToAdjacencyList(ArrayList<ArrayList<Integer>> adjList, int source, int destination)
    {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }
    public static void printGraph(ArrayList<ArrayList<Integer>> adjList)
    {
        for(int i=0;i<adjList.size();i++)
        {
            System.out.println("\nAdjacency List of vertex : "+i);
            System.out.print("head");
            for (int j = 0; j < adjList.get(i).size(); j++)
            {
                System.out.print("->"+adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of vertex : ");
        int v = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdgeToAdjacencyList(adj, 0, 1);
        addEdgeToAdjacencyList(adj,0, 2);
        addEdgeToAdjacencyList(adj,0, 3);
        addEdgeToAdjacencyList(adj,0, 4);
        addEdgeToAdjacencyList(adj,1, 3);
        addEdgeToAdjacencyList(adj,2, 4);
        printGraph(adj);
    }
}
