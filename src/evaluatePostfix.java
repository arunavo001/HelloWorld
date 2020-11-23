import java.util.Scanner;
import java.util.Stack;

public class evaluatePostfix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the postfix expression");
        String exp=sc.nextLine();
        System.out.println("Evalution of postfix expression is : "+eveluatePostfix(exp));
    }
    public static int eveluatePostfix(String expression)
    {
        Stack<Integer>stack=new Stack<Integer>();
        for(int i=0;i<expression.length();i++)
        {
            char c = expression.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c - '0');
            }
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c)
                {
                    case'+':
                        stack.push(val2+val1);
                        break;
                    case'-':
                        stack.push(val2-val1);
                        break;
                    case'*':
                        stack.push(val2*val1);
                        break;
                    case'/':
                        stack.push(val2/val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
