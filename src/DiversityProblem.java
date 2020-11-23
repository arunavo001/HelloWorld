import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DiversityProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array list which you want to provide : ");
        int n=sc.nextInt();
        ArrayList<Integer> A= new ArrayList<>(n);
        System.out.println("Enter the elements which you want to put inside the array list : ");
        for(int i=0;i<n;i++)
        {
            A.add(i,sc.nextInt());
        }
        Collections.sort(A);
        int last=-1;
        int ans=0;
        for(int v:A)
        {
            int cnd=Math.max(last+1,v-1);
            if(cnd<=v+1)
            {
                last=cnd;
                ans++;
            }
        }
        System.out.println("After the diversity operation Maximum possible numbers of the different values would be : "+ans);
    }
}