import java.util.Scanner;
import java.util.Vector;
public class BalancedNodeProblem
{
    private static long dfs(int node, long sum, RefObject<Integer> ans, Vector<Integer>nodeValues)
    {
        long curr=0;
        if(2 * node+1<nodeValues.size())
        {
            curr+=dfs(2 * node+1,sum,ans,nodeValues);
        }
        if(2 * node+2<nodeValues.size())
        {
            curr+=dfs(2 * node+2,sum,ans,nodeValues);
        }
        if(2 * curr==sum-nodeValues.get(node))
        {
            if(ans.argValue==-1)
            {
                ans.argValue=node;
            }
            else if(node<ans.argValue)
            {
                ans.argValue=node;
            }
        }
        return curr+nodeValues.get(node);
    }
    private static int findBalancedNode(Vector<Integer> nodeValues)
    {
        int ans=-1;
        long sum=0;
        for(int it:nodeValues)
        {
            sum+=it;
        }
        RefObject<Integer> tempRef_ans=new RefObject<>(ans);
        dfs(0,sum,tempRef_ans,nodeValues);
        ans=tempRef_ans.argValue;
        return ans;
    }
    private static Vector<Integer> nodeValues=new Vector<>();
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        nodeValues=new Vector<Integer>(n);
        for (i=0;i<n;i++)
        {
            int x=sc.nextInt();
            nodeValues.add(i,x);
        }
        System.out.println(findBalancedNode(nodeValues));
    }
}
class RefObject<T>
{
    public T argValue;
    public RefObject(T refArg)
    {
        argValue = refArg;
    }
}
