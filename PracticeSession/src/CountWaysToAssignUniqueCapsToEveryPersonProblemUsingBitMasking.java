import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;
public class CountWaysToAssignUniqueCapsToEveryPersonProblemUsingBitMasking
{
    static final int MOD=1000000007;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static Vector<Integer> capList[]=new Vector[101];
    static int[][] dp =new int[1025][101];
    static int allMask;
    static long countWaysUtil(int mask,int i)
    {
        if (mask==allMask)
            return 1;
        if (i>100)
            return 0;
        if (dp[mask][i]!=-1)
            return dp[mask][i];
        long ways=countWaysUtil(mask,i+1);
        int size=capList[i].size();
        for (int j=0;j<size;j++)
        {
            if ((mask & (1<<capList[i].get(j)))!=0)continue;
            else ways+=countWaysUtil(mask |(1<<capList[i].get(j)),i+1);
            ways%=MOD;
        }
        return dp[mask][i]=(int)ways;
    }
    static void countWays(int n) throws Exception
    {
        String str;
        String[] split;
        int x;
        for (int i=0;i<n;i++)
        {
            str= br.readLine();
            split=str.split(" ");
            for (String s : split) {
                x = Integer.parseInt(s);
                capList[x].add(i);
            }
        }
        allMask=(1<<n)-1;
        for (int[] is:dp)
        {
            Arrays.fill(is, -1);
        }
        System.out.println(countWaysUtil(0,1));
    }
    public static void main(String[] args) throws Exception
    {
        int n;
        for (int i=0;i<capList.length;i++)
            capList[i]=new Vector<>();
        n=Integer.parseInt(br.readLine());
        countWays(n);
    }
}