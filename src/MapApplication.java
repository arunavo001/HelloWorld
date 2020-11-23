import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;
public class MapApplication
{
    public static Scanner sc = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out, true);
    public static int N = 200005;
    public static class Pair implements Comparable<Pair>
    {
        public Long first;
        public Integer second;
        public Integer third;
        Pair(Long first, Integer second, Integer third)
        {
            this.first = first;
            this.second = second;
            this.third = third;
        }
        public int compareTo(Pair o)
        {
            if (first != o.first)
            {
                if (first > o.first)
                {
                    return 1;
                }
                return -1;
            }
            if (second != o.second)
            {
                if (second > o.second)
                {
                    return 1;
                }
                return -1;
            }
            if (third != o.third)
            {
                if (third > o.third)
                {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
    }
    public static int n, m;
    public static int[] dx = {0, 0, 1, -1};
    public static int[] dy = {1, -1, 0, 0};
    public static long[][] v;
    public static long[][] vis;
    public static long[][] dist;
    public static boolean inrange(long x, long y)
    {
        if (x >= 1 && y >= 1 && x <= n && y <= m)
        {
            return true;
        }
        return false;
    }
    public static void dijikstra()
    {
        TreeSet<Pair> pq = new TreeSet<Pair>();
        int i, j, k, x, y, nx, ny;
        long val;
        pq.add(new Pair(0L, 1, 1));
        dist[1][1] = 0;
        while (!pq.isEmpty())
        {
            Pair temp = pq.pollFirst();
            x = temp.second;
            y = temp.third;
            val = temp.first;
            if (vis[x][y] == 1)
            {
                continue;
            }
            vis[x][y] = 1;
            for (i = 0; i < 4; i++)
            {
                nx = x + dx[i];
                ny = y + dy[i];
                if (inrange(nx, ny) && vis[nx][ny] == 0)
                {
                    if (val + Math.abs(v[nx][ny] - v[x][y]) < dist[nx][ny])
                    {
                        dist[nx][ny] = val + Math.abs(v[nx][ny] - v[x][y]);
                        pq.add(new Pair(dist[nx][ny], nx, ny));
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int i, j, k;
        n = sc.nextInt();
        m = sc.nextInt();
        long tp = 0L;
        v = new long[n + 1][m + 1];
        vis = new long[n + 1][m + 1];
        dist = new long[n + 1][m + 1];
        for (i = 1; i <= n; i++)
        {
            v[i][0] = 0L;
            vis[i][0] = 0L;
            dist[i][0] = (long) 1e16;
            for (j = 1; j <= m; j++)
            {
                k = sc.nextInt();
                v[i][j] = k;
                vis[i][j] = 0L;
                dist[i][j] = (long) 1e16;
                tp++;
            }
        }
        dijikstra();
        out.println(dist[n][m]);
    }
}