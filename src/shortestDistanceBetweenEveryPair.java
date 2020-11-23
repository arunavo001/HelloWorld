import java.util.Scanner;

public class shortestDistanceBetweenEveryPair
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        int nodeX,nodeZ,interNodeY;
        int adjacencyMatrix[][]=new int[N][N];
        for(nodeX=0;nodeX<N;nodeX++)
        {
            for (nodeZ = 0; nodeZ < N; nodeZ++)
            {
                adjacencyMatrix[nodeX][nodeZ] = in.nextInt();
            }
        }
        int distanceMatrix[][]=new int[N][N];
        for(nodeX=0;nodeX<N;nodeX++)
        {
            for (nodeZ = 0; nodeZ < N; nodeZ++)
            {
                distanceMatrix[nodeX][nodeZ] = adjacencyMatrix[nodeX][nodeZ];
            }
        }
        for(interNodeY=0;interNodeY<N;interNodeY++)
        {
            for (nodeX = 0; nodeX < N; nodeX++)
            {
                for (nodeZ = 0; nodeZ < N; nodeZ++)
                {
                    if (distanceMatrix[nodeX][nodeZ] > distanceMatrix[nodeX][interNodeY] + distanceMatrix[interNodeY][nodeZ])
                    {
                        distanceMatrix[nodeX][nodeZ] = distanceMatrix[nodeX][interNodeY] + distanceMatrix[interNodeY][nodeZ];
                    }
                }
            }
        }
        for(nodeX=0;nodeX<N;++nodeX)
        {
            for (nodeZ = 0; nodeZ < N; ++nodeZ)
            {
                System.out.print(distanceMatrix[nodeX][nodeZ] + " ");
            }
            System.out.println();
        }
    }
}