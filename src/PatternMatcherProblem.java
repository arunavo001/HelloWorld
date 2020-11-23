import java.io.*;
import java.util.*;
import java.util.regex.*;
public class PatternMatcherProblem
{
    public static Scanner sc = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out, true);
    public static void main(String[] args)
    {
        System.out.println("Enter the string variable : ");
        String s = sc.nextLine();
        Pattern p = Pattern.compile("\\d[aeiou]{2,}[a-z&&[^aeiou]]{3,}(\\d)");
        Matcher match = p.matcher(s);
        int res = 0;
        if (match.find())
        {
            do {
                res++;
            } while (match.find(match.start(1)));
        }
        out.println("Tne number of the matches pattern would be : "+res);
    }
}