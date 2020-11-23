public class RotateLinkedListByKthNodeClockwise
{
    static class Node
    {
        int data;
        Node next;
    }
    static Node push(Node head_ref,int new_data)
    {
        Node new_node=new Node();
        new_node.data=new_data;
        new_node.next=(head_ref);
        (head_ref)=new_node;
        return head_ref;
    }
    static void printList(Node node)
    {
        while (node!=null)
        {
            System.out.print(node.data+" -> ");
            node=node.next;
        }
        System.out.println("null");
    }
    static Node rightRotate(Node head,int k)
    {
        if(head==null)
            return head;
        Node temp=head;
        int len=1;
        while (temp.next!=null)
        {
            temp=temp.next;
            len++;
        }
        if(k>len)
            k=k%len;
        k=len-k;
        if(k==0 || k==len)
            return head;
        Node current=head;
        int count=1;
        while (count<k && current!=null)
        {
            current=current.next;
            count++;
        }
        if(current==null)
            return head;
        Node kthNode=current;
        temp.next=head;
        head=kthNode.next;
        kthNode.next=null;
        return head;
    }
    public static void main(String[] args)
    {
        Node head=null;
        head=push(head,5);
        head=push(head,4);
        head=push(head,3);
        head=push(head,2);
        head=push(head,1);
        int k=2;
        Node updated_head=rightRotate(head,k);
        printList(updated_head);
    }
}