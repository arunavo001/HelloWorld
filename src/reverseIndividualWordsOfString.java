import java.util.Scanner;
public class reverseIndividualWordsOfString
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String str=s.nextLine();
        reverseWords(str);
    }
    static void reverseWords(String str)
    {
        String[] words=str.split(" ");
        String reverseString="";
        for(int i=0;i< words.length;i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString=reverseString+reverseWord+" ";
        }
        System.out.println("The reversed word of the whole string is : "+reverseString);
    }
}
