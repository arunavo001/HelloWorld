import java.util.Scanner;
public class CountSubstringStartAndEndWithCharacter1
{
    public static void main(String[] args)
    {
        CountSubstringStartAndEndWithCharacter1 obj=new CountSubstringStartAndEndWithCharacter1();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String binaryString=in.next();
        char[] str=binaryString.toCharArray();
        int n= str.length;
        System.out.println("The number of substring which start and end with 1 are : "+obj.countSubstring(str,n));
    }

    private static int countSubstring(char[] str, int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(str[i]=='1')
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (str[j] == '1')
                    {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
