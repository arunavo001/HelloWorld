import java.util.Arrays;
import java.util.Scanner;
public class AnagramsOfTwoStrings
{
    static void isAnagram(String str1,String str2)
    {
        boolean status=true;
        if(str1.length()!=str2.length())
        {
            status=false;
        }
        else
        {
            char[] ArrayStr1=str1.toLowerCase().toCharArray();
            char[] ArrayStr2=str2.toLowerCase().toCharArray();
            Arrays.sort(ArrayStr1);
            Arrays.sort(ArrayStr2);
            status=Arrays.equals(ArrayStr1,ArrayStr2);
        }
        if(status)
        {
            System.out.println("ANAGRAMS");
        }
        else
        {
            System.out.println("NOT ANAGRAMS");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String str1=sc.nextLine();
        System.out.println("Enter the 2nd string : ");
        String str2=sc.nextLine();
        isAnagram(str1,str2);
    }
}