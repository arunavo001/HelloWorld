import java.util.Arrays;
public class SearchingEmailsInUnsortedArray
{
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};
        String NewEmail="monica.geller@xyz.com";
        findIndex(emails,NewEmail);
    }
    public static void findIndex(String arr[], String t)
    {
        if (arr == null)
        {
            System.out.println("-1");
        }
        int len = arr.length;
        int i = 0;
        while (i < len)
        {
            if (arr[i] == t)
            {
                System.out.println(i);
                break;
            }
            else
            {
                i = i + 1;
            }
        }
    }
}
