import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class treeNode
{
    int data;
    treeNode left;
    treeNode right;
    public treeNode(int element)
    {
        data = element;
        left = null;
        right = null;
    }
}
public class leftViewOfBinaryTree
{
    static treeNode rootNode;
    static int maximumLevel = -1;
    void printLeftView(treeNode currentNode, int currentLevel)
    {
        if (currentNode == null)
        {
            return;
        }
        if (maximumLevel < currentLevel)
        {
            System.out.print(currentNode.data+" ");
            maximumLevel = currentLevel;
        }
        printLeftView(currentNode.left, currentLevel + 1);
        printLeftView(currentNode.right, currentLevel + 1);
    }
    public static void main(String args[])
    {
        leftViewOfBinaryTree tree = new leftViewOfBinaryTree();
        treeNode rootNode;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt(), element;
        Queue<treeNode> q = new LinkedList<treeNode>();
        System.out.println("Enter the elements to be inserted into tree");
        rootNode = new treeNode(in.nextInt());
        q.add(rootNode);
        treeNode cur = null;
        for (int i = 1; i < n; i++)
        {
            cur = q.remove();
            element = in.nextInt();
            if (element != -1)
            {
                cur.left = new treeNode(element);
                q.add(cur.left);
            }
            i++;
            element = in.nextInt();
            if (element != -1)
            {
                cur.right = new treeNode(element);
                q.add(cur.right);
            }
        }
        tree.printLeftView(rootNode, 0);
    }
}
