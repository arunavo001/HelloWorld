import java.util.Stack;
public class SortStackByUsingAnotherStack
{
    public static Stack<Integer>SortStack(Stack<Integer> input)
    {
        Stack<Integer> tempStack=new Stack<>();
        while (!input.isEmpty())
        {
            int temp=input.pop();
            while (!tempStack.isEmpty() && tempStack.peek()>temp)
            {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
    public static void main(String[] args)
    {
        Stack<Integer> input=new Stack<>();
        input.add(34);
        input.add(4);
        input.add(24);
        input.add(43);
        input.add(13);
        input.add(22);
        input.add(38);
        input.add(63);
        System.out.println("Input is "+input);
        System.out.println("Sorted stack is "+SortStack(input));
    }
}