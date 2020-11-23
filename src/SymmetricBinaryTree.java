import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class TreeNode
{
    int data;
    TreeNode left,right;
    TreeNode(int value)
    {
        data=value;
        left=right=null;
    }
}
public class SymmetricBinaryTree
{
    TreeNode rootNode;
    public boolean checkIsSymmetric(TreeNode rootNode)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(rootNode.left);
        q.add(rootNode.right);
        while (!q.isEmpty())
        {
            TreeNode one=q.remove();
            TreeNode two=q.remove();
            if (one==null && two==null)
                continue;
            if (one == null || two == null)
                return false;
            if (one.data!= two.data)
                return false;
            q.add(one.left);
            q.add(two.right);
            q.add(one.right);
            q.add(two.left);
        }
        return true;
    }
    public static void main(String[] args)
    {
        SymmetricBinaryTree binaryTree=new SymmetricBinaryTree();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),element;
        Queue<TreeNode> q=new LinkedList<>();
        binaryTree.rootNode=new TreeNode(sc.nextInt());
        q.add(binaryTree.rootNode);
        TreeNode curr;
        for(int i=1;i<n;i++)
        {
            curr=q.remove();
            element=sc.nextInt();
            if (element!=-1)
            {
                curr.left=new TreeNode(element);
                q.add(curr.left);
            }
            i++;
            element=sc.nextInt();
            if(element!=-1)
            {
                curr.right=new TreeNode(element);
                q.add(curr.right);
            }
        }
        if (binaryTree.checkIsSymmetric(binaryTree.rootNode))
            System.out.println("true");
        else
            System.out.println("false");
    }
}