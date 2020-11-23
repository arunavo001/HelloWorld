import java.util.*;
import java.lang.*;
import java.io.*;
public class stringFunction
{
    public static void x(int a, int b)
    {
        int c= a+b;
        System.out.println(""+c);
    }
    public static void x(int a, String b)
    {
        int r=0;
        for (int i=0;i<b.length(); i++)
        {
            char g= b.charAt(i);
            r=r+(int)g;
        }
        int c= a+r;
        System.out.println(""+c);
    }
    public static void x(String a, String b)
    {
        String c = a.concat(b);
        System.out.println(""+c);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        String a, b; int c;
        Scanner input = new Scanner(System.in);
        a = input.next();
        b = input.next();
        c = input.nextInt();
        int y=0, z=0;
        for (int i=0;i<b.length(); i++)
        {
            char s= b.charAt(i);
            z=z+(int)s;
        }
        for (int i=0;i<a.length(); i++)
        {
            char g= a.charAt(i);
            y=y+(int)g;
        }
        switch(c)
        {
            case 1:
                x(z, y);
                break;
            case 2:
                x(a, b);
                break;
            case 3:
                x(z, a);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
