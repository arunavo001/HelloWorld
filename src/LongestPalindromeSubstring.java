import java.util.Scanner;
public class LongestPalindromeSubstring
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String str=s.nextLine();
        longestPalindromicSubstring(str);
    }
    private static void longestPalindromicSubstring(String str)
    {
        int left,right,len=str.length(),startIndex=0,maxLength=1;
        for(int i=1;i<len;++i)
        {
            left=i-1;
            right=i;
            while (left>=0 && right<len && str.charAt(left)==str.charAt(right))
            {
                if(right-left+1>maxLength)
                {
                    startIndex=left;
                    maxLength=right-left+1;
                }
                --left;
                ++right;
            }
            left=i-1;
            right=i+1;
            while (left>=0 && right<len && str.charAt(left)==str.charAt(right))
            {
                if(right-left+1>maxLength)
                {
                    startIndex=left;
                    maxLength=right-left+1;
                }
                --left;
                ++right;
            }
        }
        System.out.println("The longest substring palindrome is : "+str.substring(startIndex,startIndex+maxLength));
    }
}

