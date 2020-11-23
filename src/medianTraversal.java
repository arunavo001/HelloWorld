public class medianTraversal
{
    static class Node
    {
        int data;
        Node left, right;
    }
    static Node newNode(int item)
    {
        Node temp = new Node();
        temp.data = item;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    static Node insert(Node node, int key)
    {
        if (node == null) return newNode(key);
        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        return node;
    }
    static int counNodes(Node root)
    {
        Node current, pre;
        int count = 0;
        if (root == null)
            return count;
        current = root;
        while (current != null)
        {
            if (current.left == null)
            {
                count++;
                current = current.right;
            }
            else
            {
                pre = current.left;
                while (pre.right != null &&
                        pre.right != current)
                    pre = pre.right;
                if(pre.right == null)
                {
                    pre.right = current;
                    current = current.left;
                }
                else
                {
                    pre.right = null;
                    count++;
                    current = current.right;
                }
            }
        }
        return count;
    }
    static int findMedian(Node root)
    {
        if (root == null)
            return 0;
        int count = counNodes(root);
        int currCount = 0;
        Node current = root, pre = null, prev = null;
        while (current != null)
        {
            if (current.left == null)
            {
                currCount++;
                if (count % 2 != 0 && currCount == (count+1)/2)
                    return prev.data;
                else if (count % 2 == 0 && currCount == (count/2)+1)
                    return (prev.data + current.data)/2;
                prev = current;
                current = current.right;
            }
            else
            {
                pre = current.left;
                while (pre.right != null && pre.right != current)
                    pre = pre.right;
                if (pre.right == null)
                {
                    pre.right = current;
                    current = current.left;
                }
                else
                {
                    pre.right = null;
                    prev = pre;
                    currCount++;
                    if (count % 2 != 0 && currCount == (count+1)/2 )
                        return current.data;
                    else if (count%2==0 && currCount == (count/2)+1)
                        return (prev.data+current.data)/2;
                    prev = current;
                    current = current.right;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Node root = null;
        root = insert(root,3);
        insert(root, 3);
        insert(root, 2);
        insert(root, 4);
        insert(root, 7);
        insert(root, 6);
        insert(root, 8);
        System.out.println("Median of BST is " + findMedian(root));
    }
}
