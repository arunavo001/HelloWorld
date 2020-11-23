import java.util.Scanner;

public class decimalNumberToRomanNumerals
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=s.nextInt();
        System.out.println("After converting Decimal num to Roman Numeral is : "+romanNumeral(num));
    }
    static String romanNumeral(int num)
    {
        String m[]={"","M","MM","MMM"};
        String c[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String x[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String i[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String thousands=m[num/1000];
        String hundreds=c[(num%1000)/100];
        String tens=x[(num%100)/10];
        String ones=i[num%10];
        String ans=thousands+hundreds+tens+ones;
        return ans;
    }
}