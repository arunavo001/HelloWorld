import java.util.Scanner;
class Node
{
    public Node left;
    public Node right;
    public int value;
    private int data;
    private Node next;

    public Node()
    {
        data=0;
        next=null;
    }
    public Node(int d,Node n)
    {
        this.data=d;
        this.next=n;
    }

    public Node(int i)
    {
    }
    public void setData(int d)
    {
        data=d;
    }
    public  void setNext(Node n)
    {
        next=n;
    }
    public  int getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
}
class LinkedList1
{
    private int size;
    private Node start;
    public LinkedList1()
    {
        size = 0;
        start = null;
    }
    public boolean isEmpty()
    {
        return start == null;
    }

    public void viewList()
    {
        Node temp;
        if (isEmpty())
        {
            System.out.println("List is empty");
        }
        else
        {
            temp = start;
            for (int i = 1; i < size; i++)
            {
                System.out.println(" " + temp.getData());
                temp = temp.getNext();
            }
        }
    }
    public void insertAtFirst(int val)
    {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        start=n;
        size++;
    }
    public void insertAtLast(int val)
    {
        Node n, temp;
        n = new Node();
        n.setData(val);
        temp = start;
        if (temp == null)
        {
            start = n;
        }
        else
        {
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
                temp.setNext(n);
            }
            size++;
        }
    }
    public void insertAtPos(int val, int pos)
    {
        if (pos == 1)
        {
            insertAtFirst(val);
        }
        else if (pos == size + 1)
        {
            insertAtLast(val);
        }
        else if (pos > 1 && pos <= size)
        {
            Node n, temp;
            n = new Node(val, null);
            temp = start;
            for (int i = 1; i < pos - 1; i++)
            {
                temp = temp.getNext();
                n.setNext(temp.getNext());
                temp.setNext(n);
                size++;
            }
        }
        else
        {
            System.out.println("Insertion is not possible at this position" + pos);
        }
    }
    public void deleteAtFirst()
    {
        if (start == null)
        {
            System.out.println("List is already empty");
        }
        else
        {
            start = start.getNext();
            size--;
        }
    }
    public void deleteAtLast() throws java.lang.NullPointerException
    {
        if (start == null)
        {
            System.out.println("List is already empty");
        }
        else if (size == 1)
        {
            start = null;
            size--;
        }
        else
        {
            Node t;
            t = start;
            for (int i = 1; i < size - 1; i++)
            {
                t = t.getNext();
                t.setNext(null);
                size--;
            }
        }
    }
    public void deleteAtPos(int pos)
    {
        if (start == null)
        {
            System.out.println("List is already empty");
        }
        else if (pos < 1 || pos > size)
        {
            System.out.println("Invalid position");
        }
        else if (pos == 1)
        {
            deleteAtFirst();
        }
        else if (pos == size)
        {
            deleteAtLast();
        }
        else
        {
            Node t, t1;
            t = start;
            for (int i = 1; i < pos - 1; i++)
            {
                t = t.getNext();
                t1 = t.getNext();
                t.setNext(t1.getNext());
                size--;
            }
        }
    }
}
public class LinkedList
{
    public static void main(String[] args) throws java.lang.NullPointerException
    {
        Scanner sc = new Scanner(System.in);
        LinkedList1 list=new LinkedList1();
        boolean flag=true;
        while (flag)
        {
            System.out.println();
            System.out.println("1: Add items to the list at start");
            System.out.println("2: Add items to the list at last");
            System.out.println("3: Add items to the list at position");
            System.out.println("4: Delete first item from the list");
            System.out.println("5: Delete last item from the list");
            System.out.println("6: Delete item to the list from position");
            System.out.println("7: View List");
            System.out.println("8: Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            int position,val;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter value of list item");
                    val = sc.nextInt();
                    list.insertAtFirst(val);
                }
                case 2 -> {
                    System.out.println("Enter value of list item");
                    val = sc.nextInt();
                    list.insertAtLast(val);
                }
                case 3 -> {
                    System.out.println("Enter position");
                    position = sc.nextInt();
                    System.out.println("Enter value of last item");
                    val = sc.nextInt();
                    list.insertAtPos(val, position);
                }
                case 4 -> list.deleteAtFirst();
                case 5 -> list.deleteAtLast();
                case 6 -> {
                    System.out.println("Enter position");
                    position = sc.nextInt();
                    list.deleteAtPos(position);
                }
                case 7 -> list.viewList();
                case 8 -> flag = false;
                default -> System.out.println("Invalid choice");
            }
        }
    }
}