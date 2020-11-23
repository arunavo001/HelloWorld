public class adjacencyMatrix
{
    static int matrix[][];
    static int vertex;
    public adjacencyMatrix(int vertex)
    {
        this.vertex=vertex;
        this.matrix=new int[vertex][vertex];
    }
    public void addEdgeToAdjacencyMatrix(int source,int destination)
    {
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    public void printGraph()
    {
        for(int i=0;i<vertex;i++)
        {
            for(int j=0;j<vertex;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        adjacencyMatrix adjacencyMatrix=new adjacencyMatrix(5);
        adjacencyMatrix.addEdgeToAdjacencyMatrix(0,1);
        adjacencyMatrix.addEdgeToAdjacencyMatrix(0,2);
        adjacencyMatrix.addEdgeToAdjacencyMatrix(0,3);
        adjacencyMatrix.addEdgeToAdjacencyMatrix(0,4);
        adjacencyMatrix.addEdgeToAdjacencyMatrix(1,3);
        adjacencyMatrix.addEdgeToAdjacencyMatrix(2,4);
        adjacencyMatrix.printGraph();
    }
}
