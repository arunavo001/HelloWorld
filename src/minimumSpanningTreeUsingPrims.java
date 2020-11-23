public class minimumSpanningTreeUsingPrims
{
    static class Graph
    {
        int vertices;
        int matrix[][];
        public Graph(int v)
        {
            this.vertices=v;
            matrix=new int[v][v];
        }
        public void addEdge(int source,int dest,int weight)
        {
            matrix[source][dest]=weight;
            matrix[dest][source]=weight;
        }
        int getMin(boolean[] mst,int[] key)
        {
            int minKey=Integer.MAX_VALUE;
            int vertex=-1;
            for(int i=0;i<vertices;i++)
            {
                if(mst[i]==false && minKey>key[i])
                {
                    minKey=key[i];
                    vertex=i;
                }
            }
            return vertex;
        }
        class Result
        {
            int parent;
            int weight;
        }
        public void prim()
        {
            boolean[] mst=new boolean[vertices];
            Result[] result=new Result[vertices];
            int[] key=new int[vertices];
            for(int i=0;i<vertices;i++)
            {
                key[i]=Integer.MAX_VALUE;
                result[i]=new Result();
            }
            key[0]=0;
            result[0]=new Result();
            result[0].parent=-1;
            for(int i=0;i<vertices;i++)
            {
                int vertex=getMin(mst,key);
                mst[vertex]=true;
                for(int j=0;j<vertices;j++)
                {
                    if(matrix[vertex][j]>0)
                    {
                        if(mst[j]==false && matrix[vertex][j]<key[j])
                        {
                            key[j]=matrix[vertex][j];
                            result[j].parent=vertex;
                            result[j].weight=key[j];
                        }
                    }
                }
            }
            printResult(result);
        }
        public void printResult(Result[] result)
        {
            for(int i=1;i<vertices;i++)
            {
                System.out.println(i+"-"+result[i].parent+":"+result[i].weight);
            }
        }
    }
    public static void main(String[] args)
    {
        int vertices=7;
        Graph graph=new Graph(vertices);
        graph.addEdge(0,1,3);
        graph.addEdge(0,2,7);
        graph.addEdge(1,2,3);
        graph.addEdge(0,3,11);
        graph.addEdge(2,3,4);
        graph.addEdge(1,3,7);
        graph.addEdge(1,4,11);
        graph.addEdge(2,4,3);
        graph.addEdge(3,4,9);
        graph.addEdge(4,5,8);
        graph.addEdge(3,6,2);
        graph.addEdge(4,6,10);
        graph.addEdge(5,6,4);
        graph.prim();
    }
}