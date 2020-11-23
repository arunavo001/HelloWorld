import java.util.Scanner;
public class Demo1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[]a=new int[10];
        int j=0;
        for (int i=0;i<=a.length-1;i++) {
            a[i] = sc.nextInt();
        }
        int mul=1;
        do {
            mul=mul*a[j];
            j++;
            j++;
        }
        while (j<=a.length-1);
        System.out.print(mul);
    }
}
