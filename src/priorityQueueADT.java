import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class priorityQueueADT {
    public static void PQImplement(int[] arr, int M) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int x : arr) {
            priorityQueue.add(x);
        }
        System.out.println(priorityQueue.peek());
        while (M-- > 0) {
            System.out.println(priorityQueue.poll());
        }
        Iterator itr = priorityQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static int[] getArrayInput(int size, Scanner scanner) {
        int array[] = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int N = scanner.nextInt();
        System.out.println("Enter a positive integer");
        int M = scanner.nextInt();
        int arr[] = getArrayInput(N, scanner);
        PQImplement(arr, M);
    }
}