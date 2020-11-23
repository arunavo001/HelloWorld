import java.util.Scanner;
public class GenerateBinaryStringsFromPattern
{
    public static void generation(char[] str,int index)
    {
        if (index== str.length)
        {
            System.out.println(str);
            return;
        }
        if (str[index]=='?')
        {
            str[index]='0';
            generation(str, index+1);
            str[index]='1';
            generation(str, index+1);
            str[index]='?';
        }
        else
        {
            generation(str, index+1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pattern which you want to provide :");
        String input=sc.nextLine();
        char[] str=input.toCharArray();
        generation(str,0);
    }
}