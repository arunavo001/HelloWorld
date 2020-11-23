import java.util.Scanner;
import java.util.Vector;
public class GroupOfNumbers
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the elements you want to insert : ");
        n=sc.nextInt();
        Vector<Boolean> a= new Vector<>(105);
        for(int i=0;i<105;i++)
        {
            a.add(false);
        }
        System.out.println("Enter the elements which you want to insert inside the map :");
        while ((n--)!=0)
        {
            int x=sc.nextInt();
            a.set(x,true);
        }
        int ans=0;
        for(int i=1;i<=100;i++)
        {
            if(a.get(i))
            {
                ans++;
                for(int j=i;j<=100;j+=i)
                {
                    a.set(j,false);
                }
            }
        }
        System.out.println("Minimum possible no of groups can be formed is : " +ans);
    }
}