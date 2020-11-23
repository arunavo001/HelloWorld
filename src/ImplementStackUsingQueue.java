import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImplementStackUsingQueue
{
    Queue<Integer> queue = new LinkedList<Integer>();
    void push(int new_data)
    {
        int size = queue.size();
        queue.add(new_data);
        for (int i = 0; i < size; i++)
        {
            int x = queue.remove();
            queue.add(x);
        }
    }
    int Pop()
    {
        if (queue.isEmpty())
        {
            System.out.println("No elements is left");
            System.exit(0);
        }
        int x = queue.remove();
        return x;
    }
    boolean IsEmpty()
    {
        return queue.isEmpty();
    }
    int top()
    {
        if (queue.isEmpty())
        {
            System.out.println("The stack is empty");
            System.exit(0);
        }
        return queue.peek();
    }
    public static void main(String[] args)
    {
        ImplementStackUsingQueue obj=new ImplementStackUsingQueue();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            obj.push(sc.nextInt());
        }
        System.out.println(obj.top());
        obj.Pop();
        System.out.println(obj.top());
    }
}