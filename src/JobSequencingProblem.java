import java.util.ArrayList;
public class JobSequencingProblem
{
    char id;
    int deadLine, profit;
    public JobSequencingProblem()
    {
    }
    public JobSequencingProblem(char id, int deadLine, int profit)
    {
        this.id = id;
        this.deadLine = deadLine;
        this.profit = profit;
    }
    void printJobScheduling(ArrayList<JobSequencingProblem> arr)
    {
        int n = arr.size();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (arr.get(j).profit < arr.get(j + 1).profit)
                {
                    JobSequencingProblem temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        boolean[] result = new boolean[3];
        char[] job = new char[3];
        for (JobSequencingProblem jobSequencingProblem : arr)
        {
            for (int j = Math.min(3 - 1, jobSequencingProblem.deadLine - 1);
                 j >= 0; j--)
            {
                if (!result[j])
                {
                    result[j] = true;
                    job[j] = jobSequencingProblem.id;
                    break;
                }
            }
        }
        for (char jb : job)
        {
            System.out.print(jb + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        ArrayList<JobSequencingProblem> arr= new ArrayList<>();
        arr.add(new JobSequencingProblem('a',2,100));
        arr.add(new JobSequencingProblem('b',1,19));
        arr.add(new JobSequencingProblem('c',2,27));
        arr.add(new JobSequencingProblem('d',1,25));
        arr.add(new JobSequencingProblem('e',3,15));
        System.out.println("Following is the maximum "+"profit sequence of jobs ");
        JobSequencingProblem job=new JobSequencingProblem();
        job.printJobScheduling(arr);
    }
}