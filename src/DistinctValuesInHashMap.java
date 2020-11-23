import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctValuesInHashMap
{
    public static void printValues(Map<Integer,String> map)
    {
        HashMap<String,Integer> h=new HashMap<>();
        String value;
        for(int i:map.keySet())
        {
            value=map.get(i);
            if (h.get(value)==null)
                h.put(value,i);
        }
        for (String s: h.keySet())
        {
            System.out.print(s+" ");
        }
    }
    public static void main(String[] args)
    {
        Map<Integer,String> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int key;
        String value;
        for (int i=1;i<=num;i++)
        {
            key=sc.nextInt();
            value=sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}