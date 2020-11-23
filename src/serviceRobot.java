import java.util.Scanner;
import java.io.*;
public class serviceRobot
{
    public static Scanner sc = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out, true);
    public static int N = 200005;
    public static int[] p = new int[N];
    public static int[] a = new int[N];
    public static void main(String[] args)
    {
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int res = -1;
        for (int i = 1; i <= m; i++)
        {
            int x;
            x = sc.nextInt();
            if (a[x] == 0)
            {
                if (n > 0)
                {
                    n--;
                    a[x]++;
                    p[x]++;
                }
                else
                {
                    res = i;
                    break;
                }
            }
            else
            {
                if (n > 0)
                {
                    n--;
                    a[x]++;
                    p[x]++;
                }
                else
                {
                    boolean can = false;
                    for (int j = 1; j <= 1000; j++)
                    {
                        if (p[j] < p[x] && a[j] >= 2)
                        {
                            can = true;
                            a[x]++;
                            a[j]--;
                            break;
                        }
                    }
                    p[x]++;
                    if (!can)
                    {
                        res = i;
                        break;
                    }
                }
            }
        }
        out.println(res);
    }
}