import java.util.*;
import java.util.Scanner;
public class AirlineBoardingPassProblem
{
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass=new Hashtable<Integer, String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the boarding pass");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the each boarding pass numbers");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i:arr)
        {
            if(boardingPass.containsKey(i))
            {
                System.out.println(i);
            }
            else
            {
                boardingPass.put(i,"Checked");
            }
        }
    }
}
