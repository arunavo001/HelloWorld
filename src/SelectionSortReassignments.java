import java.util.Scanner;
public class SelectionSortReassignments
{
    public static int numAssignments(int[] A)
    {
        int N=A.length;
        int counter=0;
        for (int i=0;i<N;i++)
        {
            for (int j=i+1;j<N;j++)
            {
                if (A[j]<A[i])
                {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for (int j=0;j<N;j++)
        {
            A[j]=sc.nextInt();
        }
        int result=numAssignments(A);
        System.out.print(result);
    }
}