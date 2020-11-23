import java.util.Scanner;
public class PrintMatrixInSpiralForm
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] arr=new int[n][m];
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                arr[i][j]=s.nextInt();
        spiral(arr,n,m);
    }
    static void spiral(int[][] arr,int n,int m)
    {
        int startRowInd=0;
        int startColumnInd=0;
        int endRowInd=n-1;
        int endColumnInd=m-1;
        StringBuilder str=new StringBuilder();
        while (startRowInd<=endRowInd && startColumnInd<=endColumnInd)
        {
            for (int i=startColumnInd;i<=endColumnInd;i++)
                str.append(arr[startRowInd][i]).append(" ");
            startRowInd++;
            for (int i=startRowInd;i<=endRowInd;i++)
                str.append(arr[i][endColumnInd]).append(" ");
            endColumnInd--;
            if (startRowInd<=endRowInd)
            {
                for (int i=endColumnInd;i>=startColumnInd;i--)
                    str.append(arr[endRowInd][i]).append(" ");
                endRowInd--;
            }
            if (startColumnInd<=endColumnInd)
            {
                for (int i=endRowInd;i>=startRowInd;i--)
                    str.append(arr[i][startColumnInd]).append(" ");
                startColumnInd++;
            }
        }
        System.out.println(str);
    }
}