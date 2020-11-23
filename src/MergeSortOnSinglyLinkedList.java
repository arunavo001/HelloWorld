import java.util.Scanner;

public class MergeSortOnSinglyLinkedList
{
    Node head=null;
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    Node sortedMerge(Node h1,Node h2)
    {
        Node finalList=null;
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        if(h1.data<=h2.data)
        {
            finalList=h1;
            finalList.next=sortedMerge(h1.next,h2);
        }
        else
        {
            finalList=h2;
            finalList.next=sortedMerge(h1,h2.next);
        }
        return finalList;
    }
    Node mergeSort(Node h)
    {
        if(h==null)
        {
            System.out.println("Invalid Input");
            return h;
        }
        else if (h.next==null)
        {
            return h;
        }
        else
        {
            Node middle=findMiddle(h);
            Node nextOfMiddle=middle.next;
            middle.next=null;
            Node left=mergeSort(h);
            Node right=mergeSort(nextOfMiddle);
            Node sortedList=sortedMerge(left,right);
            return sortedList;
        }
    }
    Node findMiddle(Node h)
    {
        if(h==null)
            return h;
        Node fastptr=h.next;
        Node slowptr=h;
        while (fastptr!=null)
        {
            fastptr=fastptr.next;
            if(fastptr!=null)
            {
                slowptr=slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }
    public void push(int new_data)
    {
        Node temp=head;
        Node new_node=new Node(new_data);
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
    void printList()
    {
        Node tNode=head;
        while (tNode!=null)
        {
            System.out.print(tNode.data+" ");
            tNode=tNode.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        MergeSortOnSinglyLinkedList obj=new MergeSortOnSinglyLinkedList();
        System.out.println("Enter the number of nodes in the LinkedList : ");
        int no=sc.nextInt();
        System.out.println("Enter the data value of each node in the LinkedList : ");
        for(int i=0;i<no;i++)
        {
            int element=sc.nextInt();
            obj.push(element);
        }
        obj.head=obj.mergeSort(obj.head);
        System.out.println("After doing MergeSort the sorted List is : ");
        obj.printList();
    }
}