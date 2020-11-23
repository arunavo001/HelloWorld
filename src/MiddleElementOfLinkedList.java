import java.util.Scanner;
public class MiddleElementOfLinkedList
{
    static class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            data=value;
            next=null;
        }
    }
    public static Node head=null;
    public static Node last;
    public void Add(int value)
    {
        Node newNode= new Node(value);
        if (head==null)
        {
            head= new Node(value);
            return;
        }
        last=head;
        while (last.next!=null)
        {
            last=last.next;
        }
        last.next=newNode;
    }
    public static void printMiddleElement(Node head)
    {
        Node fast=head,slow=head;
        if (head==null || head.next==null)
        {
            System.out.println("The element doesn't exist ");
        }
        else
        {
            while (fast != null && fast.next != null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.print(slow.data);
        }
    }
    public static void main(String[] args)
    {
        MiddleElementOfLinkedList obj=new MiddleElementOfLinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            obj.Add(sc.nextInt());
        }
        printMiddleElement(head);
    }
}