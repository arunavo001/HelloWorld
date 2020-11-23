import java.util.Scanner;
public class customCaseOfString
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of the text : ");
        String str=s.nextLine();
        System.out.println("The custom case of the given string is : "+customCase(str));
    }
    private static String customCase(String str)
    {
        str=str.toUpperCase()+" ";
        StringBuilder temp=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                word.append(str.charAt(i));
            }
            else
            {
                if(word.length()>0)
                {
                    temp.append(Character.toLowerCase(word.charAt(0)));
                    temp.append(word.substring(1)+" ");
                }
                else
                {
                    temp.append(" ");
                }
                word=new StringBuilder();
            }
        }
        return temp.toString();
    }
}