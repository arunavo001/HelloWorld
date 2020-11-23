import java.util.Scanner;

public class minimumLengthOfString2ThatContainsAllCharactersOfString1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string value : ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string value : ");
        String str2=sc.nextLine();
        System.out.println("Minimum length of string 2 that contains all the characters of string 1 is : "+check(str1,str2));
    }
    private static boolean contains(int[ ]sCount,int [] pCount)
    {
        for(int i=0;i<256;i++)
        {
            if(pCount[i]>sCount[i])
                return false;
        }
        return true;
    }
    private static  int check(String p,String s)
    {
        if(p.length()>s.length())
            return -1;
        int[] pCount=new int[256];
        int[] sCount=new int[256];
        for(int i=0;i<p.length();i++)
        {
            pCount[(int)(p.charAt(i))]++;
            sCount[(int)(s.charAt(i))]++;
        }
        int i=0;
        int j=p.length();
        int min=Integer.MAX_VALUE;
        String res=null;
        while (j<s.length())
        {
            if(contains(sCount,pCount))
            {
                if((j-i)<min)
                {
                    min=j-i;
                    res=s.substring(i,j);
                    if(min==p.length())
                        break;
                    sCount[(int)(s.charAt(i))]--;
                    i++;
                }
            }
            else
            {
                sCount[(int)(s.charAt(j))]++;
                j++;
            }
        }
        return res.length();
    }
}