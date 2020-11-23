import java.util.Comparator;
import java.util.PriorityQueue;
public class MergeKthSortedList
{
    static class ListNode
    {
        int data;
        ListNode next;
        public ListNode(int data)
        {
            this.data=data;
        }
    }
    static ListNode merge(ListNode[] head)
    {
        ListNode resultHead=null;
        ListNode current=null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>(Comparator.comparingInt(o -> o.data));
        for (ListNode listNode : head) {
            if (listNode != null)
                pq.offer(listNode);
        }
        while (!pq.isEmpty())
        {
            ListNode node=pq.poll();
            if(resultHead==null)
            {
                resultHead=node;
                current=node;
            }
            else
            {
                current.next=node;
                current=current.next;
            }
            if(node.next!=null)
            {
                pq.add(node.next);
            }
        }
        return resultHead;
    }
    static void printList(ListNode node)
    {
        ListNode current=node;
        while (current!=null)
        {
            System.out.print("-->" + current.data);
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        ListNode list1 = new ListNode(1);
        list1.next=new ListNode(5);
        printList(list1);
        ListNode list2=new ListNode(4);
        list2.next=new ListNode(8);
        printList(list2);
        ListNode list3=new ListNode(4);
        list3.next=new ListNode(6);
        list3.next.next=new ListNode(9);
        printList(list3);
        ListNode list4=new ListNode(2);
        list4.next=new ListNode(7);
        list4.next.next=new ListNode(10);
        printList(list4);
        ListNode[] head=new ListNode[]{list1,list2,list3,list4};
        ListNode result=merge(head);
        System.out.println("Merged k linked list is : ");
        printList(result);
    }
}