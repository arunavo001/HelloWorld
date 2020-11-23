import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AntimatterSimulationProblem
{
    private static int n;
    private static int ans;
    private static ArrayList<Integer> v = new ArrayList<>();
    private static void solve(ArrayList<Integer> v)
    {
        if (v.size() == 1)
        {
            ans = Math.min(ans, v.get(0));
        }
        else
        {
            int i;
            int j;
            int k;
            Collections.sort(v);
            int lft;
            int rght;
            int mi = new Double(1e18).intValue();
            int len = v.size();
            lft = rght = -1;
            for (i = 1; i < v.size(); i++)
            {
                int val = v.get(len - i);
                int rg = len - i;
                for (rg = len - 1 - i; rg >= 0; rg--)
                {
                    int req = Math.min(val, v.get(rg));
                    if (req > Math.abs(val - v.get(rg)))
                    {
                        val = Math.abs(val - v.get(rg));
                        if (mi > val)
                        {
                            mi = val;
                            lft = len - i;
                            rght = rg;
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
            if (rght == -1)
            {
                ans = Math.min(ans, v.get(0));
                return;
            }
            ArrayList<Integer> temp = new ArrayList<>();
            for (i = 0; i < rght; i++)
            {
                temp.add(v.get(i));
                ans = Math.min(ans, v.get(i));
            }
            for (i = lft; i < v.size(); i++)
            {
                temp.add(v.get(i));
                ans = Math.min(ans, v.get(i));
            }
            v = new ArrayList<>(temp);
            v.add(mi);
            ans = Math.min(ans, mi);
            solve(new ArrayList<>(v));
        }
    }
    public static void main(String[] args)
    {
        int i;
        int j;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        ans = new Double(1e18).intValue();
        for (i = 1; i <= n; i++)
        {
            j = s.nextInt();
            ans = Math.min(ans, j);
            v.add(j);
        }
        solve(v);
        System.out.print(ans);
    }
}