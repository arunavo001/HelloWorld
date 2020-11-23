import java.util.Scanner;
public class MinimumPalindromicPartition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String str=sc.nextLine();
        System.out.println("Minimum number of partition is required to make the string as palindrome is : "+findPartition(str));
    }
    private static int findPartition(String str)
    {
        int n=str.length();
        int part[][]=new int[n][n];
        boolean isPalindrome[][]=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            part[i][i]=0;
            isPalindrome[i][i]=true;
        }
        for(int L=2;L<=n;L++)
        {
            for(int i=0;i<n-L+1;i++)
            {
                int j=i+L-1;
                boolean isFastAndLastCheck=str.charAt(i)==str.charAt(j);
                if(L==2)
                {
                    isPalindrome[i][j]=isFastAndLastCheck;
                }
                else
                {
                    isPalindrome[i][j]=(isPalindrome[i+1][j-1]) && isFastAndLastCheck;
                }
                if(isPalindrome[i][j])
                {
                    part[i][j]=0;
                }
                else
                {
                    part[i][j]=Integer.MAX_VALUE;
                    for(int k=i;k<=j-1;k++)
                    {
                        part[i][j]=Math.min(part[i][j],part[i][k]+part[k+1][j]+1);
                    }
                }
            }
        }
        return part[0][n-1];
    }
}
