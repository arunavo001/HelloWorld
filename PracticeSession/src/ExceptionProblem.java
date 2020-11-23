import java.util.Scanner;
public class ExceptionProblem
{
    public static void main(String[] args)throws Exception {
        System.out.println("Entering main()");
        Demo d=new Demo();
        try {
            d.fun1();
        }
        catch (ArithmeticException e) {
            System.out.println("flow comes back to main()");
            System.out.println("divide by zero is not possible ");
        }
        finally {
            System.out.println("exiting main()");
        }
    }
}
class Demo {
    void fun1() {
        System.out.println("Entering fun1()");
        try {
            fun2();
        }
        catch (Exception e) {
            System.out.println("flow comes back to fun1()");
            System.out.println("problem caught inside fun1() and throwing to it's caller");
            throw e;
        }
        finally {
            System.out.println("Exiting fun1()");
        }
    }
    void fun2() {
        System.out.println("Entering fun2()");
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the 1st number : ");
            int a=sc.nextInt();
            System.out.println("Enter the 2nd number : ");
            int b=sc.nextInt();
            int c;
            c=a/b;
            System.out.println("Result is :"+c);
        }
        catch (Exception e) {
            System.out.println("flow comes back to fun2()");
            System.out.println("problem caught inside fun2() and throwing to it's caller");
            throw e;
        }
        finally {
            System.out.println("Exiting fun2()");
        }
    }
}
