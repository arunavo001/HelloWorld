import java.util.Scanner;
public class ActivitySelectionProblem
{
    public static void printMaxActivity(int[]start,int[]finish,int n)
    {
        int i,j;
        System.out.print("Following activities are selected : n ");
        i=0;
        System.out.print(i+" ");
        for(j=1;j<n;j++)
        {
            if(start[j]>=finish[i])
            {
                System.out.print(j+" ");
                i=j;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the starting activity : ");
        int size1=sc.nextInt();
        int[] start=new int[size1];
        System.out.println("Enter the elements which you want to insert in the starting activity : ");
        for(int i=0;i<size1;i++)
        {
            start[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the finishing activity : ");
        int size2=sc.nextInt();
        int[] finish=new int[size2];
        System.out.println("Enter the elements which you want to insert in the finishing activity : ");
        for(int j=0;j<size2;j++)
        {
            finish[j]=sc.nextInt();
        }
        int n= start.length;;
        printMaxActivity(start,finish,n);
    }
}
