import java.util.Scanner;
import java.util.Stack;
class implementQueue
{
    Stack<Integer> stack = new Stack<Integer>();
    public void EnQueue(int newData)
    {
        stack.add(newData);
    }
    public void Dequeue()
    {
        if (stack.size() == 0)
        {
            System.out.println("No elements is left");
            return;
        }
        if (stack.size() == 1)
        {
            System.out.println("After this operation the element that is dequeued is : "+stack.pop());
            return;
        }
        int element = stack.pop();
        Dequeue();
        stack.push(element);
    }
}
public class ImplementQueueUsingStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        implementQueue obj = new implementQueue();
        System.out.println("Enter the size of elements you want to insert in the queue : ");
        int n=sc.nextInt();
        System.out.println("Enter each elements which you want to insert in the queue : ");
        for(int i=0;i<n;i++)
        {
            obj.EnQueue(sc.nextInt());
        }
        obj.Dequeue();
        obj.Dequeue();
        obj.Dequeue();
    }
}