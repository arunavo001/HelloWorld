public class MirrorTreeProblem {
}
class Node1
{
    int data;
    Node left;
    Node right;
    Node1(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
class Tree1
{
    void Mirror(Node node)
    {
        if (node==null)
            return;
        Mirror(node.left);
        Mirror(node.right);
        Node swapNodes=node.left;
        node.left=node.right;
        node.right=swapNodes;
        return;
    }
}