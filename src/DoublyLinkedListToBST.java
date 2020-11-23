import java.util.Scanner;
public class DoublyLinkedListToBST
{
    static LLNode head;
    class LLNode
    {
        int data;
        LLNode next, prev;
        LLNode(int d)
        {
            data = d;
            next = prev = null;
        }
    }
    class TreeNode
    {
        int data;
        TreeNode left, right;
        TreeNode(int d)
        {
            data = d;
            left = right = null;
        }
    }
    TreeNode linkedListToBST(int n)
    {
        if(n<=0)
            return null;
        TreeNode left=linkedListToBST(n/2);
        TreeNode root=new TreeNode(head.data);
        root.left=left;
        head=head.next;
        root.right=linkedListToBST(n-n/2-1);
        return root;
    }
    public void push(int new_data)
    {
        LLNode temp=head;
        LLNode new_node=new LLNode(new_data);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_node;
        }
    }
    void printList(LLNode node)
    {
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    void preOrder(TreeNode node)
    {
        if(node==null)
            return;
        System.out.println(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        DoublyLinkedListToBST obj=new DoublyLinkedListToBST();
        System.out.println("Enter the number of employees you want to insert into the linked list :");
        int n=sc.nextInt();
        System.out.println("Enter the each employee's id which you want to provide : ");
        for(int i=0;i<n;i++)
        {
            obj.push(sc.nextInt());
        }
        TreeNode root=obj.linkedListToBST(n);
        System.out.println("The pre order traversal of the BST would be : ");
        obj.preOrder(root);
    }
}