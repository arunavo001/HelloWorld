import java.util.Scanner;
public class AlexaRepeatNumber
{
    public void printNumber(String[] arr,String number)
    {
        if(number.length()>0)
        {
            System.out.print(arr[Integer.parseInt(number.substring(0,1))]+" ");
            printNumber(arr,number.substring(1));
        }
    }
    public static void main(String[] args)
    {
        AlexaRepeatNumber Alexa=new AlexaRepeatNumber();
        String[] numberList={"zero","one","two","three","four","five","six","seven","eight","nine"};
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        Alexa.printNumber(numberList,Integer.toString(num));
    }
}
