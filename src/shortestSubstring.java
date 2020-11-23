import java.util.Scanner;
public class shortestSubstring
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String str=in.nextLine();
        int n = str.length();
        final int possibleNoOfChars = 256;
        int distinctCharCount = 0;
        boolean[] visitedChars = new boolean[possibleNoOfChars];
        for (int i = 0; i < n; i++)
        {
            if (!visitedChars[str.charAt(i)])
            {
                visitedChars[str.charAt(i)] = true;
                distinctCharCount++;
            }
        }
        int currStartOfWind = 0;
        int startSmallestWind = -1;
        int distinctCountWind = 0;
        int minimumLen = Integer.MAX_VALUE;
        int[] currentCount = new int[possibleNoOfChars];
        for (int j = 0; j < n; j++)
        {
            currentCount[str.charAt(j)]++;
            if (currentCount[str.charAt(j)] == 1)
                distinctCountWind++;
            if (distinctCharCount == distinctCountWind)
            {
                while (currentCount[str.charAt(currStartOfWind)] > 1)
                {
                    if (currentCount[str.charAt(currStartOfWind)] > 1)
                    {
                        currentCount[str.charAt(currStartOfWind)]--;
                    }
                    currStartOfWind++;
                }
                int currentWindowLen = j - currStartOfWind + 1;
                if (currentWindowLen < minimumLen)
                {
                    minimumLen = currentWindowLen;
                    startSmallestWind = currStartOfWind;
                }
            }
        }
        System.out.println("The shortest sub-string is : "+str.substring(startSmallestWind, startSmallestWind + minimumLen));
    }
}