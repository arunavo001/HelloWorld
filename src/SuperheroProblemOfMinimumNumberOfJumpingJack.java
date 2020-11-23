import java.util.Scanner;
public class SuperheroProblemOfMinimumNumberOfJumpingJack
{
    public static int minJump(int n)
    {
        int f[]=new int[n+1];
        f[1]=0;
        for(int i=2;i<=n;i++)
        {
            if(i%2==0 && i%3==0)
            {
                f[i]=(Math.min(Math.min(f[i-1]+1,f[i/2]+1),f[i/3]+1));
            }
            if(i%2==0)
            {
                f[i]=Math.min(f[i-1]+1,f[i/2]+1);
            }
            else if(i%3==0)
            {
                f[i]=Math.min(f[i-1]+1,f[i/3]+1);
            }
            else
            {
                f[i]=f[i-1]+1;
            }
        }
        return f[n];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the distance : ");
        int distance=sc.nextInt();
        System.out.println("Minimum jump is required to complete the distance is : "+minJump(distance));
    }
}