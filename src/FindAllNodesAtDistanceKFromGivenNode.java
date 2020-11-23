import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class treeNode2
{
    int data;
    treeNode2 left;
    treeNode2 right;
    treeNode2(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}
class FindAllNodesAtDistanceFromGivenNode
{
    treeNode rootNode;
    int allNodesAtDist(treeNode node, treeNode targetNode, int distance)
    {
        if (node == null)
            return -1;
        if (node == targetNode)
        {
            belowNodesAtDist(node, distance);
            return 0;
        }
        int distanceInLS = allNodesAtDist(node.left, targetNode, distance);
        if (distanceInLS != -1)
        {
            if (distanceInLS + 1 == distance)
            {
                System.out.print(node.data);
                System.out.println("");
            }
            else
                belowNodesAtDist(node.right, distance - distanceInLS - 2);
            return 1 + distanceInLS;
        }
        int dr = allNodesAtDist(node.right, targetNode, distance);
        if (dr != -1)
        {
            if (dr + 1 == distance)
            {
                System.out.print(node.data);
                System.out.println("");
            }
            else
                belowNodesAtDist(node.left, distance - dr - 2);
            return 1 + dr;
        }
        return -1;
    }
    void belowNodesAtDist(treeNode node, int distance)
    {
        if (node == null || distance < 0)
            return;
        if (distance == 0)
        {
            System.out.print(node.data);
            System.out.println("");
            return;
        }
        belowNodesAtDist(node.left, distance - 1);
        belowNodesAtDist(node.right, distance - 1);
    }
    public static void main(String args[])
    {
        FindAllNodesAtDistanceFromGivenNode binaryTree = new FindAllNodesAtDistanceFromGivenNode();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements to be inserted in the binary tree : ");
        int n = in.nextInt();
        int element;
        Queue<treeNode> q = new LinkedList<treeNode>();
        System.out.println("Enter the order of the elements inserted by optimizing space into the queue : ");
        binaryTree.rootNode = new treeNode(in.nextInt());
        q.add(binaryTree.rootNode);
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
        treeNode targetNode = binaryTree.rootNode;
        System.out.println("Enter the value of the targeted node : ");
        int value = in.nextInt();
        System.out.println("Enter the value of the distance : ");
        int distance = in.nextInt();
        Queue<treeNode> q2FindTarget = new LinkedList<treeNode>();
        q2FindTarget.add(binaryTree.rootNode);
        while (!q2FindTarget.isEmpty())
        {
            targetNode = q2FindTarget.poll();
            if (targetNode.data == value)
            {
                break;
            }
            if (targetNode.left != null)
            {
                q2FindTarget.add(targetNode.left);
            }
            if (targetNode.right != null)
            {
                q2FindTarget.add(targetNode.right);
            }
        }
        System.out.println("Now the nodes at distance from targeted node is : ");
        binaryTree.allNodesAtDist(binaryTree.rootNode, targetNode, distance);
    }
}