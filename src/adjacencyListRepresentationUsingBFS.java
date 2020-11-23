import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class adjacencyListRepresentationUsingBFS
{
    private int v;
    private LinkedList<Integer> adj[];
    adjacencyListRepresentationUsingBFS(int v)
    {
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;++i)
        {
            adj[i]=new LinkedList();
        }
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    void BFS(int s)
    {
        boolean visited[]=new boolean[v];
        LinkedList<Integer>queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer>i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        adjacencyListRepresentationUsingBFS g=new adjacencyListRepresentationUsingBFS(7);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,1);
        g.addEdge(2,4);
        g.addEdge(2,5);
        g.addEdge(3,1);
        g.addEdge(3,5);
        g.addEdge(4,2);
        g.addEdge(4,5);
        g.addEdge(4,6);
        g.addEdge(5,3);
        g.addEdge(5,2);
        g.addEdge(5,4);
        g.addEdge(5,6);
        g.addEdge(6,4);
        g.addEdge(6,5);
        System.out.println("Following is the BFS"+"(starting from 3rd index)");
        g.BFS(3);
    }
}
