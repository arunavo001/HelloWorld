import java.util.Scanner;
public class ASCIIStringProblem
{
    public static void x(int a,int b)
    {
        int c=a+b;
        System.out.println(""+c);
    }
    public static void x(int a,String b)
    {
        int r=0;
        for (int i=0;i<b.length();i++)
        {
            char g=b.charAt(i);
            r=r+(int)g;
        }
        int c=a+r;
        System.out.println(""+c);
    }
    public static void x(String a,String b)
    {
        String c = a.concat(b);
        System.out.println("" + c);
    }
    public static void main(String[] args) {
        String a,b;
        int c;
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        b=sc.next();
        c=sc.nextInt();
        int y=0,z=0;
        for (int i=0;i<b.length();i++)
        {
            char s=b.charAt(i);
            z=z+(int)s;
        }
        for (int i=0;i<a.length();i++)
        {
            char g=a.charAt(i);
            y=y+(int)g;
        }
        switch (c) {
            case 1 -> x(z, y);
            case 2 -> x(a, b);
            case 3 -> x(z, a);
            default -> System.out.println("Invalid Operation");
        }
    }
}