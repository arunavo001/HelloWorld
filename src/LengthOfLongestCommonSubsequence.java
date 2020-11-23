import java.util.Scanner;
public class LengthOfLongestCommonSubsequence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string value : ");
        String str1=sc.nextLine();
        System.out.println("Enter the 2nd string value : ");
        String str2=sc.nextLine();
        System.out.println("Maximum length of the Longest Common Subsequence of two string is : "+findLCS(str1,str2));
    }
    private static int findLCS(String str1, String str2)
    {
        str1=" "+str1;
        str2=" "+str2;
        int M=str1.length();
        int N=str2.length();
        int[][] lcs=new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==0 || j==0)
                {
                    lcs[i][j]=0;
                }
                else
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        lcs[i][j]=lcs[i-1][j-1]+1;
                    }
                    else
                    {
                        lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                    }
                }
            }
        }
        return lcs[M-1][N-1];
    }
}