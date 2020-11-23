public class FillMatrixToGetMaximumElementOfItsNeighbours
{
    public static void main(String[] args)
    {
        int matrix[][]=new int[4][4];
        int i,j;
        /* Updating first column */
        for(i=0;i<matrix.length;i++)
        {
            matrix[i][0]=i;
        }
        /* Updating first row */
        for(j=0;j<matrix[0].length;j++)
        {
            matrix[0][j]=j;
        }
        /* Loop to update the above matrix such that each cell is max of it's neighbouring cell
        * and store the results in the matrix itself */
        for(i=1;i<matrix.length;i++)
        {
            for(j=1;j<matrix[0].length;j++)
            {
                matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);
            }
        }
        /* Printing 2D matrix */
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println('\n');
        }
    }
}