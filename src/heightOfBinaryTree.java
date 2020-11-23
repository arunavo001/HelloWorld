import java.util.*;
  class NodeOfBinarytree
  {
    int data;
    Node left, right;

    NodeOfBinarytree(int value) {
        data = value;
        left = right = null;
    }
  }
  class Tree {
      Node root;

      Tree() {
          root = null;
      }

      public Node insertNode(int[] elementsArr, Node node, int i) {
          if (i < elementsArr.length) {
              node = new Node(elementsArr[i]);
              node.left = insertNode(elementsArr, node.left, 2 * i + 1);
              node.right = insertNode(elementsArr, node.right, 2 * i + 2);
          }
          return node;
      }

      public int findHeight(Node node) {
          if (node == null)
              return 0;
          int leftHeight = 1 + findHeight(node.left);
          int rightHeight = 1 + findHeight(node.right);

          if (leftHeight > rightHeight)
              return leftHeight;
          else
              return rightHeight;
      }
  }
public class heightOfBinaryTree
{
    public static void main(String[] x)
    {
        Tree tree = new Tree();
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the nodes");
        size = sc.nextInt();
        if (size < 0)
        {
            System.out.println("Size should be a positive integer");
        }
        else
        {
            int[] elementsArr = new int[size];
            System.out.println("Enter the number of nodes elements");
            for(int i = 0; i < size; i++)
            {
                elementsArr[i] = sc.nextInt();
            }
            tree.root = tree.insertNode(elementsArr, tree.root, 0);
            System.out.println("The height of the binary tree is : "+tree.findHeight(tree.root));
        }
    }
}