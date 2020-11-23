import java.util.Scanner;
public class CrackingCodeProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the string : ");
        String str=sc.next();
        System.out.println("After cracking the code the no of decoding ways is coming : "+noOfDecodingWays(str));
    }
    private static int noOfDecodingWays(String str)
    {
        int n=str.length();
        int[]value=new int[n+1];
        value[0]=1;
        value[1]=1;
        str=""+str;
        for(int i=2;i<=n;i++)
        {
            int num1=Integer.parseInt(str.substring(i-1,i));
            int num2=Integer.parseInt(str.substring(i-2,i));
            if(num1>=1 && num1<=9)
                value[i]=value[i]+value[i-1];
            if(num2>=10 && num2<=26)
                value[i]=value[i]+value[i-2];
        }
        return value[n];
    }
}