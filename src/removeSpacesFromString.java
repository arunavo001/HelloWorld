import java.util.Scanner;

public class removeSpacesFromString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String str=sc.nextLine();
        removeSpaces(str);
    }
    static void removeSpaces(String str)
    {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                s.append(str.charAt(i));
            }
        }
        System.out.println("After removing spaces the updated string would be : "+s.toString());
    }
}