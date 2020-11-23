import java.util.Scanner;
public class ReverseTheLinkedListUsingRecursiveApproach
{
    Node head;
    static Node temp;
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
    Node recursive(Node current,Node prev)
    {
        if(current==null)
        {
            System.out.println("List is empty ");
            return null;
        }
        if(current.next==null)
        {
            head=current;
            current.next=prev;
            return head;
        }
        Node next1=current.next;
        current.next=prev;
        recursive(next1,current);
        return head;
    }
    public void push(int new_data)
    {
        Node temp=head;
        Node new_node=new Node(new_data);
        if(head==null)
            head=new_node;
        else
        {
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_node;
        }
    }
    public void print()
    {
        Node tnode=head;
        while (tnode!=null)
        {
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ReverseTheLinkedListUsingRecursiveApproach obj=new ReverseTheLinkedListUsingRecursiveApproach();
        System.out.println("Enter the number of elements you want to insert inside the linked list :");
        int n=sc.nextInt();
        System.out.println("Enter the elements which you want to push it into the linked list :");
        for(int i=0;i<n;i++)
        {
            obj.push(sc.nextInt());
        }
        obj.recursive(obj.head,null);
        System.out.println("The reversed linked list would be : ");
        obj.print();
    }
}