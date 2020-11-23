import java.util.*;
import java.util.LinkedList;
public class TopologicalSortOfGraph
{
    public LinkedList<Integer>[] adjacencyList;
    void topologicalSort(int node, Boolean[] visitedNodes, Stack<Integer> stk)
    {
        visitedNodes[node]=true;
        Integer i;
        for (Integer integer : adjacencyList[node]) {
            i = integer;
            if (!visitedNodes[i]) {
                topologicalSort(i, visitedNodes, stk);
            }
        }
        stk.push(node);
    }
    ArrayList<Integer> returnTopologicalSort(int noOfNodes)
    {
        Stack<Integer> stk= new Stack<>();
        Boolean[] visitedNodes =new Boolean[noOfNodes];
        for (int i=0;i<noOfNodes;i++)
        {
            visitedNodes[i]=false;
        }
        for (int i=0;i<noOfNodes;i++)
        {
            if (!visitedNodes[i])
            {
                topologicalSort(i,visitedNodes,stk);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while (!stk.empty())
        {
            list.add(stk.pop());
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TopologicalSortOfGraph obj=new TopologicalSortOfGraph();
        int noOfNodes=sc.nextInt();
        int noOfEdges= sc.nextInt();
        obj.adjacencyList=new LinkedList[noOfNodes];
        for (int i=0;i<noOfNodes;++i)
        {
            obj.adjacencyList[i]=new LinkedList<>();
        }
        for (int i=0;i<noOfEdges;++i)
        {
            obj.adjacencyList[sc.nextInt()].add(sc.nextInt());
        }
        ArrayList<Integer> list=obj.returnTopologicalSort(noOfNodes);
        int k;
        Boolean[] visited =new Boolean[noOfNodes];
        for (int i=0;i<noOfNodes;i++)
        {
            visited[i]=false;
        }
        for (int i:list)
        {
            visited[i]=true;
            for (Integer integer : obj.adjacencyList[i]) {
                k = integer;
                if (visited[k]) {
                    System.out.println("Wrong");
                    return;
                }
            }
        }
        System.out.println("Correct");
    }
}