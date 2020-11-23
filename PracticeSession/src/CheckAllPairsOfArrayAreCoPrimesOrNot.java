import java.util.Scanner;
public class CheckAllPairsOfArrayAreCoPrimesOrNot
{
    static boolean allCoPrime(int []A,int n)
    {
        boolean all_coPrime=true;
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (gcd(A[i],A[j])!=1)
                {
                    all_coPrime=false;
                    break;
                }
            }
        }
        return all_coPrime;
    }
    static int gcd(int a,int b)
    {
        if (b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int []A=new int[n];
        System.out.println("Enter the elements which you want to insert into the array : ");
        for (int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int length=A.length;
        if (allCoPrime(A,length))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}