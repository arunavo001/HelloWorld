import java.util.Scanner;
public class palindromeUsingRecursion
{
    public static  boolean isPalindrome(int number)
    {
        return backend(number,0,number);
    }
    private static  boolean backend(int original, int reversed, int reduced)
    {
        if (reversed==original)
            return  true;
        if(reduced<1)
            return  false;
        return  backend(original,reversed*10+reduced%10,reduced/10);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isPalindrome(num))
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
        sc.close();
    }
}