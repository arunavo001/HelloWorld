import javax.naming.NameClassPair;
import java.util.TreeSet;

public class KthElementOfLL
    {
        public class Node
        {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }
        Node head;
        public int GetNth(int index)
        {
            Node current = head;
            int count = 0;
            while (current != null)
            {
                if (count == index)
                    return current.data;
                count++;
                current = current.next;
            }
            return 0;
        }
        public void push(int new_data)
        {
            Node new_Node = new Node(new_data);
            new_Node.next = head;
            head = new_Node;
        }
        public static void main(String[] args)
        {
            KthElementOfLL ll = new KthElementOfLL();
            ll.push(10);
            ll.push(14);
            ll.push(11);
            ll.push(12);
            ll.push(18);
            System.out.println(ll.GetNth(3));
        }
    }
