import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class medianOfSteamOfInteger
{
    void printMedians(int array[],int n)
    {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b)
            {
                return b-a;
            }
        });
        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
        double med= array[0];
        maxHeap.add(array[0]);
        System.out.println(med);
        for(int i=1;i<n;i++)
        {
            int x=array[i];
            if(maxHeap.size()>minHeap.size())
            {
                if(x<med)
                {
                    minHeap.add(maxHeap.peek());
                    maxHeap.poll();
                    maxHeap.add(x);
                }
                else
                {
                    minHeap.add(x);
                }
                med=(maxHeap.peek()+ minHeap.peek())/2.0;
            }
            else if(maxHeap.size()==minHeap.size())
            {
                if(x<med)
                {
                    maxHeap.add(x);
                    med=(double)maxHeap.peek();
                }
                else
                {
                    minHeap.add(x);
                    med=(double)minHeap.peek();
                }
            }
            else
            {
                if(x>med)
                {
                    maxHeap.add(minHeap.peek());
                    minHeap.poll();
                    minHeap.add(x);
                }
                else
                {
                    maxHeap.add(x);
                }
                med=(maxHeap.peek()+ minHeap.peek())/2.0;
            }
            System.out.println(med);
        }
    }

    public static void main(String[] args)
    {
        medianOfSteamOfInteger obj=new medianOfSteamOfInteger();
        Scanner in=new Scanner(System.in);
        int array[]=new int[100];
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            array[i]=in.nextInt();
        }
        obj.printMedians(array,n);
    }
}