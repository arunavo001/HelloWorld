import java.util.Scanner;
/*class NegativeAmountException extends Exception
{
    public NegativeAmountException(String str)
    {
        super(str);
    }
}
class MinBalException extends Exception
{
    public MinBalException(String str1)
    {
        super(str1);
    }
}*/
class underAgeException extends Exception
{
    public underAgeException(String str1)
    {
        super(str1);
    }
}
class overAgeException extends Exception
{
    public overAgeException(String str2)
    {
        super(str2);
    }
}
class HDFC_insurance
{
    int age;
    void collectingInput()
    {
        System.out.println("Connection started in main()");
        System.out.println("Enter the age of person");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
    }
    void checking()
    {
        try{
            if (age>=18 && age <=60)
                System.out.println("Customer is in normal age that is "+age+" so you can apply for normal insurance");
            else if (age<18)
                throw new underAgeException("Customer couldn't apply for normal insurance bcz he is under 18(underage)");
            else
                throw new overAgeException("Customer couldn't apply for normal insurance bcz he is over 60(overage)");
        }
        catch (underAgeException | overAgeException NE)
        {
            System.out.println(NE.getMessage());
        } finally {
            System.out.println("Connection has ended from main()");
        }
    }
}
class HelloABC
{
    public static void main(String[] args)
    {
        HDFC_insurance obj=new HDFC_insurance();
        obj.collectingInput();
        obj.checking();
    }
}
