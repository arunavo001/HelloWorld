import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class depthFirstSearch
{
    public int noOfNodes;
    public int noOfEdges;
    public LinkedList<Integer> adjacencyList[];
    public int source;
    public void DFS(int s)
    {
        boolean visited[]=new boolean[noOfNodes];
        DFSUtil(s,visited);
    }
    public void DFSUtil(int k,boolean visited[])
    {
        visited[k]=true;
        System.out.print(k+" ");
        Iterator<Integer> i=adjacencyList[k].listIterator();
        while (i.hasNext())
        {
            int n=i.next();
            if(!visited[n])
            {
                DFSUtil(n,visited);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        depthFirstSearch obj=new depthFirstSearch();
        System.out.println("Enter the number of nodes");
        obj.noOfNodes=in.nextInt();
        System.out.println("Enter the number of edges");
        obj.noOfEdges=in.nextInt();
        obj.adjacencyList=new LinkedList[obj.noOfNodes];
        for(int i=0;i<obj.noOfNodes;i++)
        {
            obj.adjacencyList[i]=new LinkedList<>();
        }
        System.out.println("Enter the adjacency list element");
        for(int j=0;j<obj.noOfEdges;j++)
        {
            obj.adjacencyList[in.nextInt()].add(in.nextInt());
        }
        System.out.println("Enter the source index");
        obj.source=in.nextInt();
        System.out.println("Following is the depth first traversal");
        obj.DFS(obj.source);
    }
}
