import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();
        char c= kthNonRepeatingCharacter(str, k);
        System.out.println(c);
    }
    static char kthNonRepeatingCharacter(String str, int k)
    {
        char[] array = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : array) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char c : array) {
            if (map.get(c) == 1) {
                k--;
            }
            if (k == 0) {
                return c;
            }
        }
        return 0;
    }
}