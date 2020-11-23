import java.util.Scanner;
public class LongestPalindromicSubsequence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the string : ");
        String str=sc.nextLine();
        System.out.println("The length of longest palindromic subsequence is : "+longestPalindromicSubsequence(str));
    }
    static int max(int x,int y)
    {
        return (x > y) ? x : y;
    }
    private static int longestPalindromicSubsequence(String str)
    {
        int n=str.length();
        int part[][]=new int[n][n];
        for(int i=0;i<n;i++)
            part[i][i]=1;
        for(int L=2;L<=n;L++)
        {
            for(int i=0;i<n-L+1;i++)
            {
                int j=i+L-1;
                if(str.charAt(i)==str.charAt(j) && L==2)
                    part[i][j]=2;
                else if(str.charAt(i)==str.charAt(j))
                    part[i][j]=part[i+1][j-1]+2;
                else
                {
                    part[i][j]=max(part[i][j-1],part[i+1][j]);
                }
            }
        }
        return part[0][n-1];
    }
}