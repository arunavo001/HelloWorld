import java.util.HashMap;
import java.util.Scanner;
public class MatchLocksAndKeys
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char keys[] = new char[n];
        char locks[] = new char[n];
        for (int i = 0; i < n; i++)
        {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();
        for (int i = 0; i < n; i++)
        {
            locks[i] = in.next(".").charAt(0);
        }
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++)
            hashMap.put(locks[i], i);
        for (int i = 0; i < n; i++)
            if (hashMap.get(keys[i]) != null)
            {
                locks[i] = keys[i];
            } else {
                System.out.println("Not possible");
                return;
            }
        for (int i = 0; i < n; i++)
        {
            System.out.println(locks[i] + " " + keys[i]);
        }
    }
}