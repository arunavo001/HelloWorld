import java.util.Stack;
public class PostfixToPrefixConvert
{
    public static boolean isOperator(char x)
    {
        return switch (x) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }
    public static String postToPre(String postfix)
    {
        int l=postfix.length();
        Stack<String> stack=new Stack<>();
        for (int i=0;i<l;i++)
        {
            if(isOperator(postfix.charAt(i)))
            {
                String op1=stack.peek();
                stack.pop();
                String op2=stack.peek();
                stack.pop();
                String temp=postfix.charAt(i)+op2+op1;
                stack.push(temp);
            }
            else
            {
                stack.push(postfix.charAt(i)+"");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args)
    {
        String postfix="ABC/-AK/L-*";
        System.out.println(postToPre(postfix));
    }
}
