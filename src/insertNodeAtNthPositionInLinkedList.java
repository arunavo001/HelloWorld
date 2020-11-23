import java.util.Scanner;
public class insertNodeAtNthPositionInLinkedList
{
        static Node head;

        static class Node
        {
            int data;
            Node next;

            Node(int n) {
                data = n;
                next = null;
            }

            public Node() {

            }
        }
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            head = null;
            if (n > 0) { head = new Node(s.nextInt());
                Node temp = head;
                for (int i = 1; i < n; i++)
                {
                    temp.next = new Node(s.nextInt());
                    temp = temp.next;
                }
            }
            int k = s.nextInt();
            int index = s.nextInt();
            addAtGivenIndex(k, index);
            while (head != null)
            {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    static Node addAtGivenIndex(int k, int index)
    {
        Node head=null;
        Node node = new Node(k);
        node.next = null;
        if (head == null && index == 0){
            head = node;
        }
        else if(head != null && index == 0){
            node.next = head;
            head = node;
        }
        Node tempCurrentNode = head ;
        Node tempPreviousNode = null;
        int i = 0;
        while (i < index)
        {
            tempPreviousNode =  tempCurrentNode;
            tempCurrentNode = tempCurrentNode.next;
            i = i + 1;
        }
        node.next = tempCurrentNode;
        tempPreviousNode.next = node;
        return head;
    }
}
