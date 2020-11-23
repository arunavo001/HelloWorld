import java.util.Arrays;
import java.util.Scanner;
public class checkTwoStringsAnagrams
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string value : ");
        String str1=sc.nextLine();
        System.out.println("Enter the 2nd string value : ");
        String str2=sc.nextLine();
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        if(areAnagrams(s1,s2))
        {
            System.out.println("Yes, two strings are Anagrams");
        }
        else
        {
            System.out.println("No, two strings are not Anagrams");
        }
    }
    private static boolean areAnagrams(char[] s1, char[] s2)
    {
        int n1=s1.length;
        int n2= s2.length;
        if(n1!=n2)
        {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<n1;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
    }
}