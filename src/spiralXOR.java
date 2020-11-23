import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Stack;
public class spiralXOR {
    public static int calculateDifference(ArrayList<Integer> parent) {
        int max_ending_here = Integer.MIN_VALUE;
        int max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < parent.size(); i++) {
            if (max_ending_here < 0)
                max_ending_here = parent.get(i);
            else
                max_ending_here += parent.get(i);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

        public static int calculateDifference1(Node root) {
            if (root == null)
                return 0;
            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();
            ArrayList<Integer> arr = new ArrayList<>();
            s1.push(root);
            while (!s1.isEmpty() || !s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    Node temp = s1.pop();
                    arr.add(temp.data);
                    if (temp.right != null)
                        s2.push(temp.right);
                    if (temp.left != null)
                        s2.push(temp.left);
                }
                while (!s2.isEmpty()) {
                    Node temp = s2.pop();
                    arr.add(temp.data);
                    if (temp.left != null)
                        s1.push(temp.left);
                    if (temp.right != null)
                        s1.push(temp.right);
                }
            }
            return calculateDifference(arr);
        }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Node root = new Node(0);
            root.left = new Node(0);
            root.right = new Node(2);
            root.left.left = new Node(2);
            root.left.right = new Node(1);
            root.right.left = new Node(1);
            root.right.right = new Node(0);
            System.out.print(calculateDifference1(root));
        }
    }
}
