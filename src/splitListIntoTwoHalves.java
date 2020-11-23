import java.util.Scanner;
class splitIntoTwoHalves {
    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    public static void splitList(Node head, Node head1_ref, Node head2_ref) {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head == null)
            return;
        while (fast_ptr.next != head && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        if (fast_ptr.next.next == head)
            fast_ptr = fast_ptr.next;
        head1_ref = head;
        if (head.next != head)
            head2_ref = slow_ptr.next;
        fast_ptr.next = slow_ptr.next;
        slow_ptr.next = head;
    }

    public static void push(Node head_ref, int data) {
        Node ptr1 = new Node(data);
        Node temp = head_ref;
        ptr1.data = data;
        ptr1.next = head_ref;
        if (head_ref != null) {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        } else
            ptr1.next = ptr1;
        head_ref = ptr1;
    }

    public static  void printList(Node head) {
        Node temp = head;
        if (head != null) {
            System.out.println("Invalid");
            do {
                System.out.println(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        int list_size, i;
        Node head = null;
        Node head1 = null;
        Node head2 = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            push(head, n);
        }
        printList(head);
        splitList(head, head1, head2);
        printList(head1);
        System.out.println("");
        printList(head2);
    }
}