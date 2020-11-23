import java.util.Scanner;
import java.util.Queue;
import  java.util.LinkedList;
class treeNode1
{
    int key;
    treeNode1 left;
    treeNode1 right;
    treeNode1(int value)
    {
        key = value;
        left = null;
        right = null;
    }
}
public class checkForSymmetricTree
{
    private static treeNode1 rootNode;
    static boolean isMirror(treeNode1 node1, treeNode1 node2)
    {
        if (node1 == null && node2 == null)
            return true;
        if (node1 != null && node2 != null && node1.key == node2.key)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));
        return false;
    }
    static boolean isSymmetric(treeNode1 node)
    {
        return isMirror(rootNode, rootNode);
    }
    public static void main(String[] args)
    {
        checkForSymmetricTree binaryTree = new checkForSymmetricTree();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), element;
        Queue<treeNode1> q = new LinkedList<>();
        binaryTree.rootNode = new treeNode1(in.nextInt());
        final var add = q.add(binaryTree.rootNode);
        treeNode1 cur = null;
        for (int i = 1; i < n; i++)
        {
            cur = q.remove();
                //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1)
            {
                cur.left = new treeNode1(element);
                q.add(cur.left);
            }
            i++;
                //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1)
            {
                cur.right = new treeNode1(element);
                q.add(cur.right);
            }
        }
        if(binaryTree.isSymmetric(rootNode))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
