import java.util.Scanner;
public class maximumValueOfBinaryTree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        System.out.println("Enter the number of nodes: ");
        int size = sc.nextInt();
        if (size == 0)
            System.out.println("-1");
        else if(size<0)
            System.out.println("The number should be greater than zero");
        else
        {
            int[] elementsArr = new int[size];
            System.out.println("Enter the number of the elements in the nodes");
            for(int i=0;i<size;i++)
            {
                elementsArr[i] = sc.nextInt();
            }
            tree.root=tree.insertNode(elementsArr,tree.root,0);
            System.out.println("The maximum value of a binary tree is :"+tree.findMax(tree.root));
        }
    }
}
class NodeForBinarytree {
    int value;
    Node left;
    Node right;

    NodeForBinarytree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {
    Node root;

    BinaryTree()
    {
        root = null;
    }
    public Node insertNode(int[] elementsArr, Node node, int i)
    {
        if (i < elementsArr.length)
        {
            node = new Node(elementsArr[i]);
            node.left = insertNode(elementsArr, node.left, 2 * i + 1);
            node.right = insertNode(elementsArr, node.right, 2 * i + 2);
        }
        return node;
    }
    public int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;
        int res = node.value;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
}
