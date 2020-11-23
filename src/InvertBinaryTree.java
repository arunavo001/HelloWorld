import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class treeNode3
{
    int data;
    treeNode3 left,right;
    treeNode3(int value)
    {
        data=value;
        left=right=null;
    }
}
public class InvertBinaryTree
{
    public void inorder(treeNode3 node)
    {
        treeNode3 left=node.left;
        treeNode3 right=node.right;
        if (left!=null)
        {
            this.inorder(left);
        }
        System.out.println(node.data);
        if (right!=null)
        {
            this.inorder(right);
        }
    }
    void invertTree(treeNode3 rootNode)
    {
        Queue<treeNode3> q=new LinkedList<>();
        if (rootNode==null)
            return;
        q.add(rootNode);
        while (!q.isEmpty())
        {
            treeNode3 node=q.poll();
            if (node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);
            treeNode3 temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
    }
    treeNode3 rootNode;
    public static void main(String[] args)
    {
        InvertBinaryTree tree=new InvertBinaryTree();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),element;
        Queue<treeNode3> q=new LinkedList<>();
        tree.rootNode=new treeNode3(sc.nextInt());
        q.add(tree.rootNode);
        treeNode3 curr;
        for(int i=1;i<n;i++)
        {
            curr=q.remove();
            element=sc.nextInt();
            if (element!=-1)
            {
                curr.left=new treeNode3(element);
                q.add(curr.left);
            }
            i++;
            element=sc.nextInt();
            if (element!=-1)
            {
                curr.right=new treeNode3(element);
                q.add(curr.right);
            }
        }
        tree.invertTree(tree.rootNode);
        tree.inorder(tree.rootNode);
    }
}