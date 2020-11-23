import java.util.Arrays;
import java.util.Scanner;
public class FractionalKnapsackProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the weights of the items : ");
        int size1=sc.nextInt();
        int[] wt = new int[size1];
        System.out.println("Enter the elements of weights which you want to provide into the array : ");
        for(int i=0;i<size1;i++)
        {
            wt[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the values of the items : ");
        int size2=sc.nextInt();
        int[] val = new int[size2];
        System.out.println("Enter the elements of the values which you want to provide into the array : ");
        for(int j=0;j<size2;j++)
        {
            val[j]=sc.nextInt();
        }
        System.out.println("Enter the maximum capacity of the knapsack : ");
        int capacity = sc.nextInt();
        double maxValue = getMaxValue(wt, val, capacity);
        System.out.println("Maximum value we can obtain inside the knapsack is = " +maxValue);
    }
    private static double getMaxValue(int[] wt, int[] val, int capacity)
    {
        ItemValue[] iVal = new ItemValue[wt.length];
        for (int i = 0; i < wt.length; i++)
        {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }
        Arrays.sort(iVal, (o1, o2) -> o2.cost.compareTo(o1.cost));
        double totalValue = 0d;
        for (ItemValue i : iVal)
        {
            int curWt = (int) i.wt;
            int curVal = (int) i.val;
            if (capacity - curWt >= 0)
            {
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else
            {
                double fraction = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                break;
            }
        }
        return totalValue;
    }
    static class ItemValue
    {
        Double cost;
        double wt, val, ind;
        public ItemValue(int wt, int val, int ind)
        {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = (double) (val / wt);
        }
    }
}