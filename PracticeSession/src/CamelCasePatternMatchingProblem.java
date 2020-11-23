import java.util.*;
public class CamelCasePatternMatchingProblem
{
    static void CamelCase(ArrayList<String> words,String pattern)
    {
        Map<String,List<String>> map=new HashMap<>();
        for (String word : words)
        {
            String str = "";
            int l = word.length();
            for (int j = 0; j < l; j++)
            {
                if (word.charAt(j) >= 'A' && word.charAt(j) <= 'Z')
                {
                    str += word.charAt(j);
                    map.put(str, list(map.get(str), word));
                }
            }
        }
        boolean wordFound=false;
        for (Map.Entry<String,List<String>> it:map.entrySet())
        {
            if (it.getKey().equals(pattern))
            {
                wordFound=true;
                for (String s:it.getValue())
                    System.out.print(s+"\n");
            }
        }
        if (!wordFound)
        {
            System.out.print("No match found");
        }
    }
    private static List<String> list(List<String>list,String str)
    {
        List<String> temp=new ArrayList<>();
        if (list!=null)
            temp.addAll(list);
        temp.add(str);
        return temp;
    }
    public static void main(String[] args)
    {
        String []arr={"Hi","Hello","HelloWorld",
                  "HiTech","HiGeek","HiTechWorld",
                  "HiTechCity","HiTechLab"
        };
        ArrayList<String> words=new ArrayList<>(Arrays.asList(arr));
        String pattern="HT";
        CamelCase(words,pattern);
    }
}