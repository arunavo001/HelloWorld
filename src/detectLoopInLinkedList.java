public class detectLoopInLinkedList
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    static public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static boolean hasLoop(detectLoopInLinkedList myLinkedList)
    {
        Node head = myLinkedList.head;
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while (slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                loop = true;
                break;
            }
        }
        return loop;
    }
}
