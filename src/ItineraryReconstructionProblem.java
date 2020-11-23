import java.util.HashMap;
import java.util.Map;
public class ItineraryReconstructionProblem
{
    public static void main(String[] args)
    {
        Map<String,String> dataSet= new HashMap<>();
        dataSet.put("Mumbai","Kolkata");
        dataSet.put("Chennai","Mumbai");
        dataSet.put("Kolkata","Delhi");
        printResult(dataSet);
    }
    private static void printResult(Map<String, String> dataSet)
    {
        // To store the reverse of the given map
        Map<String,String> reverseMap= new HashMap<>();
        for(Map.Entry<String,String> entry : dataSet.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());
        // Find the starting point at itinerary
        String start=null;
        for(Map.Entry<String,String> entry: dataSet.entrySet())
        {
            if(!reverseMap.containsKey(entry.getKey()))
            {
                start= entry.getKey();
                break;
            }
        }
        // If we couldn't find the starting point,then something wrong in the input
        if(start==null)
        {
            System.out.println("Invalid Input;");
            return;
        }
        // Once we have starting point we simple need to go to next,next of next by using given hashmap
        String to=dataSet.get(start);
        while (to!=null)
        {
            System.out.print(start+"->"+to+", ");
            start=to;
            to=dataSet.get(to);
        }
    }
}