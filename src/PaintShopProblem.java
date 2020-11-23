import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PaintShopProblem
{
    public static int ad=300,ef=700,dis=200,manp=500;
    public static double priceQuote(int a,int b,int c,int d)
    {
        double x;
        if (a==1)
        {
            x=b*ad+c*d*manp;
            return x;
        }
        else if (a==2)
        {
            x=b*ef+c*d*manp;
            return x;
        }
        else if (a==3)
        {
            x=b*dis+c*d*manp;
            return x;
        }
        else
        {
            System.out.println("Item is not found");
            x=-1.0;
            return x;
        }
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d;
        double v;
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        d=Integer.parseInt(in.readLine());
        v=priceQuote(a,b,c,d);
        int u=(int)v;
        System.out.println(u);
    }
}