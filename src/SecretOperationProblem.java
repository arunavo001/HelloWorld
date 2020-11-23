import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Secret
{
    public static String SwitchBoard(String s,int l)
    {
        String x;
        switch (l) {
            case 0 -> {
                x = Asia(s);
                return (x);
            }
            case 1 -> {
                x = United_states(s);
                return (x);
            }
            case 2 -> {
                x = Dubai(s);
                return (x);
            }
            default -> {
                x = "Invalid Location";
                return (x);
            }
        }
    }
    public static String Asia(String a)
    {
        int i;char c;
        StringBuilder k= new StringBuilder();
        for (i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            if (c=='Y')
            {
                c='A';
                k.append(c);
            }
            else if (c=='y')
            {
                c='a';
                k.append(c);
            }
            else if (c=='z')
            {
                c='b';
                k.append(c);
            }
            else if (c=='Z')
            {
                c='B';
                k.append(c);
            }
            else if (((c>=65) && (c<=90)) || ((c>=97) && (c<=122)))
            {
                int y=(int)c+2;
                k.append((char) y);
            }
            else
            {
                k = new StringBuilder("Invalid Message");
            }
        }
        return k.toString();
    }
    public static String Dubai(String b)
    {
        StringBuilder x= new StringBuilder();
        for (int i=(b.length()-1);i>=0;i--)
        {
            x.append(b.charAt(i));
        }
        return x.toString();
    }
    public static String United_states(String c)
    {
        StringBuilder j= new StringBuilder();
        for (int i=0;i<c.length();i++)
        {
            char t=c.charAt(i);
            String n=Integer.toString(t);
            j.append(n).append(".");
        }
        StringBuilder L= new StringBuilder(" ");
        for (int i=0;i<(j.length()-1);i++)
        {
            L.append(j.charAt(i));
        }
        return L.toString();
    }
}
public class SecretOperationProblem extends Secret
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String r;
        System.out.println("Enter the number of the queries : ");
        int n=Integer.parseInt(sc.readLine());
        String[] s =new String[n];
        int[] l =new int[n];
        String[] t =new String[n];
        int i;
        for (i=0;i<n;i++)
        {
            s[i]=sc.readLine();
        }
        for (i=0;i<n;i++)
        {
            l[i]=Integer.parseInt(sc.readLine());
        }
        for (i=0;i<n;i++)
        {
            r=SwitchBoard(s[i],l[i]);
            t[i]=r;
        }
        for (i=0;i<n;i++)
        {
            System.out.println(""+t[i]);
        }
    }
}