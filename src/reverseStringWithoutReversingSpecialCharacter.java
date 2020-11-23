import java.util.Scanner;

public class reverseStringWithoutReversingSpecialCharacter
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String str=in.nextLine();
        char[] charArray=str.toCharArray();
        reverseTheString(charArray);
        String new_string=new String(charArray);
        System.out.println("Reversed the string without changing special character is : "+new_string);
    }
    static void reverseTheString(char[] str)
    {
        int r=str.length-1,l=0;
        while(l<r)
        {
            if(!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;
            else
            {
                char temp=str[l];
                str[l]=str[r];
                str[r]=temp;
                l++;
                r--;
            }
        }
    }
}