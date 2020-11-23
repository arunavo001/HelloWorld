import java.util.Scanner;

public class NumbersInWordsProblem
{
    public static String toWord(int number)
    {
        String words="";
        String unitsArray[]={
                " Zero "," one "," two "," three "," four "," five "," six ",
                " seven "," eight "," nine "," ten "," eleven "," twelve ",
                " thirteen "," fourteen "," fifteen "," sixteen "," seventeen ",
                " eighteen "," nineteen "};
        String tensArray[]={" Zero "," ten "," twenty "," thirty "," forty "," fifty ",
                            " sixty "," seventy "," seventy "," eighty "," ninety "};
        if (number==0)
            return " zero ";
        if ((number/10000000)>0)
        {
            words+=toWord(number/10000000)+" crore ";
            number%=10000000;
        }
        if ((number/100000)>0)
        {
            words+=toWord(number/100000)+" lakh ";
            number&=100000;
        }
        if ((number/1000)>0)
        {
            words+=toWord(number/1000)+" thousand ";
            number%=1000;
        }
        if ((number/100)>0)
        {
            words+=toWord(number/100)+" hundred ";
            number%=100;
        }
        if (number>0)
        {
            if (number<20)
            {
                words+=unitsArray[number];
            }
            else
            {
                words+=tensArray[number/10];
                if ((number%10)>0)
                {
                    words+="-"+unitsArray[number%10];
                }
            }
        }
        return words;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number which you want to print it in a words : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(toWord(n));
    }
}