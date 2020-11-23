import java.util.Stack;
public class PrefixToPostfixConvert
{
    public static boolean isOperator(char x)
    {
        return switch (x) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }
    public static String prefixToPostfix(String prefixExp)
    {
        int len=prefixExp.length();
        Stack<String> stack=new Stack<>();
        for (int i=len-1;i>=0;i--)
        {
            if (isOperator(prefixExp.charAt(i)))
            {
                String op1=stack.peek();
                stack.pop();
                String op2=stack.peek();
                stack.pop();
                String temp=op1+op2+prefixExp.charAt(i);
                stack.push(temp);
            }
            else
            {
                stack.push(prefixExp.charAt(i)+"");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args)
    {
        String prefix_exp="*-A/BC-/AKL";
        System.out.println(prefixToPostfix(prefix_exp));
    }
}