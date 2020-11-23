import java.util.Arrays;
import java.util.Vector;
public class PrintAllCoPrimePathOfBinaryTree
{
    static class Node
    {
        int key;
        Node left,right;
    }

    static Node newNode(int key)
    {
        Node temp=new Node();
        temp.key=key;
        temp.left=temp.right=null;
        return temp;
    }
    static int N=1000000;
    static Vector<Integer> prime=new Vector<>();
    static void SieveOfEratosthenes()
    {
        boolean []check=new boolean[N+1];
        Arrays.fill(check,true);
        for (int p=2;p*p<=N;p++)
        {
            if (check[p])
            {
                prime.add(p);
                for (int i=p*p;i<=N;i+=p)
                    check[i]=false;
            }
        }
    }
    static boolean isPathCo_Prime(Vector<Integer> path)
    {
        int max=0;
        for (int x:path)
        {
            if (max<x)
            {
                max=x;
            }
        }
        for (int i=0;i*prime.get(i)<=max/2;i++)
        {
            int ct=0;
            for (int x: path)
            {
                if (x%prime.get(i)==0)
                    ct++;
            }
            if (ct>1)
                return false;
        }
        return true;
    }
    static void printCo_PrimePaths(Vector<Integer> path)
    {
        for (int x: path)
            System.out.print(x+" ");
        System.out.println();
    }
    static void findCo_PrimePaths(Node root,Vector<Integer> path)
    {
        if (root==null)
            return;
        path.add(root.key);
        findCo_PrimePaths(root.left,path);
        findCo_PrimePaths(root.right,path);
        if (root.left==null && root.right==null)
        {
            if (isPathCo_Prime(path))
            {
                printCo_PrimePaths(path);
            }
        }
        path.remove(path.size()-1);
    }
    static void printCo_PrimePaths(Node node)
    {
        SieveOfEratosthenes();
        Vector<Integer> path=new Vector<>();
        findCo_PrimePaths(node,path);
    }
    public static void main(String[] args)
    {
        Node root=newNode(10);
        root.left=newNode(48);
        root.right=newNode(3);
        root.right.left=newNode(11);
        root.right.right=newNode(37);
        root.right.left.left=newNode(7);
        root.right.left.right=newNode(29);
        root.right.right.left=newNode(42);
        root.right.right.right=newNode(19);
        root.right.right.right.left=newNode(7);
        printCo_PrimePaths(root);
    }
}