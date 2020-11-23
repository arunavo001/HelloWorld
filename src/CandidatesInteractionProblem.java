import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandidatesInteractionProblem
{
    public static void main(String[] args)throws java.lang.Exception, IOException
    {
        candidate_info.A();
        optimal_candidate_list.B();
    }
}
class candidate_info
{
    public static int n,expsal[];
    public static double age[],workex[];
    public static String name[];
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of candidates : ");
        n=Integer.parseInt(obj.readLine());
        name=new String[n];
        age=new double[n];
        workex=new double[n];
        expsal=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the name of the candidate : ");
            name[i]=obj.readLine();
            System.out.println("Enter the age of the candidates in years : ");
            age[i]=Double.parseDouble(obj.readLine());
            System.out.println("Enter the work experience of candidates in years : ");
            workex[i]=Integer.parseInt(obj.readLine());
        }
    }
    static void A()
    {
        try {
            candidate_info.main(null);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class optimal_candidate_list extends candidate_info
{
    public static void main(String[] args)
    {
        candidate_info ob=new candidate_info();
        int n=ob.n;
        String names[]=new String[n];
        int c=0;
        for (int i=0;i<n;i++)
        {
            if ((ob.age[i]>=25.0) && (ob.age[i]<=30.0) && (ob.workex[i]>=1.0))
            {
                names[c]=ob.name[i];
                c++;
            }
        }
        for (int j=0;j<c;j++)
        {
            System.out.println(""+names[j]);
        }
    }
    static void B()
    {
        try {
            optimal_candidate_list.main(null);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}