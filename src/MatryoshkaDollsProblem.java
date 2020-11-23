import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class MatryoshkaDollsProblem
{
    public static void main(String[] args)
    {
        int n;
        TreeMap<Integer, Integer> m = new TreeMap<>();
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x;
            x = s.nextInt();
            Integer val = m.get(x);
            if (val == null)
                val = 0;
            m.put(x, val + 1);
        }
        int ans = 0;
        int l = 1;
        int r = n / 3;
        while (l <= r)
        {
            int mid = (l + r) / 2;
            int cnt = 0;
            for (Map.Entry<Integer, Integer> it : m.entrySet())
            {
                cnt += Math.min(mid, it.getValue());
            }
            if (cnt >= 3 * mid)
            {
                ans = mid;
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
}