public class RotateListByKthNode
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    void rotate(int k)
    {
        if(k==0)
            return;
        Node curr=head;
        int count=1;
        while (count<k && curr!=null)
        {
            curr= curr.next;
            count++;
        }
        if(curr==null)
            return;
        Node kthNode=curr;
        while (curr.next!=null)
            curr=curr.next;
        curr.next=head;
        head=kthNode.next;
        kthNode.next=null;
    }
    void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    void printList()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        RotateListByKthNode obj=new RotateListByKthNode();
        for (int i=60;i>=10;i-=10)
            obj.push(i);
        System.out.println("Given List ");
        obj.printList();
        obj.rotate(4);
        System.out.println("Rotated List :");
        obj.printList();
    }
}