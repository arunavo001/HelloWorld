import java.util.LinkedList;

class BreadthFirstSearch
{
    int vertex;
    LinkedList<Integer>[] adjacencyList;
    BreadthFirstSearch(int vertex)
    {
        this.vertex=vertex;
        adjacencyList=new LinkedList[vertex];
        for(int i=0;i<vertex;++i)
        {
            adjacencyList[i]=new LinkedList<>();
        }
    }
    public void addEdge(int start,int end)
    {
        adjacencyList[start].add(end);
    }
    public void breadthFirstSearch(int s)
    {
        boolean[] visited =new boolean[vertex];
        LinkedList<Integer> queue= new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while(queue.isEmpty())
        {
            s=queue.poll();
            System.out.print(s+" ");
            for (int n : adjacencyList[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        BreadthFirstSearch bfs=new BreadthFirstSearch(8);
        bfs.addEdge(1,5);
        bfs.addEdge(1,2);
        bfs.addEdge(1,4);
        bfs.addEdge(2,1);
        bfs.addEdge(2,3);
        bfs.addEdge(2,6);
        bfs.addEdge(2,7);
        bfs.addEdge(4,1);
        bfs.addEdge(5,1);
        bfs.addEdge(7,2);
        bfs.addEdge(6,2);
        bfs.addEdge(3,2);
        System.out.println("The BFS traversal path is : ");
        bfs.breadthFirstSearch(3);
    }
}
