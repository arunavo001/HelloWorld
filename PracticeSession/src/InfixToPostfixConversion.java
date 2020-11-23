import java.util.Scanner;
import java.util.Stack;
public class InfixToPostfixConversion
{
    static int precedence(char ch)
    {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
    static String infixToPost(String str)
    {
        StringBuilder result= new StringBuilder();
        Stack<Character> stack= new Stack<>();
        for (int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if (Character.isLetterOrDigit(c))
            {
                result.append(c);
            }
            else if (c=='(')
            {
                stack.push(c);
            }
            else if (c==')')
            {
                while (!stack.isEmpty() && stack.peek()!='(')
                {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek()!='(')
                    return "INVALID EXPRESSION";
                else
                    stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && precedence(c)<=precedence(stack.peek()))
                {
                    if (stack.peek()=='(')
                        return "INVALID EXPRESSION";
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
        {
            if (stack.peek()=='(')
                return "INVALID EXPRESSION";
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the expression of the type og string : ");
        String str=sc.nextLine();
        System.out.println(infixToPost(str));
    }
}