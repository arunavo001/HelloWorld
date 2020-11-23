import java.util.Stack;
public class EvaluationOfPostfix
{
    public static int evaluation(String exp)
    {
        Stack<Integer> stack=new Stack<>();
        int l=exp.length();
        for (int i=0;i<l;i++)
        {
            char c=exp.charAt(i);
            if (Character.isDigit(c))
            {
                stack.push(c-'0');
            }
            else
            {
                int op1=stack.pop();
                int op2= stack.pop();
                switch (c) {
                    case '+' -> stack.push(op2 + op1);
                    case '-' -> stack.push(op2 - op1);
                    case '*' -> stack.push(op2 * op1);
                    case '/' -> stack.push(op2 / op1);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args)
    {
        String postfix="723*5+842/-*-";
        System.out.println(evaluation(postfix));
    }
}