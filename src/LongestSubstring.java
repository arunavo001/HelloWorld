import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LongestSubstring
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String str = s.nextLine();
        System.out.println("Longest distinct substring is : "+longestDistinctSubstring(str));
    }

    private static String longestDistinctSubstring(String str)
    {
        Map<Character,Integer> visited=new HashMap<>();
        String output="";
        for(int start=0,end=0;end<str.length();end++)
        {
            char currentChar=str.charAt(end);
            if(visited.containsKey(currentChar))
            {
                start=Math.max(visited.get(currentChar)+1,start);
            }
            if(output.length()<end-start+1)
            {
                output=str.substring(start,end+1);
            }
            visited.put(currentChar,end);
        }
        return output;
    }
}