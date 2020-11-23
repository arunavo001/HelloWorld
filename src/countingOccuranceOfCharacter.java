import java.util.Arrays;
import java.util.Scanner;
public class countingOccuranceOfCharacter
{
    static final int MAX_CHAR=256;
    static void getChar(String str)
    {
        int count[]=new int[MAX_CHAR];
        int len=str.length();
        for(int i=0;i<len;i++)
            count[str.charAt(i)]++;
        char ch[]=new char[str.length()];
        for(int i=0;i<len;i++)
        {
            ch[i]=str.charAt(i);
            int find=0;
            for(int j=0;j<=i;j++)
            {
                if(str.charAt(i)==ch[j])
                    find++;
            }
            if(find==1)
                System.out.print((str.charAt(i))+""+count[str.charAt(i)]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char charArray[]=str.toCharArray();
        Arrays.sort(charArray);
        getChar(new String(charArray));
    }
}