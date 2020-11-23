import java.util.Scanner;
public class RemoveDuplicatesFromLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    void noRepeat()
    {
        int flag=0;
        Node temp=head;
        Node store_next;
        if (head==null)
        {
            System.out.println("The list is empty");
        }
        while (true)
        {
            assert temp != null;
            if (temp.next == null) break;
            if (temp.data==temp.next.data)
            {
                flag=1;
                store_next=temp.next.next;
                temp.next=null;
                temp.next=store_next;
            }
            else
            {
                temp=temp.next;
            }
        }
        if (flag==0)
        {
            System.out.println("All elements in the list exist uniquely");
        }
        else
        {
            print_List();
        }
    }
    public void insert(int new_data)
    {
        Node temp=head;
        Node newNode= new Node(new_data);
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void print_List()
    {
        Node node=head;
        while (node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public static void main(String[] args)
    {
        RemoveDuplicatesFromLinkedList obj=new RemoveDuplicatesFromLinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            obj.insert(sc.nextInt());
        }
        obj.noRepeat();
    }
}