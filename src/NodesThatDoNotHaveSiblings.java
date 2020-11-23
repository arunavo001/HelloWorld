import java.util.*;
class Node2
{
    int data;
    Node2 left, right;
    Node2(int value)
    {
        data = value;
        left = right = null;
    }
}
class BinaryTree1
{
    Node2 root;
    BinaryTree1()
    {
        root = null;
    }
    void insert(int key)
    {
        root = insertRec(root, key);
    }
    // A recursive function to insert a new key in BST
    Node2 insertRec(Node2 root, int key)
    {
        if (root == null)
        {
            root = new Node2(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }
    //Function to print nodes that dont have a sibling
    void printSingles(Node2 node)
    {
        if (node == null)
            return;
        if (node.left != null && node.right != null)
        {
            printSingles(node.left);
            printSingles(node.right);
        }
        else if (node.right != null)
        {
            System.out.print(node.right.data + " ");
            printSingles(node.right);
        }
        else if (node.left != null)
        {
            System.out.print( node.left.data + " ");
            printSingles(node.left);
        }
    }
}
// WARNING: Do not edit code below this; failing which your solution may not pass the test case(s)
public class NodesThatDoNotHaveSiblings
{
    public static void main(String[] args)
    {
        BinaryTree1 tree = new BinaryTree1();
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        if(size<= 0)
        {
            System.out.println("Size should be a positive integer");
        }
        else
        {
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++)
            {
                elementsArr[i] = sc.nextInt();
                tree.insert(elementsArr[i]);
            }
            tree.printSingles(tree.root);
        }
    }
}