import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LoanCalculatorProblem
{
    public static void netLoan(String f,double d)
    {
        System.out.println(f);
        System.out.println(d);
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        String s[]=new String[n];
        int x[]=new int[n];
        double y[]=new double[n];
        int t[]=new int[n];
        double amt[]=new double[n];
        int i=0;
        for (i=0;i<n;i++)
        {
            s[i]=in.readLine();
            t[i]=Integer.parseInt(in.readLine());
            x[i]=Integer.parseInt(in.readLine());
            y[i]=Integer.parseInt(in.readLine());
        }
        for (i=0;i<n;i++)
        {
            if (t[i]==0)
            {
                amt[i]=x[i]*0.20*y[i]+x[i];
                if (amt[i]<5000000)
                {
                    amt[i]=amt[i];
                }
                else if (amt[i]>5000000)
                {
                    amt[i]=0;
                    amt[i]=x[i]*0.15*y[i]+x[i];
                }
            }
            else if (t[i]==1)
            {
                amt[i]=x[i]*0.15*y[i]+x[i];
                if (amt[i]<5000000) {
                    amt[i]=amt[i];
                } else if (amt[i]>5000000) {
                    amt[i]=0;
                    amt[i]=x[i]*0.10*y[i]+x[i];
                }
            }
            else
            {
                System.out.println("Invalid vehicle type specified");
                amt[i]=-1;
            }
        }
        for (i=0;i<n;i++)
        {
            netLoan(s[i],amt[i]);
        }
    }
}