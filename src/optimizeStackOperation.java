import java.util.Scanner;
public class optimizeStackOperation
{
    class Node
    {
        Node prev;
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }
    class StackNode
    {
        Node head;
        Node mid;
        int count;
    }
    StackNode implementStackUsingLinkedlist()
    {
        StackNode stack = new StackNode();
        stack.count = 0;
        return stack;
    }
    void push(StackNode node, int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.prev=null;
        new_node.next=node.head;
        node.count+=1;
        if(node.count==1)
        {
            node.mid=new_node;
        }
        else
        {
            node.head.prev=new_node;
            if((node.count % 2) != 0)
                node.mid=node.mid.prev;
        }
        node.head=new_node;
    }

    int pop(StackNode stack)
    {
        if(stack.count == 0)
        {
            System.out.println("The Stack is empty");
            return -1;
        }
        Node head = stack.head;
        int item = head.data;
        stack.head = head.next;
        if(stack.head != null)
            stack.head.prev = null;
        stack.count -= 1;
        if(stack.count % 2 == 0)
        {
            stack.mid = stack.mid.next;
        }
        return item;
    }
    int middleElement(StackNode stack)
    {
        if(stack.count == 0)
        {
            System.out.println("The Stack is empty");
            return -1;
        }
        return stack.mid.data;
    }
    public static void main(String args[])
    {
        optimizeStackOperation obj = new optimizeStackOperation();
        StackNode stack = obj.implementStackUsingLinkedlist();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++)
        {
            obj.push(stack, in .nextInt());
        }
        System.out.println(obj.pop(stack) + "");
        System.out.println(obj.middleElement(stack) + "");
    }
}
