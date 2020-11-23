import java.util.Scanner;
public class FirstUniqueCharacterInString
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String str=in.nextLine();
        int index=firstNonRepeating(str);
        System.out.println(index==-1?"-1":"First unique character in the string is : "+str.charAt(index));
    }
    static final int no_of_chars=256;
    static char[] count=new char[no_of_chars];
    static void getCharArray(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
    }
    static int firstNonRepeating(String str)
    {
        getCharArray(str);
        int index=-1;
        int i;
        for(i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)]==1)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}